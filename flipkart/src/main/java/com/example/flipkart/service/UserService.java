package com.example.flipkart.service;

import com.example.flipkart.dto.UserReqDto;
import com.example.flipkart.dto.UserRespDto;

public interface UserService {

	public UserRespDto register(UserReqDto userReqDto);

}
