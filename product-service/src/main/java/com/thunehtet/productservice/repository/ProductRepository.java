package com.thunehtet.productservice.repository;

import com.thunehtet.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {



}
