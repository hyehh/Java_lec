package com.javalec.function;

public class CellPhone {

	
	
	// Field
	public String model;
	public String color;
	
	
	// Constructor
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	// Method
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	
	public void recieveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
//	sendVoice 와 recieveVoice 에서 message라는 변수 똑같은 이름으로 사용해도 무방. 
//	왜냐면 다른 scope에 있기 때문에!
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	
	
	
	
	
	
}
