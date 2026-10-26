package com.office.classex02;

public class Mainclass {

	public static void main(String[] args) {
		
		
		student Student1 = new student("홍길동", 1, 20, "Computer");
		//System.out.println("--- Constructor ---"); 호출
		
		student Student2 = new student("박찬호", 1, 21, "Sports");
		
		
//		System.out.println("name " + Student1.name); //null
//		System.out.println("name " + Student1.grade); //0
//		System.out.println("name " + Student1.age); //0
//		System.out.println("name " + Student1.major); // null    
//		//-> 생성자가 초기화 시켜줌
	
		
		Student1. printInfo();
		Student2. printInfo(); // 생성자 매개변수를 위한 속성 초기화
		
		student Student3 = new student("김경운", 2, 22, "Baseball");
		Student3. printInfo();
		
		
		
	}

}
