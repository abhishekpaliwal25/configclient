package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@RefreshScope
public class MyController {
	@Value("${message: Default hello}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage()
	{
		return message;
	}

}
