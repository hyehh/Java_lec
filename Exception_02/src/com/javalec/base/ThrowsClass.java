package com.javalec.base;

public class ThrowsClass {

	
	// Field
	
	// Constructor
	public ThrowsClass() {
		// TODO Auto-generated constructor stub
		doC();
	}
	
	
	// Method
	private void doA() {
//	private void doA() throws Exception{ // 자바 11에서는 throws Exception을 안써도 에러코드 보여줌. 근데 이전버전은 저걸 써야 보여줌!
		System.out.println("doA");
		int[] arr = {1, 2, 3, 4};
		System.out.println(arr[4]);
		System.out.println("endA");
	}
	
	
	private void doB() {
		System.out.println("doB");
		try {
			doA();
		}catch(Exception e) {
			System.out.println("Exception은 여기");
			System.out.println(e.getMessage());
		}System.out.println("endB");
	}
	
	private void doC() {
		System.out.println("doC");
		doB();
		System.out.println("endC");
	}
	
	
	
	
	
}
