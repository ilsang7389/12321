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


//�Ϲ����� bean���� Aspect�� ����Ѵ�.
@Component
@Aspect
public class TodayAdvice {

	@Before("execution(* kr.co.ictedu.mvc.controller.main.TodayMy*.today*(..))")
	public void todayBeforeMethod() {
		System.out.println("���� ��¥!!!!!!!!!!");
	}

	// ��������
	// �ش� ���� ������ ���� ��ȯ ���� �޾Ƽ� �ٽ� controller�� �װ��� ��ȯ ���ִ�
	// AfterReturning Advie �� �����Ͻÿ�.
	// ��Ʈ : �ش� �� public ModelAndView todaywork(){
	// , public ModeAndVIew todayProfile(){
	// ���� : After Returning ����
	//��ȯ���� : ModelAndView
	// odel�� ��ȯ�ϴ� ModelAndView ����ä��
	// mav.addObject("today", new SimpleDateFormat("yyyy-Mm-dd").format(new Date()));
	@AfterReturning(pointcut = "execution(* kr.co.ictedu.mvc.controller.main.TodayMy*.today2(..))" , returning = "mav")
	public void todayAfterReturning(JoinPoint jp , ModelAndView mav){
	// Ÿ���� �����Ͻ������� ���� �� ������ ��ȯ�� ModelAndView��
	// view���۵� ��, view�� �̸��� ������ ������
	// adive�� ����
	// was�� service�� ���Խ����ִ� request�� ����
	ServletRequestAttributes sr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	HttpServletRequest request = sr.getRequest();
	mav.addObject("reip",request.getRemoteAddr());
	 mav.addObject("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	 System.out.println(mav);
		
		
		
	}
}