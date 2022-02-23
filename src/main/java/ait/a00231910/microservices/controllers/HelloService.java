package ait.a00231910.microservices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@RequestMapping("/")
	public String returnHello()
	{
		return "Hello World!";
	}

}
