package ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Ex1_AutoWired {
	@Autowired
	@Qualifier("ICTToday")
	private String msg;

	/*
	 * @Autowired public void setMsg(String msg) { this.msg = msg; }
	 */
	public String getMessage() {
		StringBuffer sb = new StringBuffer();
		sb.append("<p style ='color:blue");
		sb.append(msg);
		sb.append("</P>");
		return sb.toString();
	}
	

}
