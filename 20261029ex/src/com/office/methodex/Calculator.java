package com.office.methodex;

public class Calculator {

	public int addOperator(int n1, int n2) {
		
		int result = n1 + n2;
		//System.out.println("result : " + result);
		
		
		return result;
	}
	
	/*
	public Car productCar() {
		
		Car car = new Car();
		return car;
		
		
	}*/
	
    public Object productCar() {
		
    	//Object 조상이라 넣을 수 있음
    	
		Car car = new Car();
		return car;
		
		
	}
}
