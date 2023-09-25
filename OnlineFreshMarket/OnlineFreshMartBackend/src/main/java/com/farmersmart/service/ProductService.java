package com.farmersmart.service;

import org.springframework.web.multipart.MultipartFile;

import com.farmersmart.pojo.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
