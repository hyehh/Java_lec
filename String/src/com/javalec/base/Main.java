package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		
		String st1 = new String("Hello"); //원래는 이렇게 적는건데 쉽게 쓰려고 만든게 위에 줄, 지금 이렇게 쓴 게 원래 객체선언방식!
		
//		Scanner scanner = new Scanner(System.in);
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = " abc def ghi ";
		
		// int 같은 건 변수이름 뒤에 . 찍어도 안됨! 오직 객체형 데이터 선언자만 가능!
		
		System.out.println(str1.concat(str2));
		//concat 문자열 연결해줌
		
		System.out.println(str1.substring(3));
		// 3번째부터 빼내는 것! (a가 0부터 시작!)
		
		System.out.println(str1.substring(3, 5));
		// 3에서부터 5 이전까지 빼내는 것!
		
		System.out.println(str1.length());
		// 글자 수 확인하기
		
		System.out.println(str1.toUpperCase());
		// 대문자로 바꿔주기
		
		System.out.println(str2.toLowerCase());
		// 소문자로 바꿔주기
		
		System.out.println(str1.charAt(3));
		// 3번째 값만 출력하기
		
		// str1을 알파벳 하나씩 출력하기
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		System.out.println(str1.indexOf('c'));
		// c가 몇 번째 있는지 출력
		
		System.out.println(str1.equals(str3));
		// 같은지 물어보는 것
		
		System.out.println(str4.trim());
		// 앞과 뒤의 space 제거 (사용자 입력 값이 있으면 꼭 써야 함 / 가장 많이 사용하는 메소드)
		
		System.out.println(str1.replace('a', 'Z'));
		// a를 Z로 바꾸기
		System.out.println(str1);
		// 바꾼 것을 str1으로 주지 않으면 str1이 아예 바꾸지 않음!
		
		System.out.println(str1.replaceAll("abc", "ZZZZZZ"));
		// abc를 ZZZZZZ로 바꾸기 (이건 String타입)
		
		
		
		
	}

}
