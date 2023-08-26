package com.example.SpringDemoP2Web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController 
{
	@RequestMapping(value="/")
    public String hello()
    {
    	return "Welcome to the Application";
    }
}
