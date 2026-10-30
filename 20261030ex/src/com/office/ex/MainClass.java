package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		 *
		 * 인스턴스 instance == 객체( 속성== 멤버필드, 생성자, 메서드 == 멤버) 
		 * -> 추상화 된것을 구체화 인스턴스화
		 * 
		 * 접근 제어자(제한자)
		 * (Access Modifier) 어떤것을 접근하려고 할 때 접근 권한을 제어하는 것
		 * public : 공공의 데이터
		 * private : 데이터를 변경, 조회 할 수없다/ 같은 클래스 내에서 접근가능
		 * default : private + 같은 패키지 내에서 접근가능 키워드 명시 안 한다/ int money;
      
		 *  */
		
		PayController payController = new PayController();
		payController.execute();

	}

}
