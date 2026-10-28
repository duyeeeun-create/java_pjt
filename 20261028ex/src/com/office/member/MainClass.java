package com.office.member;

import java.util.Scanner;

public class MainClass {
	

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 boolean systemFlag = true;
		 
		 MemberDB memberDB = new MemberDB();
		 MemberService memberService = new MemberService(memberDB);
		 MemberDumy memberDumy = new MemberDumy(memberDB);
		 memberDumy.initMemberDumyData();
		 
		 /*
		  *1과제 : 더미 데이터 초기화는 개발 환경과 실환경으로 구분해야 한다*/
		 
	     while (systemFlag) {
		 
		
		 
		System.out.println("1.SIGN-UP    2.SIGN-IN    3.modify    4.delete   99.system-out ");
		int selectedMenu = scanner.nextInt();
		
		switch (selectedMenu) {
		case 1:          // SIGN-UP
			
		 //memberService = new MemberService();
		 memberService.doSignUp(scanner);
			
			break;
			
        case 2:          //SIGN-IN
			 
       // 	 memberService = new MemberService();
         memberService.doSignIN(scanner);
			break;
			
        case 3:         //MODIFY
        	
        	memberService.doModify(scanner);
	
	        break;
	        
       case 4:          //DELETE
    	   
    	   memberService.doDelete(scanner);
	
	      break;
	      
       case 99:        //SYSTEM-OUT 
    	   systemFlag = false;
    	   System.out.println("Good~bye~");
			break;
			
			/*
			 * 2과제 : case에 사용되는 리터럴 상수 -> 상수 변경
			 * 3과제 : 메뉴 5번을 만들어서 전체 회원 정보 출력하는 기능 구현(AI 도움)*/

		
		}
	
	}
		scanner.close();
		
	}

}
