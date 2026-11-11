package com.office.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		/*ArrayList : 배열을 업그레이드*/
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		
		nums.remove(4);  //인덱스값
		nums.remove(3);
		
		nums.add(2, 100);
		
		nums.clear(); // [] Array는 남겨두고 ,안에 있는 데이터만 삭제
		
		//String  -> StringBuffer -> StringBuilder
		// Array  -> Vector  (동기화 이슈)     -> ArrayList
		
		Vector<Integer> nums2 = new Vector<Integer>();
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		nums2.add(50);
		
		nums2.remove(4);  //인덱스값
		nums2.remove(3);
		
		nums2.add(2, 100);
		
		nums2.clear(); // 안에 있는 데이터만 삭제
		
		Map<String, String> hashMap = new HashMap<String, String>(); //Map으로 하자 
		
	}
	

}
