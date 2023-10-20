package kr.co.ictedu.mvc.controller.main;
//Advice�� ���� �� ���� ��ü
//���� ���ɻ��� -> ���� ��¥�� �޼��� �������� �α׷� ���!
//Advice -> before �� �ؾ� ������ �α� ���
//pointcut ->  * kr.co.icteduc.mvc.controller.main.TodayMy*.today*(..)


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayMyAopDemoController {

	@GetMapping(value = "/myprofile")
	public ModelAndView todayProfile() {
		//System.out.println("���� ��¥ : ");
		ModelAndView mav = new ModelAndView();
		mav.addObject("profile", "���� �������Ǳ�浿�̴�!");
		mav.setViewName("today/todayProfile");
		return mav;
	}
	@GetMapping(value = "/todaywork")
	public ModelAndView todaywork() {
		//System.out.println("���� ��¥ : ");
		ModelAndView mav = new ModelAndView();
		mav.addObject("work", "��û ���� �۾��Դϴ�. ��¥�� �����ϼ���");
		mav.setViewName("today/todaywork");
		return mav;
	}
}
