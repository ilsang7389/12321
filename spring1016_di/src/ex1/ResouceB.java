package ex1;
//�ڿ��� �ٷ�� ��ü, �� ResouceB - Dao
public class ResouceB {
	private String uname;
	public ResouceB() {
		System.out.println("Resourece�� ������ ��!");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int res() { // Ư�� ���� �����ִ� �޼���
		return 100000;
	}
}