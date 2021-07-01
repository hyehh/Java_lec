package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 가위 : 1    바위 : 2    보 : 3
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		
		System.out.print("어떤 숫자를 입력하시겠습니까? :");
		inputNumber = scanner.nextInt();
		
		if(inputNumber==1) {
			System.out.println("당신의 가위바위보 : 가위");
		}else if(inputNumber==2) {
			System.out.println("당신의 가위바위보 : 바위");
		}else {
			System.out.println("당신의 가위바위보 : 보");
		}
		
		
		Random random = new Random();
		int i = random.nextInt(3);

		
		if((i+1)==1) {
			System.out.println("컴퓨터의 가위바위보 : 가위");
		}else if((i+1)==2) {
			System.out.println("컴퓨터의 가위바위보 : 바위");
		}else {
			System.out.println("컴퓨터의 가위바위보 : 보");
		}
		
		
		if(inputNumber==(i+1)){
			System.out.println("비겼습니다.");
		}else if(inputNumber==1 && i==2) {
			System.out.println("이겼습니다.");
		}else if(inputNumber>i) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		

	}

}
