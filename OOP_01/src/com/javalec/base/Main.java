package com.javalec.base;


public class Main {

	public static void main(String[] args) {
		
		// 1~10까지의 합을 구하여 출력하고, 그 합이 짝수인지 홀수인지 판단하는 걸 절차지향으로 해보기!
		int result = 0;
		
		for(int i=1; i<=10; i++) {
			result += i;
		}
		System.out.println("1부터 10까지의 합 ? " + result);
		
		
		if(result % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
}
