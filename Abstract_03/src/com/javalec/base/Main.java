package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LunchMenu child1 = new Child1(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		LunchMenu child2 = new Child2(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		LunchMenu child3 = new Child3(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		//누구한테 상속받았는지 바로 알 수 있기 때문!(가독성)
		
		
		System.out.println(child1.calc());
		// child1에서 int return 사용이 아니라 void를 주었다면 여기서는 syso 안해줘도 됨!
		System.out.println(child2.calc());
		System.out.println(child3.calc());
		}

}
