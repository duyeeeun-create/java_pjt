package com.office.member;

import java.util.HashMap;

public class MemberDao {
	
	/*
	 * gildong : MemberDto
	 * */
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	public boolean isMember(String mamId) {
		
		MemberDto memberDto =  db.get(mamId);
		
//		if(memberDto != null) {
//			return true;
//		}else {
//			return false;
//		}
		
		return memberDto != null ? true : false;
		
		
	}

	public int insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMamId(), memberDto);
		
		
		return  db.get(memberDto.getMamId()) != null? 1: 0;  //0또는 1
	}

	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
	
		MemberDto dto = db.get(memberDto.getMamId());
		
		
		if(dto != null && dto.getMamPw().equals(memberDto.getMamPw())) {
				return dto;
			
		}else {
			return null;
		}
		
	}

	public MemberDto deleteMemberByMemberIdAndMemPw(MemberDto memberDto) {
		
		
    MemberDto dto = db.get(memberDto.getMamId());
	//System.out.println("dto :" + dto);	
		
		if(dto != null && dto.getMamPw().equals(memberDto.getMamPw())) {
			MemberDto deletedMemberDto = db.remove(memberDto.getMamId());// hash map dto
			//System.out.println("deletedMemberDto :" + deletedMemberDto);주소확인
			
			if(deletedMemberDto != null) {
				return deletedMemberDto;
			}else {
				return null;
			}
			
		}else {
			return null;
		}
		
		
		
	}

}
