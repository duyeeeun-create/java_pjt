
public class Operator {

	public static void main(String[] args) {
		
		//연산자 (Operator)
		
	      /*
	       * 산술 연산자   +, -, *, /, %, ++, --
	         할당 연산자   =, +=, -=, *=, /=, %=,( &=, |= )<--잘안씀
	         비교 연산자   ==, !=, >, <, >=, <=
	         논리 연산자   &&, ||, !
	       */
		
		// 1. 덧셈 연산자
		//1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2 :" + (num1 + num2));
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		System.out.println("num3 + num4 :" + (num3 + num4));
		
		//1-2. 문자열 덧셈 (연결 연산자)
		String str1 = "Hello";
		String str2 = "world";
		System.out.println("str1 + str2 :" + (str1 + str2));
		
		//1-3. 숫자 + 문자열 = 문자열+ 문자열 + 문자열(연결연산자)
		System.out.println(10 + "Hello");
		System.out.println(3.14f + "Hello");
		
		//참고 : 문자 덧셈
		System.out.println('A' + 'B'); // 131(유니코드 바뀌어 더해진다)
		System.out.println('가' + '나'); 
		
		//2. 뺄셈
		//2-1. 숫자 뺄셈
		num1 = 10; num2 = 20;
		System.out.println("num1 - num2 :" + (num1 - num2));
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 - num4 :" + (num3 - num4));

		//2-2 문자열 뺄셈 (X)
		//참고 : 문자 뺄셈은 가능
				System.out.println('A' - 'B'); // (유니코드 바뀌어 더해진다)
				System.out.println('가' - '나'); 
				
		//3. 곱셈
		num1 = 10; num2 = 20;
		System.out.println("num1 * num2 :" + (num1 * num2));
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 * num4 :" + (num3 * num4));
		
		System.out.println('A' * 'B');
		System.out.println('가' * '나'); 
		
		//4. 나눗셈
		num1 = 10; num2 = 20;
		System.out.println("num1 / num2 :" + (num1 / (float)num2)); // 오버플로우 발생 (float)방 만들자
		
		num3 = 0.8f; num4 = 0.2f;
		System.out.println("num3 / num4 :" + (num3 / num4));
		
		System.out.println('a'/ 'A'); // 
		
		System.out.println(0/100); //0
		//System.out.println(100/0); // error
		
		//5. 나머지 연산자
		num1 = 10; num2 = 3;
		System.out.println("num1 % num2:" + (num1 % num2)); //1
		System.out.println('a' % 'A'); //32
		
	}

}
