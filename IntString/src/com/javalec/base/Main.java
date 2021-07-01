package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 123; //숫자
		String str1 = "12345"; //모양은 숫자지만 문자임!
		String str2 = "abcde";
		
		String str3 = Integer.toString(num1);
		//정수는 문자열로 바뀜 
		System.out.println(str3 + str1);
		
		int num2 = Integer.parseInt(str1);
		System.out.println(num1 + num2);
				
		
		Double.toString(num2);
		// 실수값을 문자열로 바꾸는 것!
		
	}

}
