package ex1;
//DI : ��ü �����������̴�.
public class MyTestA {
	// ����ʵ�� ���� ��ü�� ����!
	private ResouceB b;
	public MyTestA() {
		// has a ����, ���յ��� ����
		// b = new ResouceB();
		System.out.println("myTestA ����");
	}
	//�ܺο��� ������ �Ŀ� �� �ּҸ� ���� �޴´�.
	//<property name = "b" ....
	public void setB(ResouceB b) {
		this.b = b;
	}
	//����Ͻ� ���� ����
	public String printUserb() {
		StringBuilder sb = new StringBuilder();
		sb.append("B���� ��ȯ ���� ��:" + (b.res()*2)).append("<br>");
		sb.append("����� �̸�:").append(b.getUname());
		return sb.toString();
	}
	

}