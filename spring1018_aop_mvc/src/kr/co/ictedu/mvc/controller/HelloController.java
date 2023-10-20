package kr.co.ictedu.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//HelloController�� ���� �ߴ� mvc����  Model�� �ش��� �ȴ�.
//DispatcherServlet �� ��Ʈ�� �������� ������ �����̳ʿ� ���ؼ� Model�� ���� �޾Ƽ� ����
//HandlerMapping �� ��û ������ �м� ���ش�. *****
//�̿� ���� @Contorller �� ��������� DispatcherServlet�� �����ϴ�  ������ �����̳ʰ�
//�����ϴ� ict-1-servlet.xml���� <context:component-scan>������� bean�� ����̵�
@Controller
public class HelloController {

	//HandlerMapping
	//@RequestMapping,@GetMapping,@PostMapping ���� �ִ�
	// http://localhost:8089/spring/hello<- /hello�� ��û��
	@RequestMapping(value = "/hello",method = RequestMethod.GET) //������� get post�� ���ϴ� ������� �־��� �� �ִ�.
	public ModelAndView myHello(){
		ModelAndView mav = new ModelAndView();
		// ViewResolver�� ���ؼ� view�� ��ġ�� .jsp�� ������ �ϼ��Ѵ�.
		// DispatcherServlet ���� �ϸ� ������ ���ִ� ���
		mav.setViewName("hello"); //ViewName�� ����
		mav.addObject("msg","<h1>�ȳ��ϼ���. ���� ù��°�� spring MVC�Դϴ�</h1>");
		mav.addObject("today","<h2>" + new SimpleDateFormat("yyyy-mm-dd").format(new Date()) + "</h2>");
		return mav;
	}
}