package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BizMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("exam/exam.xml");
				BIzService bean = ctx.getBean("bean",BIzService.class);
				bean.securityMethod();
	}

}