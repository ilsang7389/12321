package ex3;
/*
 *  lazy-init= "true" �Ӽ��� �ο��ϸ� ������ �����̳ʿ��� bean�� �ҷ� ���� ��������
 *  �����Ǵ� ���� �ƴ϶� getBean()�� ����ؼ� ȣ�� �ϴ� �������� ��ü�� �����ϵ��� ������
 *  ���� ����ϰ� ������ �ʴ� ���� ��쿡 ������. 
 * */
public class LazyBean {
	private String msg;
	public LazyBean( ) {
	System.out.println("LazyBean ������ ȣ��!");
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String PrintMsg() {
		return msg;
	}
	
	
}