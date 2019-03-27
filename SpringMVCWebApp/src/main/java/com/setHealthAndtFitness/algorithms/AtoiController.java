package com.setHealthAndtFitness.algorithms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
public class AtoiController {
	@Autowired	
	Atoi atoi;
	
	@RequestMapping(value = "/atoi", method =RequestMethod.GET)
	public String showAtoi()
	{
		return "atoi";
	}
	
	@RequestMapping(value = "/atoi", method =RequestMethod.POST)
	public String convertStringInt(ModelMap model, @RequestParam String input)
	{
		String result = Integer.toString(atoi.convertStringToInt(input));
		model.put("result", result);
		model.put("resultMessage", "The integer is: ");
		return "atoi";
		
	}
		
}
