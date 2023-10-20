package kr.co.ictedu.mvc.controller.json;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.ictedu.mvc.dto.BoardVO;

@Controller
public class JsonDemoController {

	private List<Map<String, String>> useList;

	public JsonDemoController() {
		useList = new ArrayList<Map<String, String>>();
	}

	// board/01/ict
	// ���࿡ ��ȯ���� Object�� ��� Json Ÿ������ �����ϱ� ���ؼ��� pon.xml�� jackson �߰��ϱ�
	@GetMapping("/board/{bnum}/{bid}")
	@ResponseBody
	public BoardVO myBlog(@PathVariable Integer bnum, @PathVariable String bid) {
		BoardVO vo = new BoardVO();
		vo.setBdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		vo.setContent("���� ȣȣȣ");
		vo.setNum(bnum);
		vo.setReip("192.168.0.11");
		vo.setTitle("������ ���� ����" + bnum);
		vo.setWriter(bid);
		
		return vo;
	}

	@GetMapping("/boardJsonList")
	@ResponseBody
	public List<BoardVO> myBlog2() {
		System.out.println("boardJsonList ����!");
		List<BoardVO> list = new ArrayList();

		for (int i = 0; i < 10; i++) {
			BoardVO vo = new BoardVO();
			vo.setBdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			vo.setContent("���� ȣȣȣ");
			vo.setNum(i + 1);
			vo.setReip("192.168.0.11");
			vo.setTitle("������ ���� ����" + i);
			vo.setWriter("��浿");
			System.out.println(vo);
			list.add(vo);

		}
		return list;
	}

	// Ajax�� ����� json������ �ڵ鸵 form ****
	@GetMapping("/ajaxBoard")
	public String ajaxDemoBoard() {
		return "/board/ajaxBoard";
	}

	@PostMapping("/RequestParamDemo")
	@ResponseBody
	public List<Map<String, String>> requestBodyDemo(@RequestBody Map<String, String> param) {
		System.out.println("Test:" + param);
		// Ŭ���̾�Ʈ���� Ajax���۵� �����͸� ������Ŵ
		useList.add(param);
		System.out.println(useList.size() + "�� ����!");
		return useList;
	}
}