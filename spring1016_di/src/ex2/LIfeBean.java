package ex2;

import ex1.LifeInter;
// life.xml -> <bean id="life" ...
public class LIfeBean implements LifeInter {
	private String name;
	public LIfeBean() {
		System.out.println("�⺻ ������ ȣ��======>");
	}

	public LIfeBean(String name) {
		this.name = name;
		System.out.println("������ ȣ��======>" + name);
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setter ȣ��");
	}
	
	@Override
	public void init() {
		System.out.println("init ȣ��");

	}
	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");

	}
	@Override
	public String method1() {
		return name;
	}

}