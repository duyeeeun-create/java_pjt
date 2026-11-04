package com.office.member;

import java.util.Scanner;

public class MemberService implements IMemberService{
	
	MemberDao memberDao = new MemberDao();
	

	@Override
	public void signup(MemberDto memberDto) {
		
		
		//아이디중복체크
		boolean isMember = memberDao.isMember(memberDto.getMamId());
		
		
		//회원가입
		if (!isMember) {
		   int result = memberDao.insertNewMember(memberDto); //0:실패, 1: 성공
		
		  if(result == 0) {
			  System.out.println("죄송합니다.회원가입 실패! 잠시후 다시 시도해주세여");
		  }else {
			  System.out.println("회원가입 성공!");
		  }
		}else {
			System.out.println("이미 존재하는 ID입니다");
		}
	}

	@Override
	public void signIn(MemberDto memberDto) {
	MemberDto searchedMemberDto =
			memberDao.searchMemberByMemIdAndMemPw(memberDto);
		if(searchedMemberDto != null) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberDto memberDto) {
	MemberDto deletedMemberDto =	memberDao.deleteMemberByMemberIdAndMemPw(memberDto);
		if(deletedMemberDto != null) {
			System.out.println("탈퇴처리 완료");
		}else {
			System.out.println("탈퇴처리 실패");
		}
	}
	
	

}
