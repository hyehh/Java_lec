package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10; 
		int j =0;
		
		System.out.println("Add : " + (i+j));
		System.out.println("Sub : " + (i-j));
		System.out.println("Mul : " + (i*j));
		
		// 1번째 방법 (많이 사용)
		try {
			System.out.println("Div : " + (i/j));
			
		}catch(Exception e) { // e는 int 의 i 같은 것임!	
//			System.out.println(e.getMessage()); //개발자들이 보는 에러 코드
			System.out.println("숫자를 확인하세요!");
		}
		
		
	}

}
