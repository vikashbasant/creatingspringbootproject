package com.sts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody // this is used for return the contain...
	public String firstHandler() {
		return "Just for testing using sts!!";
	}
}
