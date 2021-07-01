package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		System.out.println(arrayList);
		System.out.println(arrayList.toString());
		
		arrayList.remove(1);
		
		arrayList.clear();
		
		System.out.println(arrayList);

		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("b");
		linkedList.add("p");
		linkedList.add("q");
		linkedList.add("s");
		
		System.out.println(linkedList);
		
		linkedList.remove(1);
		
		System.out.println(linkedList);
		
		linkedList.clear();
		System.out.println(linkedList);
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("hye");
		vector.add("ji");
		vector.add("he");
		vector.add("eh");
		
		System.out.println(vector);
		
		vector.remove(1);
		
		System.out.println(vector);
		
	}

}
