package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex1.LifeInter;

public class ApplicationContextMain {
	public static void main(String[] args) {
		/*
		 * �⺻ ������ ȣ��======> 
		 * setter ȣ�� 
		 * init ȣ�� ****=> DI(�������� ������)�� �� ������ �ڿ��� �ʱ�ȭ �� �������� ��� �� �� �ִ�.
		 * 
		 */
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/life.xml");
	// 2. getBean�� ���� �� ��μ� ������ �����̳ʿ� ������ �Ѵ�.
	//LifeInter inter = ctx.getBean("life",LifeInter.class);
	//String name = inter.method1();
	//System.out.println("name=>"+name);
	}

}