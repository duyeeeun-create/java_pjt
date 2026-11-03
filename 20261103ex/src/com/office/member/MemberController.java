package com.office.member;

//import java.security.PublicKey;
import java.util.Scanner;

public class MemberController implements MemberConfig{
	

	
	
	public void execute () {
		
		Scanner scanner = new Scanner(System.in);	
		boolean systmFlag = true;
		MemberService memberService = new MemberService();
		
		while(systmFlag) {
			System.out.println("1.SIGN-UP  2.SIGN-IN  3.MODIFY  4.DELTE  99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				memberService.signup(scanner);
				break;

            case SIGN_IN:
            	memberService.signIn(scanner);
				break;
				
           case MODIFY:
        	   memberService.modify(scanner);
				break;
				
           case DELTE:
        	   memberService.delete(scanner);
	            break;
           case SYSTEM_OUT:
        		systmFlag = false;
        		System.out.println("good bye");
	            break;
			}
		}
	}

}
