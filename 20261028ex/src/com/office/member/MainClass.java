package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	

	public static void main(String[] args) {
		
	     
		 Config config = new Config();
		 
		
	
		
		 Scanner scanner = new Scanner(System.in);
		// boolean systemFlag = true;
		 Flag flag = new Flag();
		 
		 MemberDB memberDB = new MemberDB();
		 MemberService memberService = new MemberService(memberDB);
		 
		 if(config.IS_DEV) {
		 MemberDumy memberDumy = new MemberDumy(memberDB);
		 memberDumy.initMemberDumyData();
		 }
		 
		
		 /*
		  *1과제 : 더미 데이터 초기화는 개발 환경과 
		  *실환경으로 구분해야 한다*/
		 
	     while (flag.systmFlag) {
		 
		
		 
		System.out.println("1.SIGN-UP   2.SIGN-IN   3.modify   4.delete   5.PRINT_ALL_MEMBERS   99.system-out ");
		int selectedMenu = scanner.nextInt();
		
		switch (selectedMenu) {
		case Menu.MENU_SIGN_UP:          // SIGN-UP
			
		 //memberService = new MemberService();
		 memberService.doSignUp(scanner);
			
			break;
			
        case Menu.MENU_SIGN_IN:          //SIGN-IN
			 
       // 	 memberService = new MemberService();
            memberService.doSignIN(scanner, flag);
			break;
			
        case Menu.MENU_MODIFY:         //MODIFY
        	
        	memberService.doModify(scanner);
	
	        break;
	        
       case Menu.MENU_DELETE:          //DELETE
    	   
    	   memberService.doDelete(scanner);
	
	      break;
	      
       case Menu.MENU_PRINT_ALL_MEMBER:        //ALL-MEMBERS
    	   
    	   HashMap<String, Member> db = memberDB.memberDB;
    	   
    	
    	   for(String key : db.keySet()) {
    		   Member member = db.get(key);
    		   System.out.println(member.memberId);
    		   System.out.println(member.memberPW);
    		   System.out.println(member.memberMail);
    		   System.out.println(member.memberPhone);
    	   }
    	   
//    	   for(Member member : db.values()) {
//    		   System.out.println(member.memberId);
//    		   System.out.println(member.memberPW);
//    		   System.out.println(member.memberMail);
//    		   System.out.println(member.memberPhone);
//    	   }
			break;
			      
       case Menu.END:        //SYSTEM-OUT 
    	   flag.systmFlag = false;
    	   
    	   System.out.println("Good~bye~");
			break;
			
			/*
			 * 2과제 : case에 사용되는 리터럴 상수 -> 상수 변경 (CLEAR!)
			 * 3과제 : 메뉴 5번을 만들어서 전체 회원 정보 출력하는 기능 구현(AI 도움)(CLEAR!)*/

		
		}
	
	}
		scanner.close();
		
	}

}