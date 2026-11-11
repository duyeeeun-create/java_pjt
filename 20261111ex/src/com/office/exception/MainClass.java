package com.office.exception;

public class MainClass {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println("num1 + num2 =" + (num1 + num2)); //10
		
		/*
		 * 예외처리 : try~ catch문*/
		try { //예외가 발생할 소지가 있는 코드를 넣고
			System.out.println("num1 / num2 =" + (num1 / num2)); //excepcion  -> JVM으로 
			
			System.out.println("+++++++++++++++++++++");
			
		}catch (ArithmeticException e) {
		     //그 예외를 어떻게 처리할지 코드 Exception객체 ArithmeticException
		    //System.out.println(e.getMessage());
			
			e.printStackTrace();// 주로 이걸 쓴다
		}//메모리를 많이 차지하니까 필요한 곳에서만
		 catch (Exception e) {
			e.printStackTrace();
		} finally {
			//최종적 예외가 발생하던 안하던 무조건 실행될 수 있도록 넣는 코드(생략가능)
			// 
			
			System.out.println("finally");
		}
		
		System.out.println("num1 - num2 =" + (num1 - num2)); //10
		System.out.println("num1 * num2 =" + (num1 * num2)); //0
		
		

	}

}
