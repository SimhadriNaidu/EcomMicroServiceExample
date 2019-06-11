package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.model.Product;
import com.example.springrest.service.BagService;

@RestController
//@RequestMapping("/products")
public class BagController {

	@Autowired
	private BagService bagService;

	@GetMapping()
	public ResponseEntity<List<Product>> getBagProducts() {
		return new ResponseEntity<List<Product>>(bagService.getProducts(), HttpStatus.OK);
	}

	@GetMapping("/{name}")
	public ResponseEntity<Product> getProductWith(@PathVariable("name") String name) {
		System.out.println("name-->" + name);
		return new ResponseEntity<Product>(bagService.getProduct(name), HttpStatus.OK);
	}

}
