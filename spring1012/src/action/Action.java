package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public interface Action { //다형성이 있는 인터페이스 특성
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws IOException;
}
