package com.springMVCWebApp.algorithms;

import org.springframework.stereotype.Service;

@Service
public class Divide {

	public int divide(int dividend, int divisor) {
		int currentProduct=0;
		int counter=0;
		int prductSign=1;
		
		if(dividend<0 && divisor<0) {
			dividend *= -1;
			divisor *= -1;
		}
		if(dividend<0 && divisor>0) {
			dividend *= -1;
			prductSign = -1;
		}
		if(dividend>0 && divisor<0) {
			divisor *= -1;
			prductSign = -1;
		}
		if(dividend==divisor) {
			counter=1;
		}
		
		while(true) {
			currentProduct += divisor;
			if(currentProduct<=dividend) {
			counter++;
			}
			else {
				break;
			}
		}
		counter *= prductSign;
		return counter;
	}
	
}