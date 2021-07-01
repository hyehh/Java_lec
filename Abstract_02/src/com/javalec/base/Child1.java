package com.javalec.base;

public class Child1 extends LunchMenu {

	// Field
	
	
	// Constructor
	
	public Child1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}


	// Method



	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}

}
