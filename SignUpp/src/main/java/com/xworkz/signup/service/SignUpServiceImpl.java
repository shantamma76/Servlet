package com.xworkz.signup.service;

import com.xworkz.signup.dto.SignUpDTO;

public class SignUpServiceImpl implements SignUpService {

	@Override
	public boolean validateAndSave(SignUpDTO signUpDTO) {
		System.out.println("start valide dto");
		boolean valid = true;

		if (signUpDTO != null) {
			System.out.println("SignUpDTO is not null,will valid the date");

			String userId = signUpDTO.getUserId();
			if (userId != null && !userId.isEmpty() && userId.length() >= 3 && userId.length() <= 30) {
				System.out.println("userId is valide");
			} else {
				System.err.println("userId is in-valide");
				valid = false;
			}

			String email = signUpDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")
					|| email.endsWith(".in")) {
				System.out.println("email is valide");
			} else {
				System.err.println("email is in-valide");
				valid = false;
			}
			
			String password = signUpDTO.getPassword();
			String confirmPassword = signUpDTO.getConfirmPassword();
			if (password != null && !password.isEmpty() && password.length()>3 && password.length()<10
				&& confirmPassword.equals(password)) {
				System.out.println("password is valide");
			} else {
				System.err.println("password is in-valide");
				valid = false;
			}

		}
		return valid;
	}
}