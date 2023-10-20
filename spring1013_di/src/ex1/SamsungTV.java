package ex1;


public class SamsungTV implements TV{
	//propert를 등록
		private String msg;
		public void setMsg(String msg) {
			this.msg = msg;
		}
	@Override
	public void powerOn() {
		System.out.println(msg+"SamsungTV--- 전원 킨다.");
		
	}
	@Override
	public void powerOff() {
		System.out.println(msg+"SamsungTV---전원 끈다.");
		
	}
	@Override
	public void volumeUP() {
		System.out.println(msg+"SamsungTV---볼륨 높인다.");
		
	}
	@Override
	public void volumeDown() {
		System.out.println(msg+"SamsungTV--- 볼륨 줄인다.");
		
	}
	

}
