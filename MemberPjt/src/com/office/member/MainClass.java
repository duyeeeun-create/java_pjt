package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		멤버서비스
		-회원가입: id, pw, mail, phone
		-로그인
		-정보수정
		-탈퇴*/
		
		Scanner scanner = new Scanner(System.in);
		

		boolean systemFlag = true;
		String[] memberInfos;
		
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int END = 99;
		
		// "gildong" , ["1234", "gildong@gmail.com", "010-1234-5678"]
		// "chanho" , ["0000", "chanho@naver.com", "010-2222-3333"]
		
		HashMap<String, String[]> members = new HashMap<String, String[]>();  // 데이터타입> 변수 = 객체 생성
		
		 //DUMY DATA START
			 members.put("gildong",new String[]{"gildong", "1234", "gildong@gmail.com",  "010-1234-5678"});
			 
			 memberInfos = members.get("gildong");
			 
			 for(int i = 0; i < memberInfos.length; i++) {
			 System.out.println(memberInfos[i]);
			 }
//			 for(String memberInfo: memberInfos) {
//				 System.out.println(memberInfo);
//			 }
             members.put("chanho",new String[]{"chanho", "0000", "chanho@naver.com",  "010-2222-3333"});
			 
			 memberInfos = members.get("chanho");
			 
			 for(int i = 0; i < memberInfos.length; i++) {
			 System.out.println(memberInfos[i]);
			 }
				
			 //DUMY DATA END
		
	    while(systemFlag) {
		System.out.println("1. SING-UP     2.SIGN-IN    3.MODIFY    4.DELETE    99.END");
		
		
		
		int selectedMenuNumber = scanner.nextInt();


		 String memberID;
		 String memberPW;
		 String memberMail;
		 String memberphone;
		
		
		switch (selectedMenuNumber) {
		case MENU_SIGN_UP:               //SING-UP(회원가입)
			
		     System.out.println("Input new member ID!!");	
		      memberID = scanner.next();
		
		     System.out.println("Input new member PW!!");	
		      memberPW = scanner.next();
		
		     System.out.println("Input new member MAIL!!");	
		      memberMail = scanner.next();
		     
		     System.out.println("Input new member PHONE!!");	
			  memberphone = scanner.next();
			 
			 members.put(memberID,new String[]{memberID, memberPW, memberMail, memberphone});
			 
			 memberInfos = members.get(memberID);
			 
//			 for(int i = 0; i < memberInfos.length; i++) {
//				 System.out.println(memberInfos[i]);
//			 }
			 for(String memberInfo: memberInfos) {
				 System.out.println(memberInfo);
			 }
			
			 break;

        case MENU_SIGN_IN:              //SIGN-IN(로그인)
        	
        	System.out.println("Input member ID!!");
        	 memberID = scanner.next();
        	
        	System.out.println("Input member PW!!");
        	 memberPW = scanner.next();
        	 
        	String[]searchedMember = members.get(memberID);
        	
        	 System.out.println("searchedMember: " + searchedMember);
        	 
        	 if(searchedMember != null && searchedMember[1].equals(memberPW)) {
        		 
        		//ID, PW 일치 == 로그인성공
    			 System.out.println("SIGN-IN SUCCESS");
        			 
        		 }
        	 else {
        		 
        		//ID 불일치 == 로그인실패
        		 System.out.println("SIGN-IN FAIL");
        	 }
			break;
			
        case MENU_MODIFY:              //MODIFY(정보수정)
        	
        	 System.out.println("Input member ID!!");	
		      memberID = scanner.next();
		
		     System.out.println("Input member PW!!");	
		      memberPW = scanner.next();
		
		     System.out.println("Input member MAIL!!");	
		      memberMail = scanner.next();
		     
		     System.out.println("Input member PHONE!!");	
			  memberphone = scanner.next();
			  
			 memberInfos = members.get(memberID);
			 
			 if(memberInfos != null) {
				 memberInfos[1] = memberPW;
				 memberInfos[2] = memberMail;
				 memberInfos[3] = memberphone;
				 
				String[] tempInfos = members.get(memberID);
				for(String tempInfo: tempInfos ) {
					System.out.println(tempInfo);
				}
						 
			 }else {
				 System.out.println("존재하지 않는 ID입니다. 다시 확인하세요.");
			 }
			 
        	
			break;
			
        case MENU_DELETE:             //DELETE(회원탈퇴)
        	
            System.out.println("Input member ID!!");
       	    memberID = scanner.next();
       	
       	    System.out.println("Input member PW!!");
       	    memberPW = scanner.next();
       	    
       	  memberInfos =  members.get(memberID);
       	 if(memberInfos != null && memberInfos[1].equals(memberPW)) {
       		 
       		members.remove(memberID);
   			
   			System.out.println("삭제 처리 이후: " + members.get(memberID));
       	 }else {
       		 System.out.println("존재하지 않습니다. 다시 확인하세요.");
       	 }
	
	        break;
	        
        case END:             //나가기
        	System.out.println("Goooooooooooooooooooood Bye!!!!!!!");
        	systemFlag =false;
	        break;
		}
		
	
	    }
	    
	    scanner.close();
	    
	}

}
