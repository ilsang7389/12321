package kr.co.ictedu.mvc.controller.ex1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// ModelAndView : 모델이 실행하고 난 후 ControllerServlet 에게 View 이름,값(Forward 일때) 을 보냄
// View이름, 동적으로 모델의 값이 달라질 수도 있을 때 사용을 권장
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dto.MemberDTO;

@Controller
public class Ex1Controller {

	/*
	 * @GetMapping("/memForm") public ModelAndView memForm() { ModelAndView mav =
	 * new ModelAndView("member/memberForm"); // 위에 것이랑 같은 동작
	 * mav.setViewName("member/memberForm"); return mav;
	 * 
	 * }
	 */

	// 단순하게 뷰만 반환 : string
	@GetMapping("/memForm")
	public String memForm() {

		return "member/memberForm";

	}

	// id 중복 체크
	// Model m : View로 값을 전달할때 사용 : mav.addObject
	// 여러분이 idchek?id=xman
	// @RequestMapping(value = "/idchek")
	// HttpServletRequest request 있어도 작동 ok 없어도 작동 ok
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

	// 이름 : 윤일상, 제출형식 : 댓글 스샷
	// MemberForm 입력된 파라미터를 모두 sysout로 각각 콘솔에 출력하고
	// Member/success.jsp에서는 이 데이터를 각각 EL로 출력하세요
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
	
	//DTO로 파라미터를 바인딩 시켜준다.
	//form or get
	// name ="파라미터 이름" == DTO의 property
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
