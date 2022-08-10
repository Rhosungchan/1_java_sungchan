package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	
	// for문 
	// - 끝이 정해져 있는 경우 사용하는 반복문
	//   (=반복횟수가 지정되어 있는 경우)
	// [작성법]
	// 
	// for(초기식; 조건식; 증감식) {
    //	   조건식이 true일 때 반복 수행할 코드
	// }
	// 초기식 : for문을 제어하는 용도의 변수 선언
    // 조건식 : for문의 반복 여부를 지정하는 식
    //          조건식이 true인 경우에 반복을 수행함
    //          보통 초기식에 사용된 변수를 이용해서 조건식을 작성함.
    // 증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
    //          보통 초기식에 사용된 변수를 증가/감소 시켜
    //          조건식의 결과를 변화게 만듦. 
	
	
	
	//---------------for문 기초 사용법 1------------------
	// 문제 : 1~10까지 반복 출력                               (i= 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	public void ex1() {
		  
		  for(int i = 1  ;  i <= 10  ;  i++) {
//		     1) 초기식   ; 2) 조건식 ; 4) 증감식;    
//                         5)          7)
			  
			  System.out.print(i+"출력 ");
//			  3) 반복수행할 코드
//			  6) 			  
			  
//            1,2,3,4,  수행 후 -> 5 ~ 7 반복  
			  
		/* for문 수행 순서	  
		   1) 초기식에 1대입
		   2) 조건식에 1대입 = True 
		   3) 반복수행할 코드에 대입 (System.out.println(i+"출력");) => 1출력
		   4) 증감식에 1 대입 => 2 
		   5) 조건식에 2 대입 = True
		   6) 반복수행할 코드에 대입 (System.out.println(i+"출력");) => 2출력
		   7) 증감식에 2대입 => 3
		   이후 5 ~ 7 반복하다가 11이 조건식에 대입되어 False가 되면 중지 */	                                       
		  }
	}
	
	
	
	//---------------------- for문 기초 사용법 2-1 ---------------------------
    //  문제 : 5부터 12까지 1씩 증가하면서 출력  		
	
	public void ex2() {
		
		for(int i = 5 ; i <= 12 ; i++  ) {
//          1)      ;	2)		  4)
//                      5)        7) 		
			
//          3)
//          6)			
			System.out.print(i+"출력 ");
	}
	
	System.out.println("==============================");
	
	
	// --------------for문 기초 사용법 2-2---------------------------------- 
	// 문제 : 1부터 100까지의 모든 정수의 합 
	
	int sum = 0;   // 합계 저장용 변수 
                   // 왜 0으로 초기화 하는가?
	               // -> 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어
	               //    누적이 필요한 상황에서 기준점으로 사용하기 적합하다.
	
	for(int i = 1 ; i <= 100   ; i++ ) {
		
	        // i값이 1~100까지 1씩 증가하는데
		    // => 이 i값을 sum변수에 계속 누적
	 	    sum += i;    // sum = sum + i; (복합연산자) 
		    
	}
			System.out.println("1~100까지의 합 : "+ sum);
	
	}
	
	// ----------------------for문 기초 사용법 3------------------------
	// 문제 : 두 정수를 입력 받아
	//        두 정수 사이의 모든 정수 합을 출력 
	//        (num1 부터 num2 까지)  
	//        단, 첫 번째 입력이 두 번째 입력보다 작아야 한다.
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;  // 합계 저장용 변수
		
		for(int i = num1 ; i <= num2 ; i++ ) {
			sum += i;  // 누적
		}
		System.out.printf("%d부터 %d까지의 합 : %d \n",num1,num2,sum);
		
	}
	
	//---------------------- for문 기초 사용법 4-1 ------------------------
	// 문제 : 1부터 100까지 3씩 증가하며 출력  
	//        ex) 1 4 7 10 13 16 19 22 28 31 ...
	
	   public void ex4() {
		   
		 for(int i = 1 ; i <= 100 ; i += 3 ) {
			 
			 // 1씩 증가 ->  i++ -> i = i + 1
			 // 3씩 증가 ->  i+=3
			 
			 System.out.print(i + " ");
		 }
	   
		 System.out.println("\n===========================================");
	
    //----------------------for문 기초 사용법 4-2--------------------------
    // 문제 : 10부터 20까지 0.5증가
	   
	   for(double i =10.0 ; i <= 20.0 ; i += 0.5 ) {
		   System.out.print(i + " ");
	   }
	 }
	   
    //----------------------for문 기초 사용법 5-----------------------------
	// 문제 : A ~ Z까지 출력  (for문 + char + 자동/강제 형변환 응용)
	    
	   public void ex5() {
		   
// 문제 풀이 1번
		         for(int i = 'A' ; i <= 'Z' ; i++) {
			         System.out.println((char)i);
		         }
		   
// 문제 풀이 2번   		   
//		         for(char i = 'A'; i <= 'Z'; i++) {
//			         System.out.print(i);
//		         }
	   }
    //----------------------for문 기초 사용법 6------------------------------
	// 10부터 1까지 1씩 감소하면서 출력
	   
	   public void ex6() {
	   
		// 문제 풀이 1번 
		for(int i = 1 ; i >= 10 ; i--) {
			System.out.print(i+" ");
			}
		// 문제 풀이 2번 
		for(int i = 10 ; i >= 1 ; i--) {
			System.out.print(i+" ");
			}
	   	}
	   
     //---------------------for문 기초 사용법 7---------------------------------	
	 // (응용)문제 : 정수 5개를 입력 받아서 합계 구하기 (입력, sum, for 응용)  
	    
	   public void ex7() {
		   Scanner sc = new Scanner(System.in);
		   
		   int sum = 0;
		   
		   for(int i=1; i<=5 ; i++) {
			   
			   System.out.print("입력 "+i+" : ");                 
			   sum += sc.nextInt();
			   // 입력 버퍼에서 다음 정수를 얻어와 sum 변수에 누적
		   }
		   System.out.println("합계 : "+sum); 
		   
	   }
	  //---------------------for문 기초 사용법 8---------------------------------
	  //(응용)문제 : ex7 응용 
	  // 정수를 몇 번 입력 받을 지 먼저 입력 받고 입력된 정수의 합계를 출력 
	  //   
	  //   ex)                                       ex)
	  //   입력 받을 정수의 개수 : 3                 입력 받을 정수의 개수 : 2     
	  //   입력 1 : 10                               입력 1 : 10
	  //   입력 2 : 20                               입력 2 : 20
	  //   입력 3 : 30                               합계 : 30
	  //   합계 : 60
	   
	  // 문제 풀이  	   
	   public void ex8() {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("입력 받을 정수의 개수 : ");
		  int input = sc.nextInt();

		  int sum = 0;
		  
		  for(int i=1 ; i <= input ; i++) {
			  System.out.print("입력 "+i+" : ");
			  sum += sc.nextInt();
		  }
		  System.out.print("합계 : "+sum);
	   }
	   
	  //---------------------for문 기초 사용법 9--------------------------------
      // (기초)문제 : for문, %(나머지), if-else 활용
	  //              1부터 20까지 증가하며 출력             0
	  //              단, 5의 배수에는 ()를 붙여서 출력  
	  //          ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 12 13 14 (15)   
	   
	   public void ex9() {
		   
		   for(int i= 1 ; i<=20 ; i++) {
			   
			   if(i%5==0) {
				   System.out.print("("+i+") ");
			   } else {
				   System.out.print(i+" ");
			   }
		   }
	   }
	  //-------------------------for문 기초 사용법 10-----------------------------
	  // (응용)문제 : 구구단 출력 (for문, if문, Scanner, 논리연산자, print 메서드)
	  //              2 ~ 9사이의 수를 하나 입력 받아 
	  //              해당하는 수의 단을 출력 
	  //              단, 입력 받은 수가 2~9사이가 아니라면 "잘못 입력하셨습니다." 출력  
	   
	   public void ex10() {
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.print("단(2~9) 입력 : ");
		   int dan = sc.nextInt();
		   
		   if(dan < 2 || dan > 9) {
			   // !(dan >=2 && dan <=9)도 대체 사용 가능 
			   System.out.println("잘못 입력하셨습니다.");
		   } else { 
			   for(int i = 1; i <= 9 ; i++) {
				   System.out.printf("%d X %d = %d \n",dan,i,dan*i );
			   }
			   System.out.println("======================================================");
			   for(int i = 9; i >= 1 ; i--) {
				   System.out.printf("%d X %d = %d \n",dan,i,dan*i );
			   }
		   }
	   }
	   //=============================================================================
	   //=============================================================================
	   //                           [ 중첩 반복문 ]
	   //                         중첩 반복문 실습 1번 
	   //   [실행화면]
	   //   12345
       //   12345
       //   12345
       //   12345
       //   12345
	      
	   public void ex11() {
		   
		  for(int x = 1 ; x <= 4 ; x++) {                     // 4번반복
			  
			  for(int i = 1 ; i <= 5 ; i++) {                 // 12345
				  System.out.print(i); 
			  }
			  System.out.println();                           // ()안의 내용을 출력하고 줄 바꿈(개행)
		  }
		   
	   }
	   
	   //=============================================================================
	   //                           중첩 반복문 실습 2번
	   // (응용)문제 : 구구단 2단부터 9단까지 모두 출력 
	   //  2X1=2   2X2=4   2X3=6 
	   //  3X1=3   3X2=6   3X3=9
	   //  4X1=4   4X2=8   4X3=12
	   //  5X1=5   5X2=10  5X3=15 
	   //  ......
	   //  9X1=9   9X2=18  9X3=27 
	   
	public void ex12() {
		   
		   for(int dan=2 ;  dan<=9 ; dan++) {
			   
			   for(int i=1; i<=9 ; i++) {
				   System.out.printf("%dX%d=%2d ",dan,i,dan*i);           //  %2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력 
				   
			   }
			   System.out.println();                                      // 줄 바꿈 
		   }
		   
	   }
	   
	 //=============================================================================
     //                          중첩 반복문 실습 3번
	 // 문제 : 2중 for문을 이용하여 다음 모양을 출력하세요.
	 // 실행화면 
	   
	 //  1
	 //  12   
	 //  123  
	 //  1234  
	   
	    public void ex13() {
	    	
	    	for(int x=1 ; x<=4 ; x++) {
	    		
	    		for(int i=1; i<=x; i++) {
	    			System.out.print(i);
	    			
	    		}
	    		System.out.println();
	    	}
	    }
	   
	 //=============================================================================
     //      중첩 반복문 실습 4번
     // 문제 : 2중 for문을 이용하여 다음 모양을 출력하세요.
	    
	 //  4
	 //  43   
	 //  432  
	 //  4321 
	    
	 //  (권장) 문재 풀이 1 
	    public void ex14() {
	    	for(int x=4 ; x>=1 ; x--) {
	    		for(int i=4; i>=x; i--) {
	    			System.out.print(i);
	    		}
	    		System.out.println();
	    	}
	 // 문제 풀이 2  
	    	for(int x=1 ; x<=4 ; x++) {
	    		
	    		for(int i=4; i >= 5-x; i--) {
	    			System.out.print(i);
	    			
	    		}
	    		System.out.println();
	    	}
	    }
	    	
	  //=============================================================================
	  //               중첩 반복문 실습 5번
	  // 문제 : 2중 for문을 이용하여 다음 모양을 출력하세요.	
	  
	  // 입력된 정수 : 4                  입려된 정수 : 5
	  // 4321                             54321    
	  // 321                              4321
	  // 21                               21
	  // 1                                1 
	    
	    
	    public void ex15() {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("입력된 정수 : ");
	    	int input = sc.nextInt();
	    	
	    	for(int x=input; x>=1;x--) {
	    		for(int i=x; i>=1; i--) {
	    			System.out.print(i);
	    	}
	    		System.out.println();
	    }
	    	
	   }
	    	
	  //=============================================================================  
      //               중첩 반복문 실습 6번
      // 문제 : 2중 for문을 이용하여 다음 모양을 출력하세요.	
	  // *                         // row == 행(한 줄)
	  // **                        // column == 열(한 칸)  
	  // ***
	  // ****  
	  // *****
	    
	    public void ex16() {
	    	
	    	for(int row =1; row<= 5 ; row++) {
	    		for(int col=1; col<=row; col++) {
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
	  //=============================================================================   
	  //                반목문 실습 7번 
      // 문제 : 1부터 20 사이의 3의 배수의 개수 출력 	 
	  //        (count, %(나머지), for문을 이용한 검색) 
	  
	  // Tip) 1. 합계 : sum  / 개수 : count
	  
	    
	    public void ex17() {
	    	int sum = 0;
	    	int count = 0;  //수를 셀 때는 0부터 1씩 증가시키면서 세는 것이 보통
	    	for(int i =1 ; i<=20 ; i++) {
	    		// 3의 배수만 출력 
	            if(i%3==0) {
	            	System.out.print(i+" ");
	            	sum += i; // 누적
	            	count++;  // 1증가
	            }
	    	}
	    	System.out.println("\nsum : "+ sum);
	    	System.out.println("count : "+ count);
	    }
	    
	  //=============================================================================   
	  //                반목문 실습 7번 
	  // 문제 : 2중 for문과 count를 이용해서 아래 모양 출력하기 
      //        예시
	  //        1  2  3  4
	  //        5  6  7  8
	  //        9 10 11 12  
	    
	    public void ex18() {
	    	
	    	int count=1;
	    	
	    	for(int row=1;row<=3;row++) {
	    		
	    		for(int col=1;col<=4;col++ ) {
	    			
	    			System.out.printf("%3d",count++);
	    			// 후위 증감 연산을 이용하여 출력 후 count값을 1증가
	    			
	    		}
	    		System.out.println();
	    	}
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
}
