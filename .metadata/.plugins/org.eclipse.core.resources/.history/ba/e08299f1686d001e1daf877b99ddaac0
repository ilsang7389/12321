package kr.co.ictedu.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//HelloController는 전에 했던 mvc에선  Model에 해당이 된다.
//DispatcherServlet 란 컨트롤 서블릿이 스프링 컨테이너에 의해서 Model을 주입 받아서 실행
//HandlerMapping 이 요청 사항을 분석 해준다. *****
//이와 같이 @Contorller 를 선언해줘야 DispatcherServlet에 존재하는  스프링 컨테이너가
//참조하는 ict-1-servlet.xml에서 <context:component-scan>방식으로 bean에 등록이됨
@Controller
public class HelloController {

	//HandlerMapping
	//@RequestMapping,@GetMapping,@PostMapping 등이 있다
	// http://localhost:8089/spring/hello<- /hello가 요청값
	@RequestMapping(value = "/hello",method = RequestMethod.GET) //방식으로 get post등 원하는 방식으로 넣어줄 수 있다.
	public ModelAndView myHello(){
		ModelAndView mav = new ModelAndView();
		// ViewResolver에 의해서 view의 위치와 .jsp를 붙혀서 완성한다.
		// DispatcherServlet 전달 하면 응답을 해주는 방식
		mav.setViewName("hello"); //ViewName을 설정
		mav.addObject("msg","<h1>안녕하세요. 나의 첫번쨰 spring MVC입니다</h1>");
		mav.addObject("today","<h2>" + new SimpleDateFormat("yyyy-mm-dd").format(new Date()) + "</h2>");
		return mav;
	}
}
