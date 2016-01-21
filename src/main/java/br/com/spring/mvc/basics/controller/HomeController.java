package br.com.spring.mvc.basics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		System.out.println("Test");
		return "home/index";
	}
	
}
