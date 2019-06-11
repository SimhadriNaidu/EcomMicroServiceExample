package com.service.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

	@GetMapping
	public String helloWorld(){
		return "Hello Eureka";
	}
	
//	@PostMapping(value = "/post")
//	public ResponseEntity<String> create(@RequestBody Hello hello){
//		System.out.println(hello.toString());
//		return new ResponseEntity<String>("User Created", HttpStatus.CREATED);
//		
//	}
}
