
public class temp {
 public static void main(String[] args) {
	int days = 10;
	System.out.println(days);
	
	int speed;
	speed = 20;
	System.out.println(speed);
	
	
	final int SPEED = 20;
	int count = 10;
	//SPEED = 40; 상수값은 바꿀 수 없다
	count =11;
	System.out.println("상수 SPEED 값은");
	System.out.println(SPEED);
	System.out.println("변수 count 값은");
	System.out.println(count);
	
	final double PI = 3.14;
	System.out.println("반지름 3인 넒이를 구합니다");
	System.out.println(3*3*PI);
}
}
