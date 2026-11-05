package com.office.member;

//import java.security.PublicKey;
import java.util.Scanner;

public class MemberController implements MemberConfig{
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);	
		boolean systmFlag = true;
//		MemberService memberService = new MemberService();
		
		if(IS_DEV) 
			
			new MemberDumy().signUpForDumy(memberService);
		
		String mamId;
		String mamPw;
		String mamMail;
		String mamPhone;
		MemberDto memberDto ;
		
		while(systmFlag) {
			System.out.println("1.SIGN-UP  2.SIGN-IN  3.MODIFY  4.DELETE  99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
			    System.out.println("Input new member ID");
			    mamId =	scanner.next();
			
			    System.out.println("Input new member PW");
			    mamPw =	scanner.next();
			
		   	    System.out.println("Input new member MAIL");
			    mamMail = scanner.next();
			
			    System.out.println("Input new member PHONE");
			    mamPhone = scanner.next();
			    
		  	    memberDto = new MemberDto(mamId, mamPw, mamMail, mamPhone);
				
				memberService.signup(memberDto);
				
				break;

            case SIGN_IN:
            	System.out.println("Input member ID");
   			    mamId =	scanner.next();
   			
   			    System.out.println("Input member PW");
   			    mamPw =	scanner.next();
            	
   			    memberDto = new MemberDto(mamId, mamPw, null, null);
   			
            	memberService.signIn(memberDto);
				break;
				
           case MODIFY:
        	   /*id & pw -> 인증ok -> pw, mail,phone 수정*/
        	    System.out.println("Input member ID!");
  			    mamId =	scanner.next();
  			
  			    System.out.println("Input member PW!");
  			    mamPw =	scanner.next();
  			    
  			   memberDto = new MemberDto(mamId, mamPw, null, null);
  			   boolean isAuthentication =
  					   memberService.doAuthenticationByMemIdAndMemPw(memberDto);
  			   
  			   if(isAuthentication) {
  				   System.out.println("Input member PW!");
  				  mamPw = scanner.next();
  				   
  				  System.out.println("Input member PHONE!");
 				   mamPhone = scanner.next();
 				   
 				  System.out.println("Input member MAIL!");
 				   mamMail = scanner.next();
 				   
 				   
 				   memberDto.setMamMail(mamMail);
 				   memberDto.setMamPhone(mamPhone);
 				   memberDto.setMamPw(mamPw);
 				   
 				   memberService.modify(memberDto);
  			   }
           	
        	   
        	   
				break;
				
           case DELETE:
        	   /*
        	    * 아이디 & 비번 인증후 삭제
        	    * */
        		System.out.println("Input member ID");
   			    mamId =	scanner.next();
   			
   			    System.out.println("Input member PW");
   			    mamPw =	scanner.next();
   			    
   			    memberDto = new MemberDto(mamId, mamPw, null, null);
        	   
        	    memberService.delete(memberDto);
        	    
        	
	            break;
           case SYSTEM_OUT:
        		systmFlag = false;
        		System.out.println("good bye");
	            break;
			}
		}
	} 

}
