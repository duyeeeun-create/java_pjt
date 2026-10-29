package com.office.methodex;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int rst = calculator.addOperator(10,20);
		// System.out.println("rst : " + rst);
		//받고싶으면 받고 안 받아도 상관없음
		
		//calculator 를 이용해서 자동차 하나 가지고 싶어욥
		Object myCar = calculator.productCar();
		
	}

}
