package com.bee.sample.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch1.annotation.Function;

@Controller
public class HelloworldController {
	
	
	@RequestMapping("/sayhello.html")
	@Function()
	public @ResponseBody String say(String name){
		return "hello "+name;
	}
}
