public class LoopEx {
	
         public static void main(String[] args) {
//        	 /*for 문 : 횟수에 의한 반복 실행 해야할때
//        	  * while 문 : 조건에 의한 반복 실행 해야할 때*/
//        	 // 안녕하세요. 를 5회 출력하자
//        	 
//        	 //for(초기화; 조건식; 단계)
//        	 //for(시작; 끝; 단계)
//        	 
//        	 for (int i = 1; i < 6; i++) {
//        		 System.out.println("안녕하세요.");
//        	 }
//        	 
//        	 for (int i = 1; i < 10; i += 2 ) {
//        		 System.out.println("안녕.");
//        	 }
//        	 
//        	 int i = 1; // 전역변수
//        	 for (; i < 6; i++) {
//        		 System.out.println("Hello.");
//        	 }
//        	 
//        	 int j = 0;
//        	 for (j = 5; j < 6; j++) {
//        		 System.out.println("Helo.");
//        	 }
//        	 
//        	 for(int k = 0; k < 10; ++k) {
//        		 System.out.println("o");
//        	 }// 전위후위 상관없음
        	 
        	 //1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들어보자
//        	 Scanner scanner = new Scanner(System.in);
//        	 
//        	 System.out.println("정수를 입력하세요.");
//        	 int inputData = scanner.nextInt();
//        	 
//        	 int sum = 0;
//         	 for (int i = 1; i <= inputData; i++ ) {
//         		 sum += i;
//         	 }
//         	 
//         	 System.out.println("sum :" + sum);
//         	 
//         	 scanner.close();
        	 //3단 구구단 출력
        		
	        	// for (int i = 1; i < 10; i++) {
	        		// System.out.println("3 * " + i+ " = " + (3 * i));
	        	    //System.out.printf("3 * %d = %d%n", i, (3 * i));
	        		 //System.out.printf( String.format("3 * %d = %d", i, (3 * i)));
	        	// }
	        	 
	        	 // 전체 구구단 (가로 모드, 세로모드) 출력하자
	        	 
	        	/*for (int i = 1; i < 10; i++) {
	        		for(int n =1; n < 10; n++) {
	        		System.out.printf("%d * %d = %d%n",i, n, (n * i));} } *///세로 출력
	        	
         	/*for (int i = 1; i < 10; i++) {
	             	for(int n =1; n < 10; n++) {
	              	System.out.printf("%3d * %d = %d",i, n, (n * i));}} // 가로 출력*/
	        	
	        	// 사용자에게 원하는 구구단을 입력받아 출력해보자
//	
//	         Scanner scanner = new Scanner(System.in);
//	         
//	         int inputNumber = scanner.nextInt();
//	         
//	         for (int i = 1; i < 10; i++) {
//	        		
//	        	    System.out.printf("%d * %d = %d%n", inputNumber,i,(inputNumber * i));
//	        		 
//	        	 }
//	         
//	        scanner.close();		
//	        
//        	 
//        	 
//        	 // 중첩 for, if문을 이용할때 절대 3단계 이상을 사용하지 말자
        	 
        	/* for (int i = 0; i < 10; i++) {
        		 for (int j = 0; j < 10; j++) {
        			 for (int k = 0; k < 10; k++) {
        				 
        			 }
        		 }
        	 }*/
        	 
        	/*
        	 * *
        	 * **
        	 * ***
        	 * ****
        	 * *****
        	 * 
        	 * *****
        	 * ****
        	 * ***
        	 * **
        	 */
        	 
//        	 for( int i = 1; i <= 5; i++) {
//        		 for( int j = 0; j < i; j++) {
//        			 System.out.print("*");
//        		 }
//        		 System.out.println();
//        	 }
//        	 
//        	 
//        	 for( int i = 1; i <= 5; i++) {
//        		 for( int j = 0; j <= 5 - i; j++) {
//        			 System.out.print("*");
//        		 }
//        		 System.out.println();
//        	 }
//        	 
//        	 
//        	 for( int i = 1; i <= 5; i++) {
//        		 for( int j = 0; j < 5 - i; j++) {
//        			 System.out.print(" ");
//        		 }
//        		 for( int k = 0; k < i; k++) {
//        			 System.out.print("*");
//        		 }
//        		 System.out.println(); 
//        	 }
        	 
        	//과제//사용자가 입력한 숫자로 트리모양 만들기+=
        	 
        	 /*달력 만들기*/
        	 System.out.println("MON\tTUE\tWEN\tTHU\tFRI\tSAT\tSUN");
        	 int offset = 3;
        	 int day = 1;
        	 
        	 for(int i = 0; i < 5; i++) {
        		 
        		 //-
        		 for (int j = 0; j < offset; j++) {
        			 System.out.print(String.format("%2c\t", '-'));
        		 }
        		 //날짜
        		 for(int j =0; j < 7 - offset; j++) { 
        			 if(day <= 30) {
        			 System.out.print(String.format("%2d\t", day));
        			 day++;
        			 }else {
        				 System.out.print(String.format("%2c\t", '-'));
        			 }
        		 }
        		 offset = 0;
        		 System.out.println();
        	 }
        	 
        	 
        	
        	 
}
}
