package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Tvuser1 {
	public static void main(String[] args) {
ApplicationContext ctx = new GenericXmlApplicationContext("ex1/tv.xml");
	
	TV tv = ctx.getBean("stv",TV.class);
	tv.powerOn();
	tv.powerOff();
	tv.volumeUP();
	tv.volumeDown();
	}

}
