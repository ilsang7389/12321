package kr.co.ictedu.mvc.controller.ex1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// ModelAndView : ���� �����ϰ� �� �� ControllerServlet ���� View �̸�,��(Forward �϶�) �� ����
// View�̸�, �������� ���� ���� �޶��� ���� ���� �� ����� ����
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dto.MemberDTO;

@Controller
public class Ex1Controller {

	/*
	 * @GetMapping("/memForm") public ModelAndView memForm() { ModelAndView mav =
	 * new ModelAndView("member/memberForm"); // ���� ���̶� ���� ����
	 * mav.setViewName("member/memberForm"); return mav;
	 * 
	 * }
	 */

	// �ܼ��ϰ� �丸 ��ȯ : string
	@GetMapping("/memForm")
	public String memForm() {

		return "member/memberForm";

	}

	// id �ߺ� üũ
	// Model m : View�� ���� �����Ҷ� ��� : mav.addObject
	// �������� idchek?id=xman
	// @RequestMapping(value = "/idchek")
	// HttpServletRequest request �־ �۵� ok ��� �۵� ok
	@GetMapping(value = "/idcheck")
	public String idCheck(Model m, String id) {
		// String id = request.getParameter("id");
		String dbid = "xman";
		if (dbid.equals(id)) {
			m.addAttribute("res", 1);
		} else {
			m.addAttribute("res", 0);
		}
		return "member/idchk";

	}

	// �̸� : ���ϻ�, �������� : ��� ����
	// MemberForm �Էµ� �Ķ���͸� ��� sysout�� ���� �ֿܼ� ����ϰ�
	// Member/success.jsp������ �� �����͸� ���� EL�� ����ϼ���
	@PostMapping(value = "/memberback")
	public String memberIN(Model m, String id, String uname, String pwd, String[] chk) {
		System.out.println("uname :" + uname);
		System.out.println("pwd :" + pwd);
		System.out.println("chk :" + chk);
		System.out.println("id : " + id);

		m.addAttribute("uname", uname);
		m.addAttribute("pwd", pwd);
		m.addAttribute("chk", chk);
		m.addAttribute("id", id);

		return "member/success";
	}
	
	//DTO�� �Ķ���͸� ���ε� �����ش�.
	//form or get
	// name ="�Ķ���� �̸�" == DTO�� property
	@PostMapping(value = "/memberIn")
	public String memberIN(Model m, MemberDTO vo) {
		System.out.println("--------------");
		System.out.println("uname :" + vo.getUname());
		System.out.println("pwd :" + vo.getPwd());
	
		System.out.println("id : " + vo.getId());

		for(String e: vo.getChk()) {
			System.out.println(e);
		}
		m.addAttribute("vo", vo);
	
	

		return "member/success2";
	}


}