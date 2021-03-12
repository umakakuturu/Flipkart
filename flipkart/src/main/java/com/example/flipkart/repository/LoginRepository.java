package com.example.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flipkart.dto.LoginReqDto;
import com.example.flipkart.entity.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {

	User findByEmailIdAndPassword(String emailId, String password);

}
