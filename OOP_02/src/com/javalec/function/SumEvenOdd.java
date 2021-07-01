package com.javalec.function;

public class SumEvenOdd {

	
	// class는 이렇게 세 개로 구성됨!
	
	// Property (선언자/초기값)
	
	
	// Constructor (생성자) - 기본적으로 만들어 주어야 함
	public SumEvenOdd() {
		// SumEvenOdd.찍으면 나오는 con~
		
		
	}
	
	
	// Method (함수)
	public int sumCalc(int num1, int num2) {
		
		// private쓰면 안됨! public 써야 갖다 쓸 수 있음!
		// 합계 구하는 타입이 int이기에 int로 넘기겠다고 말해주는 
		// sumCalc 뒤에 쓰는 게 매개 변수
		
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return sum;
	}
	
	// Method (함수)
	
		
	public String evenOdd(int num) {
		
		String chk = "";
		if(num % 2 == 0) {
			chk = "짝수";
		}else {
			chk = "홀수";
		}
		return chk;
		
		
//		int remainder = num%2;
//		String chk;
//		if(remainder == 0) {
//			
//		}
	}
	
}
