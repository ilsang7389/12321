package kr.co.ictedu.mvc.advice;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;


//일반적인 bean으로 Aspect를 등록한다.
@Component
@Aspect
public class TodayAdvice {

	@Before("execution(* kr.co.ictedu.mvc.controller.main.TodayMy*.today*(..))")
	public void todayBeforeMethod() {
		System.out.println("오늘 날짜!!!!!!!!!!");
	}

	// 연습문제
	// 해당 모델이 수행한 후의 반환 값을 받아서 다시 controller로 그값을 반환 해주는
	// AfterReturning Advie 를 정의하시오.
	// 힌트 : 해당 모델 public ModelAndView todaywork(){
	// , public ModeAndVIew todayProfile(){
	// 시점 : After Returning 결정
	//반환값은 : ModelAndView
	// odel이 반환하는 ModelAndView 가로채서
	// mav.addObject("today", new SimpleDateFormat("yyyy-Mm-dd").format(new Date()));
	@AfterReturning(pointcut = "execution(* kr.co.ictedu.mvc.controller.main.TodayMy*.today2(..))" , returning = "mav")
	public void todayAfterReturning(JoinPoint jp , ModelAndView mav){
	// 타겟의 비지니스로직이 수행 된 이후의 반환된 ModelAndView값
	// view전송될 값, view의 이름이 결정된 상태임
	// adive를 적용
	// was가 service에 주입시켜주는 request를 받음
	ServletRequestAttributes sr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	HttpServletRequest request = sr.getRequest();
	mav.addObject("reip",request.getRemoteAddr());
	 mav.addObject("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	 System.out.println(mav);
		
		
		
	}
}
