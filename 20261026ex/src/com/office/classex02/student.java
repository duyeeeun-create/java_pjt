package com.office.classex02;

public class student {

	//속성
	String name;
	int grade;
	int age;
	String major;
	// 속성명이랑 변수명 일치 알아보기 쉽게
	//생성자
	public student(String name, int grade, int age, String major) 
	{
		System.out.println("--- Constructor ---");
		
		this.name = name; // 지역변수라 this. 붙여서 전역변수 가리키기
		this.grade = grade;
		this.age = age;
		this.major = major;
	}
	
	//기능(메서드) 이름은 -> 동사 + 명사
	public void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
		System.out.println("Age : " + age);
		System.out.println("Major : " + major);
	}
	
	
	
}
