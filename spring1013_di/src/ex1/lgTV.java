package ex1;

import org.springframework.beans.factory.annotation.Autowired;

public class lgTV implements TV{
	//propert를 등록
	
	@Autowired
	private String msg;

	/*
	 * public void setMsg(String msg) { this.msg = msg; }
	 */
	@Override
	public void powerOn() {
		System.out.println(msg + "LgTv--- 전원 킨다.");
		
	}
	@Override
	public void powerOff() {
		System.out.println(msg + "LgTv---전원 끈다.");
		
	}
	@Override
	public void volumeUP() {
		System.out.println(msg + "LgTv---볼륨 높인다.");
		
	}
	@Override
	public void volumeDown() {
		System.out.println(msg + "LgTv--- 볼륨 줄인다.");
		
	}
	

	
	
}
