package exam;

import java.util.Properties;
import java.util.Scanner;

public class LoginTest {
	private Scanner sc;
	private String pwd;
	private boolean res;
	private Properties prop;
	public LoginTest() {
		String[] msg = {"Ʋ�Ƚ��ϴ�." , "�ƽ�����. ������ �ѹ��� ��!" , "�� out�̾�" };
		sc = new Scanner(System.in);
		for(int i = 0 ; i<msg.length;i++) {
			System.out.println("��й�ȣ �Է�  : ");
			String pwd = sc.nextLine();
			if(!pwd.equals("1")) {
				System.out.println(msg[i]);
				res = false;
			
			}else {
				res = true;
				break;
			}
		}
	}
	public boolean isRes() {
		return res;
	}
	
}