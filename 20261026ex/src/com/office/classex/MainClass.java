package com.office.classex;

public class MainClass {

	public static void main(String[] args) {
		
		Car car1 = new Car();  // Car은 데이터 타입
		
		
		System.out.println(car1.color); //Black
		System.out.println(car1.size); //5.2
		System.out.println(car1.displacement); //2000
		
//		car1.drive();
//		car1.stop();
//		car1.parking();
		
		car1.callAllMethod(); 

		Car car2 = new Car();
		car2.color = "White";
		System.out.println("car2 color : " + car2.color);

		Car car3 = new Car();
		System.out.println("car3 color : " + car3.color);
		
		
	
		
	}

}
