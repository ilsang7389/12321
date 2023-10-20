package ex2;

import ex1.LifeInter;
// life.xml -> <bean id="life" ...
public class LIfeBean implements LifeInter {
	private String name;
	public LIfeBean() {
		System.out.println("기본 생성자 호출======>");
	}

	public LIfeBean(String name) {
		this.name = name;
		System.out.println("생성자 호출======>" + name);
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setter 호출");
	}
	
	@Override
	public void init() {
		System.out.println("init 호출");

	}
	@Override
	public void destroy() {
		System.out.println("destroy 호출");

	}
	@Override
	public String method1() {
		return name;
	}

}
