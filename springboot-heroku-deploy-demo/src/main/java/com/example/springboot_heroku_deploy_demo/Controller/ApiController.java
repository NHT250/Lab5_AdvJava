package com.example.springboot_heroku_deploy_demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@RestController		
public class ApiController {
	  @GetMapping("/")
	    public String index() {
	        return "Hello world from Spring Boot";
	    }
}
