package kr.co.ictedu.mvc.controller.main;
//Advice가 적용 될 데모 객체
//공통 관심사항 -> 오늘 날짜를 메서드 실행전에 로그로 출력!
//Advice -> before 로 해야 실행전 로그 출력
//pointcut ->  * kr.co.icteduc.mvc.controller.main.TodayMy*.today*(..)


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayMyAopDemoController {

	@GetMapping(value = "/myprofile")
	public ModelAndView todayProfile() {
		//System.out.println("오늘 날짜 : ");
		ModelAndView mav = new ModelAndView();
		mav.addObject("profile", "나는 스프링의김길동이다!");
		mav.setViewName("today/todayProfile");
		return mav;
	}
	@GetMapping(value = "/todaywork")
	public ModelAndView todaywork() {
		//System.out.println("오늘 날짜 : ");
		ModelAndView mav = new ModelAndView();
		mav.addObject("work", "엄청 쉬운 작업입니다. 날짜를 적용하세요");
		mav.setViewName("today/todaywork");
		return mav;
	}
}
