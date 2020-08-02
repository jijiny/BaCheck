package com.basang.BaCheck.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basang.BaCheck.dto.User;
import com.basang.BaCheck.service.face.LoginService;

@Controller
public class LoginController {
	@Autowired LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	// 로그인하는 페이지 만듶면 value 값들 수정
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login() {
		logger.info("login()");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginProc(User user, HttpSession session) {
		logger.info("loginProc()");
		
		// 테스트 데이터---------------------------------------------------------------
		user.setUser_name("USER 1");
		user.setUser_code("abc");
		System.out.println(user.getUser_name() + " : " + user.getUser_code());
		// ------------------------------------------------------------------------
		
		int loginCheck = loginService.loginCheck(user);
		System.out.println(loginCheck);
		
		if(loginCheck == 1) {
			System.out.println("로그인 성공");
			session.setAttribute("login", true);
			session.setAttribute("user_name", user.getUser_name());
		} else {
			System.out.println("로그인 실패");
			return "redirect:/login";
		}
		
		// 로그인 성공시 redirect할 페이지로 바꿔야함
		return "redirect:/hello";
	}
	
}
