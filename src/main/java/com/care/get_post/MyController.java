package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my") // 경로를 만들때 중복되는 값들은 이렇게 빼준다~
public class MyController {
	public MyController() {
		System.out.println("생성자 실행 ~~ ");
	}
	@RequestMapping("index") // 사용자가 이 url을 요청하면 
	public String index() {
		return "get_post/index"; // 이 경로에있는 jsp 파일을 불러온다.
	}
	@RequestMapping(value="/result", method=RequestMethod.GET) // 속성이 여러개가 들어가면 이름을 명시해줘야함 
	// method를 get으로 설정했기때문에 post방식으로 전송하면 405에러발생
	public String result(HttpServletRequest req, Model model) {
	
		String name = req.getParameter("name");
		//web을 통해 받아오는 값들은 스트링형태 > 형변환으로 해도됨
		int age = (Integer.parseInt(req.getParameter("age")));
		
		System.out.println("전송 방식 : "+req.getMethod()); //사용자 요청이 get/post인지 알기위해
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("method",req.getMethod());
		
		return "get_post/result";
	
	}
	//requestMapping은 get,post 둘다 쓸수있어서 따로 메소드를 지정해줘야 한다.
	@PostMapping("/result") // / 있던 없던 차이가 없다
	public String resultPost(@RequestParam String name,
			@RequestParam("age") int a, HttpServletRequest req, Model model) { 
		// age(jsp에서 넘어오는 이름)값을 int a에 저장하겠다 >> 이름이 다를경우에 이렇게써줌
		// 같을경우에는 String name 처럼 하나만 써줘도돼
		
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


















