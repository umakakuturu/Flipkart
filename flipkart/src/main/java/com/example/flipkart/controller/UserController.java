package com.example.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flipkart.dto.UserReqDto;
import com.example.flipkart.dto.UserRespDto;
import com.example.flipkart.service.UserService;

@RestController

public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/users")
	public ResponseEntity<UserRespDto> register(@RequestBody UserReqDto userReqDto) {
		
		UserRespDto userRespDto=userService.register(userReqDto);
		return new ResponseEntity<>(userRespDto, HttpStatus.CREATED);

	}

}
