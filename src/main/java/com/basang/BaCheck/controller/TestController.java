package com.basang.BaCheck.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basang.BaCheck.service.face.TestService;


@Controller
public class TestController {
	
	@Autowired TestService testService;
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public void test(Model model) {
		logger.info("마이바티스 테스트");
		
		List<HashMap<String, Object>> map = testService.selectAllInfo();
		logger.info(map.toString());
		
		model.addAttribute("map", map);
		
	}
}
