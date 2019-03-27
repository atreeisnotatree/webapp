package com.springMVCWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isUserValid(String user, String pass) {
		return user.equalsIgnoreCase("Cosmin") && pass.equalsIgnoreCase("123");
	}
}
