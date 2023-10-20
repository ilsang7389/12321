package exam;

import org.springframework.context.ApplicationContext;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class BeforeAdvice {

	@Autowired
	private LoginTest test;

	@Autowired
	private ApplicationContext context;

	@Before("execution(* exam.SecurityImple.*(..))")
	public void mylogintest()  {
		if (test.isRes() ) {
			System.out.println("�����Ϸ�");
		} else {
			System.out.println("�����Դϴ�");
		}
	}

	@AfterReturning("execution(* exam.SecurityImple.*(..))")
	public void afterLogin() {
	}
}