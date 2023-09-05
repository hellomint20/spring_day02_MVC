package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //controller 어노테이션이 있어서 컨트롤러로 인식해서 경로 인식을 함
public class MyController {
	//﻿HomeController.java 처럼 @RequestMapping() 안에 값이 2개 이면(value, method) 각각 지정해서 작성해줘야 하지만 
	//그렇지 않을 경우 경로만 작성해도 됨
	
					//url 연결 경로
	@RequestMapping("/index") //@ : 어노테이션, 뒤에 경로 작성해주기
	public String memberIndex(Model model) {
		model.addAttribute("index", "기본 페이지 입니다.");
		return "member/index"; //views 폴더 경로
	}
	
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView model = new ModelAndView();
		model.addObject("login", "로그인 페이지 입니다.");
		model.setViewName("member/login");
		return model;
	}
	
	@RequestMapping("/logout")
	public String memberLogout(Model model) {
		model.addAttribute("logout", "로그아웃 페이지 입니다."); //key, value 
		return "member/logout";
	}
}
