package com.office.db;

import java.util.ArrayList;
import java.util.HashMap;

import com.office.diary.DiaryDto;
import com.office.member.MemberDto;

public class DiaryDb {
	
	private static DiaryDb diaryDb;
	//멤버데이터, 다이어리 데이터
	
	 final private  HashMap<String, MemberDto> members; //  final private캡슐화
	
	 final private HashMap<String, ArrayList<DiaryDto>> diaries; // str, [] -> array쓰기
	
	public DiaryDb() {
		members = new HashMap<String, MemberDto>();
		diaries = new HashMap<String, ArrayList<DiaryDto>>();
	}
	
	public static DiaryDb getInstance() {
		if(diaryDb == null)
			diaryDb = new DiaryDb();
		
		return diaryDb;
	}// 싱클턴으로 하나만잇어야하니까
/*
 * getters*/

	public HashMap<String, MemberDto> getMembers() {
		return members;
	}

	public HashMap<String, ArrayList<DiaryDto>> getDiaries() {
		return diaries;
	}
	
}
