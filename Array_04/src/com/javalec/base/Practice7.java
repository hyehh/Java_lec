package com.javalec.base;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String[] name = {"No1", "No2", "No3", "No4"};
		String[] subject = {"Korean", "English", "Mathematics"};
		
		int[] korean = new int[name.length];
		int[] english = new int[name.length];
		int[] math = new int[name.length];
		double[] total = {0, 0, 0, 0};
		
		for(int i=0; i < subject.length; i++) {
			System.out.println(subject[i] + "의 성적을 입력 : ");
			
			for(int j=0; j < name.length; j++) {
				System.out.print(name[j] + "의 성적은 : ");
				int inputNumber = scanner.nextInt();
				
				if(i==0) {
					korean[i] = inputNumber;
				}
				

				
				
			}
			
		
		}
		
		
		
		
		
		
	}

}
