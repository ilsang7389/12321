package ex1;

import org.springframework.beans.factory.annotation.Autowired;

public class lgTV implements TV{
	//propert�� ���
	
	@Autowired
	private String msg;

	/*
	 * public void setMsg(String msg) { this.msg = msg; }
	 */
	@Override
	public void powerOn() {
		System.out.println(msg + "LgTv--- ���� Ų��.");
		
	}
	@Override
	public void powerOff() {
		System.out.println(msg + "LgTv---���� ����.");
		
	}
	@Override
	public void volumeUP() {
		System.out.println(msg + "LgTv---���� ���δ�.");
		
	}
	@Override
	public void volumeDown() {
		System.out.println(msg + "LgTv--- ���� ���δ�.");
		
	}
	

	
	
}
