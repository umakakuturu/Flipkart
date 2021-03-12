package com.example.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flipkart.entity.Product;
import com.example.flipkart.exception.CustomException;
import com.example.flipkart.exception.UserNotLoginException;
import com.example.flipkart.service.ProductService;

@RestController
public class ProductController {
	@Autowired

	ProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<Product>> products(@RequestParam("emailId") String emailId)
			throws UserNotLoginException, CustomException {
		List<Product> product = productService.products(emailId);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

}
