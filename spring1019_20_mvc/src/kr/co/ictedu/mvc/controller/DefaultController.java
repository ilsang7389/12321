package kr.co.ictedu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	// value�� ����ؼ� ���ڿ� �迭�� ��û�� �����پ��ϰ� ������ �� �ִ�. 
	@GetMapping(value = {"/main",""})
	public String main() {
		
		
		return "main/index";
	}
}
