
public class Operator3 {
 public static void main(String[] args) {
	/* 비교 연산자
	 * 크고 작음을 나타내는 연산자*/
	 System.out.println(10 < 20); //true
	 System.out.println(10 > 20); //false
	 
	 System.out.println(10 <= 20); //true
	 System.out.println(10 >= 20); //false
	 System.out.println(20 <= 20); //true
	 
	 System.out.println(10 == 20); //false
	 System.out.println(10 != 20); //true
	 
	 // *주의*
	 float num5 = 0.1f; //0.10000000149 > double
	 double num6 = 0.1; //0.10000000000 > double
	 
	 System.out.println("num5 :" + num5); // 0.1
	 System.out.println("num6 :" + num6); //0.1
	 System.out.println("num5 + num6 :" + (num5 + num6));  //0.20000000149011612
	 
	 System.out.println("num5 == num6 :" + (num5 == num6)); //false
	 
	 int num7 = 10;
	 float num8 = 10.0f;
	 
	 // int + float => float + float // num7 : 10.0    num8 = 10.0
	 
	 System.out.println("num7 > num8 :" + (num7 > num8)); //false
	 System.out.println("num7 >= num8 :" + (num7 >= num8)); //true
	 System.out.println("num7 < num8 :" + (num7 < num8));  //false
	 System.out.println("num7 <= num8 :" + (num7 <= num8)); //true
	 System.out.println("num7 == num8 :" + (num7 == num8)); //true
	 System.out.println("num7 != num8 :" + (num7 != num8)); //false
	 
	 // **************************************
	 //문자열 비교
	 
	 String str1 = "Hello";
	 String str2 = "Hello";
	 System.out.println("str1 == str2 :" + (str1 == str2)); //true ! 절대금지 !
	 
	 String str3 = new String("Hello"); //레퍼런스 타입
	 String str4 = new String("Hello"); 
	 System.out.println("str3 == str4 :" + (str3 == str4)); //false 주소가 다름
	 
	 System.out.println(str3.equals(str4)); //str3 == str4 true //문자는 이렇게 비교하자
	 //equals 주소를 들어가 그 값을 확인하는 메서드
}
}
