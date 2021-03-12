package com.example.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.flipkart.dto.LoginReqDto;
import com.example.flipkart.dto.LoginResDto;
import com.example.flipkart.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<LoginResDto> userLogin(@RequestBody LoginReqDto loginReqDto)

	{
		LoginResDto loginResDto = loginService.userLogin(loginReqDto);
		return new ResponseEntity<>(loginResDto, HttpStatus.OK);
	}

}
