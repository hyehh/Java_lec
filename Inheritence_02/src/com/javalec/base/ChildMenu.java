package com.javalec.base;

public class ChildMenu extends ParentsMenu {

	
	// Field
	
	
	// Constructor
	
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	// Method
	
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	
	public void makeHotDoen() {
		System.err.println("얼큰 된장국");
	}
	
	@Override
	public void makeChung() {
		// TODO Auto-generated method stub
		System.out.println("냄새 없는 청국장");
	}
	
	@Override
	public void makeDoen() {
		// TODO Auto-generated method stub
		System.out.println("소고기 된장국");
		super.makeDoen();
	}

}
