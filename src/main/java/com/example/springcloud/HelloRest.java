package com.example.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return "Hello Rest SpringBoot";
	}

}
