package com.javalec.base;

public class FirstSon {

	// Field
	
	// Constructor
	public FirstSon() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void takeChoco() {
//		MamaBag mamaBag = new MamaBag();
//		mamaBag.choco = mamaBag.choco - 1;
		MamaBag.choco = MamaBag.choco - 1;
		if(MamaBag.choco < 0) {
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		}else {
			System.out.println("첫째는 맛있게 먹었어요..");
		}
	}
	
	
	
	
	
	
}
