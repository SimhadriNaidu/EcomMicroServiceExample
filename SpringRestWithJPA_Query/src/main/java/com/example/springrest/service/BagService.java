package com.example.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springrest.dao.BagRepositoryInterface;
import com.example.springrest.model.Product;

@Component
public class BagService {

	@Autowired
	private BagRepositoryInterface bagRepository;

	public List<Product> getProducts() {
		return (List<Product>) bagRepository.findAll();
	}

	public Product getProduct(String name) {
		Optional<Product> findById = bagRepository.findById(name);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

}
