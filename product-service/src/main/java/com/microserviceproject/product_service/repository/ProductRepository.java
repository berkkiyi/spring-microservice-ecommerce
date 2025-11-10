package com.microserviceproject.product_service.repository;

import com.microserviceproject.product_service.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}
