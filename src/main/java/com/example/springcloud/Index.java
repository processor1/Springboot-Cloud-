package com.example.springcloud;

import org.springframework.web.bind.annotation.*;

@RestController
public class Index {

	@RequestMapping(value = "/games")
	@ResponseBody
	public String games() {
		return "Available games";
	}

}
