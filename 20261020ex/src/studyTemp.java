import java.util.Scanner;

public class studyTemp {

	public static void main(String[] args) {
		
		//트리 모양 만들기
		
		int loopCnt3 = 10;      // 반복 횟수

	      for (int i = 1; i <= loopCnt3; i++) {
	          
	          for (int j = 0; j < loopCnt3 - i; j++) {
	              System.out.print(" ");
	          }
	          
	          for (int j = 0; j < (i + 1) * 2 - 3; j++) {
	              System.out.print("*");
	          }
	          
	          System.out.println();
	      }
		
		//과제//사용자가 입력한 숫자로 트리모양 만들기+=
		
			/*	Scanner scanner = new Scanner(System.in);
				
				int  inputNumber = scanner.nextInt();
				
				for (int i = 1; i <= inputNumber; i++ ) {
				    for (int j = 1; j <= inputNumber - i; j++) {
				        System.out.print(" "); 
				    }

				    for (int k = 1; k<= 2 * i - 1; k++) {
				        System.out.print("*");
				       
				    } 

				    System.out.println();
				}
				scanner.close();*/
			}

	} 

