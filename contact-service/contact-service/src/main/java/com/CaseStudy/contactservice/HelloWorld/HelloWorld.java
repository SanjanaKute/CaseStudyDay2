package com.CaseStudy.contactservice.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {

	@RequestMapping("/contact")
	public String hello()
	{
		return "Hello from Contact service";
	}
}
