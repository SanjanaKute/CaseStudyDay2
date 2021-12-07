package com.CaseStudy.adminservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.CaseStudy.adminservice.model.Users;

@RestController
//@RequestMapping("/admins")
public class AdminController {
	
	private RestTemplate restTemplate;
	
	@RequestMapping("/admin")
	public String hello()
	{
		return "Hello from Admin service";
	}

	//----------------Admin can do to user database------------------------
	
	@RequestMapping("/findAllUser")
	public List<Users> getAllUser()
	{
		return Arrays.asList(restTemplate.getForObject("http://user-service/user/findAllUsers",Users[].class));
		
	}
	
}
