package com.springMVCWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springMVCWebApp.login.LoginService;

@Controller
@SessionAttributes("user")
public class LoginController {
	@Autowired	
	LoginService service;
	
	@RequestMapping(value = "/login", method =RequestMethod.GET)
		public String showLoginPage()
		{
			return "login";
		}
	
	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String user, @RequestParam String pass,ModelMap model)
	{
		if(service.isUserValid(user, pass)) {
		model.put("user", user);
		model.put("pass", pass);
		return "welcome";
		}else {
			model.put("errorMessage", "invalid userID and Password");
			return "login";
		}
	}
	
}
 