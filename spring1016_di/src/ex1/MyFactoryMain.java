package ex1;
// 의존관게가 형성된 2객체 생성
// A에게 B의 주소를 전달한 후, 목표 메서드 A의 printUserb() - B의 메서드를 포함한  - 호출해서
// 완료
public class MyFactoryMain {
	public static void main(String[] args) {
		MyTestA refa = new MyTestA();
		//ResouceB refb = new ResouceB();
		//의존관계 전달
		refa.setB(new ResouceB());
		System.out.println(refa.printUserb());
	}
}
