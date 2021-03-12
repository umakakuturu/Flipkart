package com.example.flipkart.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.flipkart.dto.UserReqDto;
import com.example.flipkart.dto.UserRespDto;
import com.example.flipkart.entity.User;
import com.example.flipkart.repository.UserRepository;
import com.example.flipkart.utility.UserUtility;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserRespDto register(UserReqDto userReqDto) {

		User user = new User();
		BeanUtils.copyProperties(userReqDto, user);
		User userIn = userRepository.findByEmailId(user.getEmailId());
		if (userIn != null) {
			return new UserRespDto(UserUtility.USER_ALREDY_THERE, HttpStatus.BAD_REQUEST.value());
		} else {
			userRepository.save(user);
			return new UserRespDto(UserUtility.SUCCESSFULLY_SAVED_DATA, HttpStatus.CREATED.value());
		}

	}

}
