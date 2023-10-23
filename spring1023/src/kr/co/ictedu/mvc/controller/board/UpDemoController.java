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
import org.springframework.web.multipart.MultipartFile;

import kr.co.ictedu.mvc.dao.UpBoardDaoInter;
import kr.co.ictedu.mvc.dto.BoardVO;
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
		// 파라미터 테스트
		System.out.println("Title : " + vo.getTitle());
		// Multipartfile 객체에서 이름확인
		MultipartFile mf = vo.getMfile();
		String oriFn = mf.getOriginalFilename();
		System.out.println("oriFn : " + oriFn);

		// 경로 테스트 이미지가 저장할 경로
		String img_path = "resouces\\imgfile";

		// 이클립스상에 저장할 이미지 경로
		String r_path = request.getSession().getServletContext().getRealPath("/");
		System.out.println("r_path: " + r_path);

		long size = mf.getSize();
		String contentType = mf.getContentType();
//		  * contentType의 종류
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
		System.out.println("파일 크기  : " + size);
		System.out.println("파일의 type : " + contentType);

		// 메모리상(임시저장장소)에 파일을 우리가 설정한 경로에 복사하겠다.
		// 이미지가 저장될 경로 만들기
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		System.out.println("FullPath: " + path);

		// 추상경로(이미지를 저장할 경로) File 객체로 생성
		// FIle 클래스의 메서드는 복습을반드시 할 것 할 것 할 것
		File f = new File(path.toString());

		// 임시 메모리에 담긴 즉 업로드한 파일의 값 -> File클래스의 경로로 복사
		try {
			mf.transferTo(f);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Dao 데이터 입력처리
		vo.setImgn(oriFn);
		upBoardDaoInter.upboardAdd(vo);
		return "redirect:upList";
	}

	@RequestMapping("/upList")
	public String upBoardList(Model model, @RequestParam Map<String, String> paramMap) {
		System.out.println("파라미터 출력 : ");
		System.out.println("검색 시 , 링크가 넘어오는 파라미터 출력");
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

		// 3. totalBlock 전체블록 구하기 => 전체페이지 / 보여줄 블록수
		// TotalBlock = 6/5;
		// totalBlock = (int) Math.ceil((double)totalpage/pagePerBlock);
		pageVO.setTotalBlock((int) Math.ceil((double) pageVO.getTotalPage() / pageVO.getPagePerBlock()));
		System.out.println("3. totalBlock : " + pageVO.getTotalBlock());

		// 현재 페이지를 요청할 때 파라미터로 현재 페이지값을 받는다 1~~~~~~ㅜ
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

		// 페이징 테스트
		Map<String, String> map = new HashMap<String, String>();
		map.put("begin", String.valueOf(pageVO.getBeginPerPage()));
		map.put("end", String.valueOf(pageVO.getEndPerPage()));

		// map에 paramMap합치기
		map.putAll(paramMap);
		// 검수
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

		model.addAttribute("startPage", startPage); // 블록 시작페이지값
		model.addAttribute("endPage", endPage);// 블록에 시작페이지값
		model.addAttribute("page", pageVO);// nowPage, pagePerBlock,totalPage
		model.addAttribute("list", list);

		return "updemo/upList";
	}

}
