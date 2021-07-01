package com.javalec.base;

import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;
import com.javalec.function.StoreHQ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		Shop1 shop1 = new Shop1();
		
		
		
		
//		StoreHQ mainshop = new StoreHQ();
//		mainshop.mainShopPrint();
//		
//		Shop1 shop1 = new Shop1();
//		shop1.shop1Print();
//		
//		Shop2 shop2 = new Shop2();
//		shop2.shop2Print();
//
//		
//		Shop3 shop3 = new Shop3();
//		shop3.shop3Print();
//		System.out.println("--------------");
		
		
		StoreHQ mainshop = new StoreHQ();
		Shop1 shop1 = new Shop1();
		Shop2 shop2 = new Shop2();
		Shop3 shop3 = new Shop3();

		
		
		
		StoreHQ[] store = {mainshop, shop1, shop2, shop3};
		//StoreHQ[]와 String을 같다고 생각하면 됨!
		
		for(int i=0; i<store.length; i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
		}
	}

} // ---- '이렇게 끝에 표시해주기!'
