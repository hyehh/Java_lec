package com.javalec.base;

import java.util.Scanner;

public class Practice2Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int customerNumber = 0;
		int[] money = new int[5];
		int price = 0;
		
		
//		while(inputNumber !=4) {
		while(true) {
			System.out.println("1. 입금");
			System.out.println("2. 츌금");
			System.out.println("3. 현황");
			System.out.println("4. 종료");
			
			System.out.print("번호를 선택하세요!");
			inputNumber = scanner.nextInt();
			
			
			if(inputNumber==1) {
				System.out.print("고객번호 : ");
				customerNumber = scanner.nextInt();
				
				System.out.print("금액 : ");
				price = scanner.nextInt();
				money[customerNumber-1] += price;
				
				System.out.println("입금 결과 : 고객번호 : " + customerNumber + " 잔액 : " + money[customerNumber-1]);
				System.out.println("------------------------------");
				
			}else if(inputNumber==2){
				System.out.print("고객번호 : ");
				customerNumber = scanner.nextInt();
				
				System.out.print("금액 : ");
				price = scanner.nextInt();
				
				if(price>money[customerNumber-1]) {
					System.out.println("잔액이 부족합니다.");
				}else {
				money[customerNumber-1]-=price;
				
				System.out.println("출금 결과 : 고객번호 : " + customerNumber + " 잔액 : " + money[customerNumber-1]);
				}
			}else if(inputNumber==3) {
				System.out.println("\t" + "고객명" + "\t" + "잔액");
				System.out.println("\t" + "----" + "\t" + "----");
				for(int i=0; i<money.length; i++) {
					System.out.println("\t" + (i+1) + "\t" + money[i]);
				}
			}else {
			System.out.println(">>>> Thank you <<<<");
			break;
			}
		} // while finish
	}

}
