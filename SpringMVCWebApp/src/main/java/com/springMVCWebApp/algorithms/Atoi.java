package com.springMVCWebApp.algorithms;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class Atoi {
	public static int convertStringToInt(String str) {
		
		String theActualRegex = "(^(\\s)*(\\+|\\-)?[0-9]+)+";

		Pattern checkRegex = Pattern.compile(theActualRegex);
    	Matcher regexMatcher = checkRegex.matcher(str);
    	while ( regexMatcher.find() ){
			if (regexMatcher.group() .length() != 0){
				BigInteger number = new BigInteger(regexMatcher.group().trim());
				if(BigInteger.valueOf(Integer.MIN_VALUE).compareTo(number)>0)
					return Integer.MIN_VALUE;
				else if(BigInteger.valueOf(Integer.MAX_VALUE).compareTo(number)<0)
					return Integer.MAX_VALUE;
				else {
					return number.intValue();
				}
			}
    	}
		return 0;
	}
}
