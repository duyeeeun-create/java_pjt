package com.office.classex;

public class Car {
	
	
	//속성 ( 변수 -> 값을 수정할 수 있음 )
    String color = "Black";
    double size = 5.2;
    int displacement = 2000;
	
   //생성자  
  	public Car() {
  		System.out.println("CAR CONSTRUCTOR CALLED!!");
  		
  	}
	
	
	//기능 ( 메서드 ) -> 클래스 안에 있으면 메서드 , 밖에 있으면 함수
    public void drive() {
    	System.out.println("drive() CALLED!");
    }
    
    public void parking() {
    	System.out.println("parking() CALLED!");
    }
    
    public void stop() {
    	System.out.println("stop() CALLED!");
    }
    
    public void callAllMethod(){
    	drive();
		stop();
	    parking();
    }

}
