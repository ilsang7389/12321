package ex3;
/*
 *  lazy-init= "true" 속성을 부여하면 스프링 컨테이너에서 bean을 불러 오는 시점에서
 *  생성되는 것이 아니라 getBean()를 사용해서 호출 하는 시점에서 객체를 생성하도록 설정함
 *  자주 빈번하게 사용되지 않는 빈일 경우에 적용함. 
 * */
public class LazyBean {
	private String msg;
	public LazyBean( ) {
	System.out.println("LazyBean 생성자 호출!");
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String PrintMsg() {
		return msg;
	}
	
	
}
