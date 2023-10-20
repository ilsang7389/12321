package ex1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/AopDemoServlet")
public class AopDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ApplicationContext ctx;
       
       @Override
    public void init() throws ServletException {
    ctx = new GenericXmlApplicationContext("ex1/ex1_aop.xml");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	DaoInter dao = ctx.getBean("dao", DaoInter.class);
	
	//dao.first();
	//dao.second();
	dao.firstStatementTest(2);
	//dao.third();
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}