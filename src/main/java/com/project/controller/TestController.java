package com.project.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.impl.TestService;

@Controller
public class TestController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
		
	@Autowired
	private TestService testservice;
	
	@RequestMapping("/test")
	public String test(Model model) {
		
		List<String> list = testservice.testSelect();
		log.info("list:"+list);
		
		model.addAttribute("list", list);
		
		return "test";
	}
	
}
