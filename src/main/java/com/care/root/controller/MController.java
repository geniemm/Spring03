package com.care.root.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.dto.MDto;
import com.care.root.service.MService;

@Controller
@RequestMapping("/member")
public class MController {
	@Autowired
	private MService ms;
	
	public MController() {
		System.out.println("¿¬°á");
	}
	
	@GetMapping("register")
	public String Register() {
		
		return "member/register";
	}
	@PostMapping("register")
	public String register(@RequestParam String id, 
			@RequestParam String pwd, @RequestParam String name) {
		ms.register(id,pwd,name);
		
		return "member/login";
	}
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	@PostMapping("login_chk")
	public String loginChk(@RequestParam String id, @RequestParam String pwd) {
		int result = ms.loginChk(id,pwd);
		if(result==1) {
			return "redirect:main";
		}
		return "redirect:login";
	}
	@GetMapping("member_list")
	public String list(Model model) {
		ArrayList<MDto> dto = ms.list();
		model.addAttribute("list",dto);
		
		return "member/member_list";
	}
	@GetMapping("member_info")
	public String info(@RequestParam String id,Model model) {
		MDto dto = ms.info(id);
		model.addAttribute("dto", dto);
		return "member/member_info";
	}
	
	
	
	
	
	
	
	
}
