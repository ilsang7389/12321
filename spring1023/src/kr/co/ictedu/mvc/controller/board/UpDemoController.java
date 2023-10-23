package kr.co.ictedu.mvc.controller.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.co.ictedu.mvc.dao.UpBoardDaoInter;
import kr.co.ictedu.mvc.dto.BoardVO;
import kr.co.ictedu.mvc.dto.FboardDTO;
import kr.co.ictedu.mvc.dto.PageVO;

@Controller
public class UpDemoController {
	@Autowired
	private UpBoardDaoInter upBoardDaoInter;
	@Autowired
	private PageVO pageVO;

	@GetMapping("/upform")
	public String upform() {
		return "updemo/upform";
	}

	// uploadpro
	@PostMapping("/uploadpro")
	public String uplodaFile(Model m, BoardVO vo, HttpServletRequest request) {
		// �Ķ���� �׽�Ʈ
		System.out.println("Title : " + vo.getTitle());
		// Multipartfile ��ü���� �̸�Ȯ��
		MultipartFile mf = vo.getMfile();
		String oriFn = mf.getOriginalFilename();
		System.out.println("oriFn : " + oriFn);

		// ��� �׽�Ʈ �̹����� ������ ���
		String img_path = "resources\\imgfile";

		// ��Ŭ������ ������ �̹��� ���
		String r_path = request.getSession().getServletContext().getRealPath("/");
		System.out.println("r_path: " + r_path);

		long size = mf.getSize();
		String contentType = mf.getContentType();
//		  * contentType�� ����
//
//		  - application/vnd.ms-excel
//
//		  - application/pdf
//
//		  - text/plain
//
//		  - application/haansofthwp
//
//		  - image/jpeg
		System.out.println("���� ũ��  : " + size);
		System.out.println("������ type : " + contentType);

		// �޸𸮻�(�ӽ��������)�� ������ �츮�� ������ ��ο� �����ϰڴ�.
		// �̹����� ����� ��� �����
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		System.out.println("FullPath: " + path);

		// �߻���(�̹����� ������ ���) File ��ü�� ����
		// FIle Ŭ������ �޼���� �������ݵ�� �� �� �� �� �� ��
		File f = new File(path.toString());

		// �ӽ� �޸𸮿� ��� �� ���ε��� ������ �� -> FileŬ������ ��η� ����
		try {
			mf.transferTo(f);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Dao ������ �Է�ó��
		vo.setImgn(oriFn);
		upBoardDaoInter.upboardAdd(vo);
		return "redirect:upList";
	}

	@RequestMapping("/upList")
	public String upBoardList(Model model, @RequestParam Map<String, String> paramMap) {
		System.out.println("�Ķ���� ��� : ");
		System.out.println("�˻� �� , ��ũ�� �Ѿ���� �Ķ���� ���");
		String cPage = paramMap.get("cPage");

		// 1. totalRecord
		pageVO.setTotalRecord(upBoardDaoInter.getTotal());
		int totalRecord = pageVO.getTotalRecord();
		System.out.println("1. TotalRecord : " + totalRecord);

		// 2. totalPage
		// totalRecord/numPerPage
		// = (int) Math.ceil(totalRecord/(double)numPerPage);
		pageVO.setTotalPage((int) Math.ceil(totalRecord / (double) pageVO.getNumPerPage()));
		System.out.println("2. totalPage : " + pageVO.getTotalPage());

		// 3. totalBlock ��ü��� ���ϱ� => ��ü������ / ������ ��ϼ�
		// TotalBlock = 6/5;
		// totalBlock = (int) Math.ceil((double)totalpage/pagePerBlock);
		pageVO.setTotalBlock((int) Math.ceil((double) pageVO.getTotalPage() / pageVO.getPagePerBlock()));
		System.out.println("3. totalBlock : " + pageVO.getTotalBlock());

		// ���� �������� ��û�� �� �Ķ���ͷ� ���� ���������� �޴´� 1~~~~~~��
		System.out.println("4. nowPage : " + pageVO.getNowPage());

		if (cPage != null) {
			pageVO.setNowPage(Integer.parseInt(cPage));
		} else {
			pageVO.setNowPage(1);
		}

		pageVO.setBeginPerPage((pageVO.getNowPage() - 1) * pageVO.getNumPerPage() + 1);
		pageVO.setEndPerPage((pageVO.getBeginPerPage() - 1) + pageVO.getNumPerPage());
		System.out.println("5. beginPerPage : " + pageVO.getBeginPerPage());
		System.out.println("6. endPerPage : " + pageVO.getEndPerPage());

		// ����¡ �׽�Ʈ
		Map<String, String> map = new HashMap<String, String>();
		map.put("begin", String.valueOf(pageVO.getBeginPerPage()));
		map.put("end", String.valueOf(pageVO.getEndPerPage()));

		// map�� paramMap��ġ��
		map.putAll(paramMap);
		// �˼�
		System.out.println("============Map All =========");
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "," + e.getValue());
		}
		List<BoardVO> list = upBoardDaoInter.upboardList(map);
		System.out.println("size : " + list.size());

		int startPage = (int) ((pageVO.getNowPage() - 1) / pageVO.getPagePerBlock()) * pageVO.getPagePerBlock() + 1;
		int endPage = startPage + pageVO.getPagePerBlock() - 1;
		if (endPage > pageVO.getTotalPage()) {
			endPage = pageVO.getTotalPage();
		}
		System.out.println("6. startpage: " + startPage);
		System.out.println("7. endpage: " + endPage);

		model.addAttribute("startPage", startPage); // ��� ������������
		model.addAttribute("endPage", endPage);// ��Ͽ� ������������
		model.addAttribute("page", pageVO);// nowPage, pagePerBlock,totalPage
		model.addAttribute("list", list);

		return "updemo/upList";
	}
	
	@GetMapping("/upboardHit")
	public String upboardHit(int num) {
		upBoardDaoInter.updateHit(num);
		return "redirect:upboardDetail?num=" + num;
	}
	
	@GetMapping("/upboardDetail")
	public String upboardDetail(int num, Model model) {
		BoardVO v = upBoardDaoInter.detailupboard(num);
		model.addAttribute("v", v);
		return "updemo/upDetail";
	}
	

	@GetMapping("/upboardModify")
	public String fboardModify(int num, Model m) {
		BoardVO v = upBoardDaoInter.detailupboard(num);
		m.addAttribute("v", v);
		return "updemo/modify";
	}

	@PostMapping("/upboardUpdate")
	public String fboardUpdate(BoardVO vo) {
		upBoardDaoInter.updateupboard(vo);
		return "redirect:upboardDetail?num="+vo.getNum();
	}
	
	@GetMapping("/upboardlist")
	public String upboarddelete1(int num, BoardVO vo) {
		upBoardDaoInter.deleteupboard(num);
		return "updemo/uplist";
	}

	@PostMapping("upboardDelete")
	@ResponseBody
	public String upboardDelete(Integer num) {
		System.out.println(num);
		upBoardDaoInter.deleteupboard(num); 
		return "redirect:upList";
	}
	
	

}
