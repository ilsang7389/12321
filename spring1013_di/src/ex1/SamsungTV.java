package ex1;


public class SamsungTV implements TV{
	//propert�� ���
		private String msg;
		public void setMsg(String msg) {
			this.msg = msg;
		}
	@Override
	public void powerOn() {
		System.out.println(msg+"SamsungTV--- ���� Ų��.");
		
	}
	@Override
	public void powerOff() {
		System.out.println(msg+"SamsungTV---���� ����.");
		
	}
	@Override
	public void volumeUP() {
		System.out.println(msg+"SamsungTV---���� ���δ�.");
		
	}
	@Override
	public void volumeDown() {
		System.out.println(msg+"SamsungTV--- ���� ���δ�.");
		
	}
	

}
