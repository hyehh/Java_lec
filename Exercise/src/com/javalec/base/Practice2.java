package com.javalec.base;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int[] money = new int[5];
		int data = 0;
		int price = 0;
		
		
		while(inputNumber!=4) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 현황");
			System.out.println("4. 종료");
		
			System.out.print("번호를 선택하세요!");
			inputNumber = scanner.nextInt();
		
		
		
		// 1인 경우 (입금)
		if(inputNumber==1) {
			
				System.out.print("고객 번호 : ");
				int customerNumber = scanner.nextInt();
				
				
				System.out.print("금액 : ");
				price = scanner.nextInt();
				money[customerNumber-1]+=price;
				
				System.out.println("입금 결과 : 고객번호 :" + customerNumber + " 잔액 : " + money[customerNumber-1]);
				System.out.println("------------------------------");
				
		}
		// 2인 경우 (출금)
				else if(inputNumber==2) {
					System.out.print("고객 번호 : ");
					int customerNumber = scanner.nextInt();
					
					
					System.out.print("금액 : ");
					price = scanner.nextInt();
					
					if(money[customerNumber-1]<price) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("------------------------------");

					}else {
					
					
					money[customerNumber-1]-=price;
				
					
					System.out.println("금 결과 : 고객번호 :" + customerNumber + " 잔액 : " + money[customerNumber-1]);
					System.out.println("------------------------------");
					
					}
				}
			
		
		
		// 3인 경우 (현황)
				else if(inputNumber==3){
					System.out.println("고객명" + "\t" + "잔액");
					System.out.println("----" + "\t" + "----");
					for(int j=0; j<5; j++) {
						System.out.println((j+1) + "\t" + money[j]);
	
					}
					System.out.println("------------------------------");
				
				}
			
		// 4인 경우 (종료)
		
		
		} //while끝
		
			System.out.println(">>>> Thank you <<<<");
			
		
		
	}

}
