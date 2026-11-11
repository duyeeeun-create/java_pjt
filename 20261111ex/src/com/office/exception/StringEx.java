package com.office.exception;

public class StringEx {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		System.out.println(stringBuffer);
		
		/*문자열 추가*/
		
		stringBuffer.append("world");
		System.out.println(stringBuffer); //Helloworld
		
		/*특정 위치에 문자열 추가*/
		
		stringBuffer.insert(5, "++");
		System.out.println(stringBuffer); //Hello++world
		
		/*특정 범위 삭제*/
		
		stringBuffer.delete(5, 10);
		System.out.println(stringBuffer); //Hellold 
		// 5~9 까지 delete 앞은 포함 뒤는 안 포함
		
		/*특정 위치 문자 삭제*/
		
		stringBuffer.deleteCharAt(5);
		System.out.println(stringBuffer); //Hellod
		
		/*문자열 교체*/
		stringBuffer.replace(2, 4, "LL");
		System.out.println(stringBuffer);  //Hellod  --> HeLLod
		
		/*문자열 뒤집기*/
		stringBuffer.reverse();
		System.out.println(stringBuffer); //doLLeH
		
		/*문자열 길이*/
	    int lengh =	stringBuffer.length();
	    System.out.println("lengh :" + lengh); //6
	    
	    //stringBuffer vs stringBuilder 에서의 차이 
	    //동기화 : 동시에 일이 들어올 때 번호표 주고 기다리는 것 -> 처리 속도가 느리다 -> 데이터가 안정적
	    
	    
	}

}
