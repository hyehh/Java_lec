package com.javalec.function;

public class DmbCellPhone extends CellPhone {

	// Field
	public int channel;
	
	// Constructor
	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
	} //  기본값 constructor는 만들어주는 게 좋음!
	

	public DmbCellPhone(String model, String color, int channel) {
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	
	
	// Method
	
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작 합니다.");
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " +channel + "번으로 바꿉니다.");
		
	}
	
	public void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	
	
	
}
