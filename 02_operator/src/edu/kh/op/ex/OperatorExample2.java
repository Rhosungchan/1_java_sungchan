package edu.kh.op.ex;

public class OperatorExample2 {

	  public static void main(String[] args) {
		  
		  
		  // 증감 연산자 : ++ , --                                (중요! 복습하기)
		  // 피연산자를 1증가 또는 감소시키는 연산자
		  
		  // 전위연산 : ++a , --a
		  // -> a를 먼저 1증가/감소 시키고 다른 연산을 수행 
		  
		  // 후위연산 : a++ , a--
		  // -> 다른 연산을 먼저 모두 수행한 후 마지막에 a를 1증가/감소 시킴

		   
		     int num1 = 10;
		     int num2 = 10;
		     num1++; // 11
		     num2--; // 9
		     
		     System.out.println("num1++ : "+num1 );
		     System.out.println("num2-- : "+num2 );
		     
		     System.out.println("----------------------------------");
		     
		     System.out.println("++num1 + 10 : " + (++num1 + 10));   // 22 
		     //                    12   + 10 : 22
		     System.out.println("num1 : " + num1); // 12
		     
		     // 후위 연산 
		     System.out.println("num2-- + 10 : " + (num2-- + 10)); //  19
		     System.out.println("num2 : " + num2); // 8
		     
		     
		     // 연습문제 
		     int a = 3;
		     int b = 5;
		     int c = a++ + --b;
		     
		     // c = 3++(a) + --5(b)
		     // c = 3++(a) + 4(b)
		     // c = 7     (3++(a))
		     //             4(a)
		     
		     // 최종적으로 a,b,c는 각각 얼마인가?
		     // a = 4
		     // b = 4
		     // c = 7
		     System.out.printf("a = %d, b = %d, c = %d\n ", a,b,c); 
		     
		    
		    
		     
		     
		  
		  
		  
		  
		  
		  
	  }
}
