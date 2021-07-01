package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String의 문제점을 해결하기 위해 나온 문자열 선언자들
		
		String string = new String("abcdef");
		
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		stringBuilder.append("hijklmn");
		// 현 데이터 뒤에 덧붙이는 것임
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");
		// 3번에 zzz을 추가하는 것임
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);
		// 3번에서 6번 전까지 제거하는 것
		System.out.println(stringBuilder);
		
		
		StringBuffer stringBuffer = new StringBuffer("abcdef");
		stringBuffer.append("hijklmn");
		// 현 데이터 뒤에 덧붙이는 것임
		System.out.println(stringBuilder);
		
		stringBuffer.insert(3, "zzz");
		// 3번에 zzz을 추가하는 것임
		System.out.println(stringBuilder);
		
		stringBuffer.delete(3, 6);
		// 3번에서 6번 전까지 제거하는 것
		System.out.println(stringBuilder);
		
		// buffer보다는 builder가 더 빠름! buffe랑 build랑 같게 나옴!(제일 빠른 게 좋은 것)
		// 해외에서 stringbuilder로 쓰는 사람들 많음! (왜냐면 string의 단점때문!) 덧붙이기, 삽입, 삭제 편하게 사용 가능!
		
		
	}

}
