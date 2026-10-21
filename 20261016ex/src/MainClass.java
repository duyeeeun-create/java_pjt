import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*데이터 타입
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 됨
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말한다
		 * 
		 * 메모리 단위 
		 * 1bit (비트) > 메모리 최소단위
		 * 8bit > 1byte (바이트)
		 * 1024Byte > 1KB(키로바이트)
		 * 1024KB> 1MB(메가바이트)
		 * 1024MB> 1GB(기가바이트)
		 * 1024GB > 1TB(테라바이트)
		 * 
		 * 정수 데이터 타입
		 * byte    1byte // -128~127
		 * short   2byte //-32,768 ~32,767
		 * int     4byte // 가장 많이 씀
		 * long    8byte
		 * 
		 * */
		byte byteNum = 115;
		System.out.println("byteNum:" + byteNum);
		
		byteNum = 127;
	//	byteNum = byteNum + 1;
		
		byte byteNum01 = -128;
		System.out.println("byteNum01:" + byteNum01); //-128
		
		byteNum01 = (byte)(byteNum01 -1 ); //()int 처리-> byte로-> 오버플로우
		System.out.println("byteNum01:" + byteNum01); //-129(x) 127(0)
		
		
		short shortNum = 22768;
		System.out.println("shortNum:" + shortNum);
		
		int intNum = 1147483648;
		System.out.println("intNum:" + intNum);
		
		int intNum01 = -2147483648;
		System.out.println("intNum01:" + intNum01); //-2147483648
		
		intNum01 = intNum01 -1;
		System.out.println("intNum01:" + intNum01); //-2147483649(x) 2147483647
		//-> 언더플로우
		
		long longNum = 7223372036854775808L;  //l; 
		System.out.println("longNum:" + longNum);
		
		System.out.println("byte 최솟값:" + Byte.MIN_VALUE);
		System.out.println("byte 최댓값:" + Byte.MAX_VALUE);
		
		System.out.println("byte 최솟값:" + Short.MIN_VALUE);
		System.out.println("byte 최댓값:" + Short.MAX_VALUE);
		
		System.out.println("byte 최솟값:" + Integer.MIN_VALUE);
		System.out.println("byte 최댓값:" + Integer.MAX_VALUE);
		
		System.out.println("byte 최솟값:" + Long.MIN_VALUE);
		System.out.println("byte 최댓값:" + Long.MAX_VALUE);
		/*실수 (부동소수점)
		 * float   4byte 
		 * double  8byte <- 주로 더 많이 씀 */
         
		float floatNum = 3.14f; // f,F(주로 소문자) 붙이기
		System.out.println("floatNum:" + floatNum);
		
		double doubleNum = 3.14158267374;
		System.out.println("doubleNum:" + doubleNum);
		
		System.out.println("float 최솟값:" + Float.MIN_VALUE);
		System.out.println("float 최댓값:" + Float.MAX_VALUE);
		
		System.out.println("double 최솟값:" + Double.MIN_VALUE);
		System.out.println("double 최댓값:" + Double.MAX_VALUE);
		
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288; //d
	    
	    System.out.println("num1:" + num1); //3.1415927
	    System.out.println("num2:" + num2); //3.141592653589793
        
	    //논리 데이터 타입
	    //참(true), 거짓(false) //소문자
	    //boolean 1byte   true, false
	    boolean flag = true;
	    System.out.println("flag:" + flag);
	    
	    //문자와 문자열 데이터 타입
	    // 문자
	    /*메모리의 문자 데이터를 저장하기 위해 사용하는 데이터 타입
	     * char    2byte
	     * 
	     * */
	    char ch = 'a';  //''만
	    System.out.println("ch:" + ch); // a
	    
	    ch = 'b';
	    System.out.println("ch:" + ch); // b
	    
	    //ch = 'hello'; //error
	    
	    // 빈문자(empty) vs 공백문자(space)
	    //char char1 = '';// 문자가 하나가 있어야하기 때문에 안된다
	    char char2 = ' '; // 공백하나가 있어서 가능하다
	    System.out.println("char2:" + char2);
	    
	    //문자는 메모리에 저장될 때 정수(유니코드)로 저장이 된다
	    char char3 = 'A';
	    System.out.println("char3:" + char3);// A
	    
	    int unicode = char3; // int 숫자
	    System.out.println("unicode" + unicode); //65
	    
	    char char4 = 'ㄱ';
	    System.out.println("char4:" + char4); //ㄱ
	    
	    unicode = char4;
	    System.out.println("unicode:" +unicode); //12593
	    
	    char char5 = 65;
	    System.out.println("char3:" +char3); //A
	    
        char5 = 12593;
	    System.out.println("char5:" +char5); //ㄱ
	    
	    //문자열
	    //String
	    String str1 = "Hello";
	    System.out.println("str1:" + str1);
	    
	    // str1 = ""; ok
	    // str1 = " "; ok
	    
	    // 콘솔을 이용한 데이터 입력, 출력
	    // 데이터 출력
	    System.out.print("hello pythone"); // 개행하지 X
	    System.out.println("hello java"); // ln = line 
	    System.out.print("hello pythone\n");
	    
	    String str = "hello~";
	    System.out.println(str);
	    
	    /*특수 문자 정리 
	     * \n 개행(줄바꿈)
	     * \t 탭(4칸 공백)
	     * \' 작은따옴표(')
	     * \" 큰 따옴표(")
	     * \\ 역슬래쉬(\)*/
	    System.out.println("이름\t학번\n");
	    System.out.println("Mr. H\t2020_000123");
	    System.out.println("Mr. H\t2020_000124");
	    
	    System.out.println("어머님께서는 \"밥먹고 설거지 해놔라.\"라고 하셨습니다.");
	    System.out.println("그래서 나는 \'네.\'라고 했습니다."); 
	    
	    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");// 2개씩 짝
	    System.out.println("\\\\\\2020-08-01\\\\\\\\");
	    
	    //데이터 입력
	    Scanner scanner = new Scanner(System.in);
	 /*  Scanner scanner = new Scanner(System.in); // 외부로부터 데이터를 입력받는 기능
	   
	  // String inputStr = scanner.nextLine();
	  // System.out.println("inputStr:" + inputStr);
	   
	   //nextByte() : 정수 입력
	   //nextInt() : 정수 입력
	   //nextLong() : 정수 입력
	   //nextFloat() : 실수 입력
	   //nextDouble() : 실수 입력
	   //nextLine() : 문자열 입력
	   //nextBoolean() : 논리 입력
	   
	   int inputInt = scanner.nextInt(); // 10
	   System.out.println("inputInt:" + inputInt); // inPutInt:10
	   
	   scanner.nextLine();
	   
	   String inputString =  scanner.nextLine();  //java
	   System.out.println("inputString:" + inputString); //inPutString: java
	   
	   scanner.close(); // 외부자원을 연결했으면 끊어주는 작업도 해주자!
	   // 한 번 차단 된 스트림은 다시 사용할 수 없다
	   // 안하면 자원(메모리)가 세어나간다
	    */
	   
	    String inputString = scanner.next(); // hello java ,hello
	    System.out.println("inputString:" + inputString);
	    
	    // java \n
	    
	    inputString = scanner.nextLine(); //java \n
	    System.out.println("inputString:" + inputString); //java
	    
	    scanner.close();
	    
	    
	}

}
