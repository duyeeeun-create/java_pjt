package com.office.inheri.restaurant;

public class ChildRestaurant 
extends ParentRestaurant 
implements CheckList, CheckList2{

public final static int PARENT_MENU = 1;
public final static int CHILD_MENU = 2;

public void	makeBokkeumbap(){
	
	System.out.println("아들! 볶음밥 만들었뜸!");
}

//재정의 = 오버라이딩
//super 바로 위에있는거 가리킨다 this는 나
//@Override
public void makeJajang(int menu) {
	if(menu == PARENT_MENU) {
		super.makeJajang();
	}else {
	
	System.out.println("아들! MZ짜장 만들었뜸!");}
}


@Override
public void makeTangsuyuk() {
	System.out.println("아들! 탕수육 만들었뜸!");
}

@Override
public void checkFloor() {
	
	
}

@Override
public void checkToilet() {
	
	
}

@Override
public void checkHwagu() {
	// TODO Auto-generated method stub
	
}





}
