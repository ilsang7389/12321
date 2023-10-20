package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//spring container에 등록된 bean을 getBean()해서 의존성 주입을 구현 함.
		
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/tv.xml");
	
	TV tv = ctx.getBean("ltv",TV.class);
	tv.powerOn();
	tv.powerOff();
	tv.volumeUP();
	tv.volumeDown();
	
	}

}
