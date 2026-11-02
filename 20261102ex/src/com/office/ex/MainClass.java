package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		/*상속(inheritace) 단일상속만
		 * 아빠 클래스가 아들 클래스한테 멤버를 물려주는 것을 말한다
		 * */ 
		
		Child child = new Child();
		
		System.out.println(child.name);
		child.printInfo();

	}

}
