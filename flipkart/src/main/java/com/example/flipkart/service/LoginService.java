package com.example.flipkart.service;

import org.springframework.stereotype.Service;

import com.example.flipkart.dto.LoginReqDto;
import com.example.flipkart.dto.LoginResDto;

@Service
public interface LoginService {
	public LoginResDto userLogin(LoginReqDto loginReqDto);

}
