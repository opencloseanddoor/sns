package com.sam.sns.daltagram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class daltaController 
{
	@GetMapping("/join-view")
	public String join()
	{
		return "user/join";
	}
}
