package com.service.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ProductContoller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String getName() {
		return "HelloWorld";
	}
	@GetMapping
	public String hello(){
		String url= "http://catalog-service/catalog";
		return restTemplate.getForObject(url, String.class);
	}

}
