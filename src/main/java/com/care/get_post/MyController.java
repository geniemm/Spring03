package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my") // ��θ� ���鶧 �ߺ��Ǵ� ������ �̷��� ���ش�~
public class MyController {
	public MyController() {
		System.out.println("������ ���� ~~ ");
	}
	@RequestMapping("index") // ����ڰ� �� url�� ��û�ϸ� 
	public String index() {
		return "get_post/index"; // �� ��ο��ִ� jsp ������ �ҷ��´�.
	}
	@RequestMapping(value="/result", method=RequestMethod.GET) // �Ӽ��� �������� ���� �̸��� ���������� 
	// method�� get���� �����߱⶧���� post������� �����ϸ� 405�����߻�
	public String result(HttpServletRequest req, Model model) {
	
		String name = req.getParameter("name");
		//web�� ���� �޾ƿ��� ������ ��Ʈ������ > ����ȯ���� �ص���
		int age = (Integer.parseInt(req.getParameter("age")));
		
		System.out.println("���� ��� : "+req.getMethod()); //����� ��û�� get/post���� �˱�����
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("method",req.getMethod());
		
		return "get_post/result";
	
	}
	//requestMapping�� get,post �Ѵ� �����־ ���� �޼ҵ带 ��������� �Ѵ�.
	@PostMapping("/result") // / �ִ� ���� ���̰� ����
	public String resultPost(@RequestParam String name,
			@RequestParam("age") int a, HttpServletRequest req, Model model) { 
		// age(jsp���� �Ѿ���� �̸�)���� int a�� �����ϰڴ� >> �̸��� �ٸ���쿡 �̷��Խ���
		// ������쿡�� String name ó�� �ϳ��� ���൵��
		
		model.addAttribute("name",name);
		model.addAttribute("age",a);
		model.addAttribute("method",req.getMethod());
		
		
		return "/get_post/result";
	}
	
	@PostMapping("dto")
	public String dto(MyDTO dto, Model model) {
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getAddr());
		
		model.addAttribute("dto",dto);
		return "get_post/dto";
	}
	
}


















