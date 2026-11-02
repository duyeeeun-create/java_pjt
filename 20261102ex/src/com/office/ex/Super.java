package com.office.ex;

public class Super extends Grand{
	
	//멤버필드
	public String name;
	private int money;
	
	
	
	//메서드(기능)
	public void printInfo() {
		System.out.println("Name :" + name);
		System.out.println("Money :" + money);
	}

}
