package ex1;
// �������԰� ������ 2��ü ����
// A���� B�� �ּҸ� ������ ��, ��ǥ �޼��� A�� printUserb() - B�� �޼��带 ������  - ȣ���ؼ�
// �Ϸ�
public class MyFactoryMain {
	public static void main(String[] args) {
		MyTestA refa = new MyTestA();
		//ResouceB refb = new ResouceB();
		//�������� ����
		refa.setB(new ResouceB());
		System.out.println(refa.printUserb());
	}
}