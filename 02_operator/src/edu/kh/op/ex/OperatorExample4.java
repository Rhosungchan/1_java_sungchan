package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
		

		//  논리 연산자 : &&(AND), ||(OR)
		
		//  &&(AND) 연산자 : 둘 다 true이면 true, 나머지 false
		//  사용할 때 : ~와, 그리고(~이고), ~이면서(~면서), ~부터 ~까지, ~사이   
		
		//  예시 1번)
		    int a = 101;
		    
		    // a는 100이상 이면서 짝수인가?
		    
		    boolean result1 = a >= 100 ; // a는 100이상? -> True
		    boolean result2 = a % 2 == 0;  // a는 짝수인가? false
		    
		    System.out.println("a는 100이상 이면서 짝수인가? " + (result1 && result2)); // 연산순위 때문에 ()를 써야 한다. 
		                                                                                // 연산순위 = +는 4위, &&는 11위   
		    
		 // 예시 2번)    
		    
		    int b = 5;
		    
		    // b는 1부터 10 사이의 정수인가?
		    boolean result3 = 1 <= b ;    // b는 1 이상인가?
		    boolean result4 = b <= 10 ;   // b는 10이하인가?
		    
		    System.out.println("b는 1부터 10사이의 정수인가? " + (result3 && result4));
 		    
		    
		//  ||(OR) 연산자 : 둘 다 false이면 false, 나머지 True 
		//  또는, ~거나, ~이거나
		   
		// 예시 1번)
		    
		   int c = 10;
		   
		   // c는 홀수이거나 10을 초과한 수인가?
		   System.out.print("C는 홀수 이거나 10을 초과한 수인가? : ");
		   System.out.println( (c % 2 == 1 ) || ( c > 10 ) ); // false
		                      
		   int d = 20;
		   
		   // d는 1부터 100 사이 숫자 또는 음수인가?
		 
		   boolean result5 = 1 <= d && d <= 100 || d < 0;
		   System.out.println("d는 1부터 100 사이 숫자 또는 음수인가? " + result5);
		   
		   
		   System.out.println("-----------------------------------"); 
		  
		// 논리 부정 연산자 : !(NOT)   
		// 논리 값을 반대로 바꾸는 연산자
		   
		   System.out.println("!result5 : " + !result5);  // !true -> false
		    
		   int e = 3;
		   
		   boolean result6 = e >= 1 && e < 5 ;  // e는 1 이상이고, 5미만인가?
           
		   // e은 1미만이거나, 5이상인가?
           boolean result7 = e < 1 || e >= 5;
         
           // result 6와 7은 서로 반대 
           
           System.out.println(result6); // true
           System.out.println(!result6); 
           System.out.println(result7);
	
           System.out.println(!result6 == result7);
	
	}

}
