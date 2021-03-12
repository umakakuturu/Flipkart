package com.example.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flipkart.dto.LoginReqDto;
import com.example.flipkart.dto.LoginResDto;
import com.example.flipkart.entity.User;
import com.example.flipkart.repository.LoginRepository;
import com.example.flipkart.utility.UserUtility;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	public LoginResDto userLogin(LoginReqDto loginReqDto) {
		LoginResDto loginResDto = new LoginResDto();
		if (loginReqDto.getEmailId().isEmpty() || loginReqDto.getPassword().isEmpty()) {
			loginResDto.setStatusCode(UserUtility.INVALID_INPUT_CODE);
			loginResDto.setStatusMessage(UserUtility.INVALID_INPUT);
		}

		else {
			User user = loginRepository.findByEmailIdAndPassword(loginReqDto.getEmailId(), loginReqDto.getPassword());

			if (user != null) {
				loginResDto.setStatusMessage(UserUtility.LOGIN_SUCCESS);
				loginResDto.setStatusCode(UserUtility.LOGIN_SUCCESS_CODE);

			} else {
				loginResDto.setStatusCode(UserUtility.LOGIN_FAIL_CODE);

				loginResDto.setStatusMessage(UserUtility.LOGIN_FAIL);
			}

		}

		return loginResDto;
	}

}
