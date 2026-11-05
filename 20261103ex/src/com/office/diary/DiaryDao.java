package com.office.diary;

import java.util.ArrayList;

public class DiaryDao {
	
	
	//[] -> 길이수정 X ---> ArrayList 배열 길이가 늘었다 줄었다 데이터 추가시 add메소드쓰기
	
	private ArrayList<String> diaries = new ArrayList<String>();
	

	public boolean insertDiary(DiaryDto diaryDto) {
		
	    int beforeSize =diaries.size();
		
        //System.out.println(diaries.size()); //0
		
		//diaries.add(diaryDto.getTxt());
		
		diaries.add(0,diaryDto.getTxt()); // 최신글먼저 올라오게
		
		//System.out.println(diaries.size()); //1
		
		int afterSize =diaries.size();
		
		return afterSize > beforeSize ? true : false;
	}


	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
	
	
	
}
