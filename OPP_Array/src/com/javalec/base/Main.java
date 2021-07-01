package com.javalec.base;

import com.javalec.function.Array;

public class Main {

	
	public static void main(String[] args) {
		
		int[] number = {10, 20, 30, 40, 50};
		
		Array array = new Array();
		int[] result = array.plusResult(number);
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
	}
	
	
	
	
}
