package com.office.ex;

public class Daeri {
	
	 //속성은 private으로만 하자
      public String name = "Kim Daeri";
      private int money;
      
     //생성자
      public Daeri() {
		money = 1000000;
	}
	
      //메서드
      public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!");
	}
      
      //우회해서
      public void setMoney(int money, String ceoPW) {
    	  if(ceoPW.equals("1234")) {
  		 this.money = money;
  		 }
  	}      //초기화 -> setter : set + 속성명(첫글자대문자)
      
      public int getMoney() {
		return this.money;
	}    //조회 -> getter : get + 속성명(첫글자대문자)

	 /* public int getMoney() {
		  return money;
	  }

	  public void setMoney(int money) {
		  this.money = money;
	  }
      */
      
}
