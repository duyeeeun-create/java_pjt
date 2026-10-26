package com.office.classex03;

public class Mainclass {

	public static void main(String[] args) {
		// 학생 객체를 생성할 때 학생이 소유하고 있는 차객체도 생성
		/*
		 * 홍길동
		 * 22
		 * 
		 * White
		 * 123가4567
		 * */
//		Car car1 = new Car("White","123가4567");
		
		
		Student student1 = new Student("홍길동", 22, new Car("White","123가4567"));
		student1.printInfo();
 
	}

}
