package com.CaseStudy.trainservice.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/train")
	public String hello()
	{
		return "Hello from train Service";
	}

}
