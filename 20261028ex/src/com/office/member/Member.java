package com.office.member;

public class Member {

	//속성(멤버필드)
	
	/*
	 * 아이디, 비밀번호, 메일주소, 연락처*/
	String memberId;
	String memberPW;
	String memberMail;
	String memberPhone;
	
	
	//생성자
	public Member() {
		
	}
	
	
	
	public Member(String memberId, String memberPW, String memberMail, String memberPhone) {
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.memberMail = memberMail;
		this.memberPhone = memberPhone;
	}



	//기능(메서드)
	/*
	 * 회원정보 출력기능*/
	public void printInfo() {
		System.out.println("MemberId :" + memberId);
		System.out.println("MemberPW :" + memberPW);
		System.out.println("MemberMail :" + memberMail);
		System.out.println("MemberPhone :" + memberPhone);
	}
	
	
	
}
