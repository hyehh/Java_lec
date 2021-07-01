package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calendar
		
		Calendar calendar = Calendar.getInstance();
		// 컴퓨터의 시간 년월일을 가져올 수 있고 다 정수형 타입임
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(calendar.MONTH) + 1;
		// month는 0부터 나오기에 +1해줘야 함
		int day = calendar.get(calendar.DAY_OF_MONTH);
		
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		
		System.out.println(year + ":" + month + ":" + day);
		System.out.println(hour + ":" + minute + ":" + second);
		
		
		
	}

}
