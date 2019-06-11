package com.example.springrest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springrest.dao.BagRepositoryInterface;
import com.example.springrest.model.Product;

@Component
public class BagService {

	@Autowired
	private BagRepositoryInterface bagRepository;

	public String addProduct(Product product) {
		bagRepository.save(product);
		return "Successfully Added";
	}

	public String updateProduct(Product pro) {
		if (bagRepository.existsById(pro.getName())) {
			Optional<Product> p = bagRepository.findById(pro.getName());
			Product product = p.get();
			product.setPrice(pro.getPrice());
			product.setQuantity(pro.getQuantity());
			bagRepository.save(product);
			return "updated..!";
		}

		return "Not updated..!";
	}

	public String deleteProduct(String name) {
		bagRepository.deleteById(name);
		return "deleted..!";
	}
}
