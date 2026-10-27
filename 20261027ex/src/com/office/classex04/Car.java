package com.office.classex04;

public class Car {

	
	//멤버 필드
	String color;
	int lenght;
	int price;
	int displacement;
	
	//생성자
	public Car() {
		System.out.println("--CONSTRUCTOR--");
	}

	public Car(String color, 
			int lenght,
            int price, 
            int displacement) {
		
		this.color = color;
		this.lenght = lenght;
		this.price = price;
		this.displacement = displacement;
	}
	//매개변수, 매서드 안에서 선언된 변수도 지역변수다
	//메소드 public 접근제한자 void 반환형 메소드이름
	//(동사(do,get,set) + 목적어(명사))+ {실행부}
	//int speed : parameter(용어통일), 매개변수
	public void goForward(int speed){
		System.out.println("--goForward() method--");
		System.out.println(speed + "km/h");
	}
	
    public void goBack(){
    	System.out.println("--goBack() method--");
	}
    
    public void doTest() {
    	goForward(30); // this. 붙여도 상관없음
    	goBack();
	}
}
