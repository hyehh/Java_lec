package com.javalec.base;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1, j=10;

		SumEvenOdd sumEvenOdd = new SumEvenOdd();
		// 왜 new를 쓰냐? new로 복제본을 하나 만들어서 쓰는 것임! 이 복제본은 object라고 말함!
		int sum = sumEvenOdd.sumCalc(i, j);
		System.out.println(i + " ~ " + j + " 의 합은 " + sum + "입니다.");
		
		String chk = sumEvenOdd.evenOdd(sum);
		
		System.out.println(i + " ~ " + j + " 의 합은 " + sum + "입니다.");
		System.out.println(chk + "입니다.");
	}

}
