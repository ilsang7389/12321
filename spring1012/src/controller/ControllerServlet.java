package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

@WebServlet("*.ict")
public class ControllerServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		//pro.ict?cmd=fboard
		String cmd = request.getParameter("cmd");
		Action action = null;
		if(cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			action= factory.getAction(cmd);
			ActionForward af = action.execute(request, response);
			if(af.isMethod()) {  //if = true, else= false
				response.sendRedirect(af.getUrl());
			}else {
				String path = "/WEB-INF/views";
				RequestDispatcher rd = request.getRequestDispatcher(path+"/"+af.getUrl()+".jsp");
				rd.forward(request, response);
			}
		}else {
			//오류 코드
			response.setContentType("text/html);charset-euc-kr");
			PrintWriter out = response.getWriter();
			out.print("<h2> 요청하신 페이지는 존재 하지 않습니다.</h2>");
			out.close();
		}
	}
}
