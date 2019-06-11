package com.example.springrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springrest.model.Product;

public interface BagRepositoryInterface extends CrudRepository<Product, String>{

}
