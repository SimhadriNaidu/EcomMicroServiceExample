package com.example.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.model.Product;
import com.example.springrest.service.BagService;

@RestController
//@RequestMapping("/catalog")
public class BagController {

	@Autowired
	private BagService bagService;

	@PutMapping
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		return new ResponseEntity<String>(bagService.updateProduct(product), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		return new ResponseEntity<String>(bagService.addProduct(product), HttpStatus.OK);
	}

	@DeleteMapping("/{name}")
	public ResponseEntity<String> deleteProduct(@PathVariable("name") String name) {
		return new ResponseEntity<String>(bagService.deleteProduct(name), HttpStatus.OK);
	}
}
