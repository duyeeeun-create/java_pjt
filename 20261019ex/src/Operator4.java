
public class Operator4 {

	public static void main(String[] args) {
		/* 
		 * 논리 연산자(Boolean)
		 * && : and 연산자       A && B => A와B가 모두 true인 경우에만 true
		 * || : or 연산자        A || B => A또는 B 하나라도 true인 경우에만 true
		 * ! : 부정 (not) 연산자  !A    => A의 현재 상태를 부정 true -> false , false -> true
		 * */
		int num1 = 10;
		int num2 = 20; 
		int num3 = 30;
		boolean result = ( num1 < num3) && (num2 < num3); // true && true => true
		System.out.println("result:" + result);
		
	    result = ( num1 > num3) && (num2 < num3); // false && true => false
		System.out.println("result:" + result);
		
		result = ( num1 > num3) || (num2 < num3); // false || true => true
		System.out.println("result:" + result);
		
	    result = (num1 < num2) && (num2 < num3)&& (num3 > num1); 
	    //true && true => true
	                          //true && true => true
	    System.out.println("result:" + result);
	    
	    System.out.println(!true); // false 
	    System.out.println(!!true); //true
	    
	    /*
	     * &&와 || 중에서 어떤 연산자의 연산 우선순위가 높을까?
	     * */
	    
	    boolean res = false;
	    int no1 = 10;
	    int no2 = 20;
	    int no3 = 30;
	    
	    res = (no1 < no3) || (no2 < no3) && (no1 > no3); //true// && 우선순위가 높다
	    System.out.println("res:" + res);
	    
	    /*조건식 연산자(삼항식 연산자)
	      */
        int passScore = 80;
        int myScore = 90;
        
        //나의 점수가 80 이상이면 PASS 출력 그렇지 않으면 FAIL 을 출력 ******
        
        String resultScore = (myScore >= passScore) ? "PASS" : "FAIL"; //true인 경우 : false인 경우
        System.out.println("resultScore:" + resultScore); //PASS
	    
        //Python에서 삼항 연산자
        // true 인 경우 if 조건식 else false 인 경우

        
	}

}
