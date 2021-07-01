package com.javalec.base;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DmbCellPhone의 Instance를 생성.
		
		
		DmbCellPhone newphone = new DmbCellPhone("자바폰", "검정", 10);
		
//		DmbCellPhone newphone = new DmbCellPhone(); //tab눌러서 사용하면 편함
//		newphone.model = "자바폰";
//		newphone.color = "검정";
//		newphone.channel = 10;
		
		System.out.println("모델 : " + newphone.model);
		System.out.println("색상 : " + newphone.color);
		System.out.println("체널 : " + newphone.channel);
		
		newphone.powerOn();
		newphone.powerOff();
		newphone.bell();
		newphone.sendVoice("여보세요");
		newphone.recieveVoice("안녕하세요! 저는 홍길동 인데요");
		newphone.sendVoice("아! 반값습니다. 그럼 안녕히~~~");
		newphone.turnOnDmb();
		newphone.changeChannelDmb(12);
		newphone.turnOffDmb();
		
		
	}

}
