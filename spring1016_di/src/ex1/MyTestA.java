package ex1;
//DI : 객체 의존성주입이다.
public class MyTestA {
	// 멤버필드로 받을 객체를 선언!
	private ResouceB b;
	public MyTestA() {
		// has a 관계, 결합도가 높다
		// b = new ResouceB();
		System.out.println("myTestA 생성");
	}
	//외부에서 생성한 후에 그 주소를 주입 받는다.
	//<property name = "b" ....
	public void setB(ResouceB b) {
		this.b = b;
	}
	//비즈니스 로직 생성
	public String printUserb() {
		StringBuilder sb = new StringBuilder();
		sb.append("B에서 반환 받은 값:" + (b.res()*2)).append("<br>");
		sb.append("사용자 이름:").append(b.getUname());
		return sb.toString();
	}
	

}
