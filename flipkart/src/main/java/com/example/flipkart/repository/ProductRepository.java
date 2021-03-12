package com.example.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.flipkart.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("select entity from Product entity where entity.productType=?1")

	List<Product> getProductDetails(String customerType);

}
