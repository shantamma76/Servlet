package com.xworkz.signup.service;

import com.xworkz.signup.dto.SignUpDTO;

public interface SignUpService {

	boolean validateAndSave(SignUpDTO signUpDTO);

}
