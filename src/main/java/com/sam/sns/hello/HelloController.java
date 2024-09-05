package com.sam.sns.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController 
{
	@GetMapping("/sns/hello")
	@ResponseBody
	public String hello()
	{
		return "hello";
	}
}
