package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Random -> 게임에 많이 사용(테트리스)
		
		// 가위바위보 1=바위 2=가위 3=보 로 if만 설정해주면 됨
		for(int i=1; i<=6; i++) {
			double d = Math.random();
			int a = (int)(d*3) + 1;
			System.out.println(a);
			
		}
		
		
		
		Random random = new Random();
		int i = random.nextInt(3);
		// 3개를 의미함!
		System.out.println(i+1);
		// index는 0부터니까 1,2,3으로 보려고 i+1 해준 것$
		
		
	}

}
