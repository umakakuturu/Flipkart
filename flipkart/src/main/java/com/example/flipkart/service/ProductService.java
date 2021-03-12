package com.example.flipkart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.flipkart.entity.Product;
import com.example.flipkart.exception.CustomException;
import com.example.flipkart.exception.UserNotLoginException;

@Service
public interface ProductService {

	public List<Product> products(String emailId) throws UserNotLoginException, CustomException;

}
