package com.office.inheri.restaurant;

public abstract class ParentRestaurant  {
	
	
    //메서드
	
	public void makeJajang() {
		System.out.println("아빠! 짜장면 만들었뜸!");
	}
	
	public void makeJjamppong() {
		System.out.println("아빠! 짬뽕 만들었뜸!");
	}
	
	//추상클래스 abstract
	//탕수육 만드는 기술 반드시 익히도록!
	//선언부만 있다 상속받으려면 반드시 구현해야함
	public abstract void makeTangsuyuk();
	

	
}
