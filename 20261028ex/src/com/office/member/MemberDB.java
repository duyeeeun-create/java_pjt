package com.office.member;

import java.util.HashMap;
import java.util.Map;

public class MemberDB {
     // DB Class
	 //컬렉션(==컨테이너)
	
	HashMap<String, Member> memberDB = new HashMap<String, Member>();
	                 
	public void MemberInfo() {
		for (Map.Entry<String, Member> entry : memberDB.entrySet()) {
		    System.out.println("회원정보: " + entry.getKey());}
		  
	}
	
	
}


