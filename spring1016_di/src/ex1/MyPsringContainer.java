package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyPsringContainer {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1_ref.xml");
				
	MyTestA ref = ctx.getBean("testA", MyTestA.class);
	System.out.println(ref.printUserb());
				
	}
}
