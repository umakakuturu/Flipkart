package com.example.flipkart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.flipkart.entity.Product;
import com.example.flipkart.exception.CustomException;
import com.example.flipkart.exception.UserNotLoginException;
import com.example.flipkart.repository.ProductRepository;
import com.example.flipkart.repository.UserRepository;

import com.example.flipkart.utility.UserUtility;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<Product> products(String emailId) throws UserNotLoginException, CustomException {
//	@Query("select entity.customerType from User entity where entity.emailId=?1")
		String customerType = userRepository.getproductType(emailId);
		if (customerType != null) {
			List<Product> product;
			if (customerType.equalsIgnoreCase("low")) {
				
				//@Query("select entity from Product entity where entity.productType=?1")

				product = productRepository.getProductDetails(customerType);
			} else {
				product = productRepository.findAll();
			}

			return product;

		} else

		{
			throw new CustomException(UserUtility.USER_NOT_LOGIN);
		}
	}
}