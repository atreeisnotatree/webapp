package com.springMVCWebApp.algorithms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 

@Controller
public class DivideController {
	@Autowired
	Divide divide;
	
	@RequestMapping(value = "/divide", method= RequestMethod.GET)
	public String showDivide()
	{
		return "divide";
	}
	
	@RequestMapping(value = "/divide", method= RequestMethod.POST)
	public String divide(ModelMap model, @RequestParam String dividend, @RequestParam String divisor)
	{
		String result = Integer.toString(divide.divide(Integer.parseInt(dividend), Integer.parseInt(divisor)));
		model.put("result", result);
		model.put("resultMessage", "The result of division is: ");
		return "divide";
	}
}

