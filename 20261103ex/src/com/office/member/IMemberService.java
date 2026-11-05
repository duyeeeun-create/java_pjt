package com.office.member;

//import java.util.Scanner;

public interface IMemberService{

	public void signup(MemberDto memberDto);
	
	public void signIn(MemberDto memberDto);
	
	public void modify(MemberDto memberDto );
	
	public void delete(MemberDto memberDto);
	
	
}
