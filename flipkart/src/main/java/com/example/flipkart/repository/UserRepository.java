package com.example.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.flipkart.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailId(String emailId);

	@Query("select entity.customerType from User entity where entity.emailId=?1")
	public String getproductType(String emailId);

}
