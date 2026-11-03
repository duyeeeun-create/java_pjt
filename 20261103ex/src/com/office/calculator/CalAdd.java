package com.office.calculator;

public class CalAdd implements ICalculator{
	
	//덧셈	
//	private int caladd(int n1, int n2) {
//		int result = n1 + n2;
//		
//		return result;
//}

	@Override
	public int doOperator(int n1, int n2) {
		//int result = caladd(n1, n2);
		int result = n1 + n2;
		return result;
	}

}
