package com.office.member;

import java.util.Scanner;

public class MemberService {
	//속성
	MemberDB db;
	
	//생성자
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}

	//메서드
	/*
	 * 회원가입기능*/
	
	public void doSignUp( Scanner scanner ) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		System.out.println("Input new member PW");
		String memberPW = scanner.next();
		
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		Member member = new Member(memberId, memberPW, memberMail, memberPhone);
		//MemberDB db = new MemberDB();
		
		db.memberDB.put(memberId, member);
		
		db.memberDB.get(memberId).printInfo();
		
		/*4과제 : 아이디 중복체크 기능 추가*/
		/*5과제 : 비밀번호는 8~12 문자로 표현 기능 추가*/
	}
	
	/*
	 * 로그인*/
    public void doSignIN(Scanner scanner) {
    	System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPW = scanner.next();
		
		//MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(memberId);
		
		
		if(searchedMember != null) {
			if(searchedMember.memberPW.equals(memberPW)) {
				System.out.println("1 SIGN-IN SUCCESS");
			}else {
				System.out.println("2 SIGN-IN FAIL");
			}
		}else {
			System.out.println("3 SIGN-IN FAIL");
		}
	}
    
    /*6과제 : 로그인 실패가 3회 초과면 시스템 종료 기능 추가flag = false*/
    
    /*정보수정*/
    
   public void doModify(Scanner scanner) {
	   System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPW = scanner.next();
		
		System.out.println("Input member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input member PHONE");
		String memberPhone = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		searchedMember.memberPW = memberPW;
		searchedMember.memberPhone = memberPhone;
		searchedMember.memberMail = memberMail;
		
		//로깅
		searchedMember = db.memberDB.get(memberId);
		searchedMember.printInfo();
		
		//System.out.println(searchedMember.memberId);
		//System.out.println(searchedMember.memberPW);
		//System.out.println(searchedMember.memberMail);
		//System.out.println(searchedMember.memberPhone);
		
		/*
		 * 7과제: id, pw 인증 -> ok -> 정보수정
		 * */
	}
   
   /*회원 탈퇴*/
   
   public void doDelete(Scanner scanner) {
		
	   System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPW = scanner.next();
		
		Member searchedMember =  db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPW.equals(memberPW)) {
			db.memberDB.remove(memberId);
		}
	   
	}
}
