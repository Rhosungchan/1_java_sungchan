package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {

	/* Switch문
	  -> 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	  -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	  
	  [작성법]
	  
	  //Switch문의 식은 결과가 true/false가 아닌 식
	  switch(식) {
	  
	  case 결과값 1 : 수행코드1; break;
	  case 결과값 2 : 수행코드2; break;
	  case 결과값 3 : 수행코드3; break;
	  ...
	  default : 모든 case가 만족하지 않을 경우 수행하는 코드;
	  
	  }     */
		
	
	public void ex1() {
		//키보드로 정수를 입력받아 
		// 1이면 "빨간색"
		// 2이면 "주황색"
		// 3이면 "노랑색"
		// 4이면 "초록색"
	    // 1~4가 아니면 "흰색"을 출력 
		
		Scanner sc = new Scanner(System.in); 
		
			System.out.println("정수 입력 : ");
			int input = sc.nextInt();
			
			String result;
//			
//			if(input == 1) {
//				result = "빨간색";
//			} else if (input == 2) {
//				result = "주황색";
//			} else if (input == 3) {
//				result = "노란색";
//			} else if (input == 4) {
//				result = "초록색";
//			} else { 
//			    result = "흰색";  
//			}
//          범위 드래그로 영역 지정 한 후 crtl + /  => 범위주석  
//			
			
			
			// 식 == 여러 값이 나오는 경우
			
			switch(input) {
			case 1 : result = "빨간색"; break;	
			case 2 : result = "주황색"; break;	
			case 3 : result = "노란색"; break;	
			case 4 : result = "초록색"; break;	
			default : result = "흰색";
			}
			
			 System.out.println(result);
		
	}
	// -------------------------------------------------------------------//
	
	public void ex2() {
		// 실습
		// 정수를 입력 받아
		// 나머지가 1이면 "백팀"
		// 나머지가 2이면 "청팀"
		// 나머지가 3이면 "홍팀"
		// 나머지가 1~3이 아니면 "깍두기"
		
		// 실행화면 
		// 정수 입력 : 1
		// 백팀입니다.
		
		// 정수입력 : 4
		// 깍두기입니다.
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
				
		String result; 
		
		switch(input % 4) {
			case 1 : result = "백팀"; break;
			case 2 : result = "청팀"; break;
			case 3 : result = "홍팀"; break;
			default : result = "깍두기"; break;
		}
		    System.err.println(result + "입니다.");
		
		
	}
	// -------------------------------------------------------------------//
	
	public void ex3() {
		
		// switch문의 식 결과가 double형인 경우 -> 안됨
		// switch문의 식 결과가 String인 경우
		// switch의 식은 int, String만 가능 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("김밥(3,000원) / 라면(4,000원) / 샌드위치(5,000원) / 짬뽕(10,000원)");
		System.err.print("메뉴 입력 : ");
		
		String input = sc.next();
		int result;
		
		switch(input) {
		case "김밥" : result = 3000; break; 
		case "라면" : result = 4000; break; 
		case "샌드위치" : result = 6000; break; 
		case "짬뽕" : result = 10000; break; 
		default : result = -1; // 잘못 입력하면 -1이라고 의미 부여 (임의로 개발자 마음대
		}
		if(result == -1) {
			System.err.println("잘못 입력하셨습니다.");
		} else {
			System.out.printf("%s은 %d원입니다.\n", input,result);
		}
	
		// -------------------------------------------------------------------//
	}
	
	
	public void ex4() {
		// 산술 연산 계산기 만들기
		// 두 정수(int)와 1개의 연산자( + - * / %(String))를 입력받아서
		// 연산 결과를 출력
		// 단, 나누기(/) 연산 시 0으로는 나눌 수 없도록 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 =sc. nextInt();

		
		System.out.print("연산자 입력 : ");
		String op =sc.next();

		
		System.out.print("정수2 입력 : ");
		int num2 =sc. nextInt();
		
		// [실행화면]
		// 정수1 입력 : 5
		// 연산자 입력 : +
		// 정수2 입력 : 4
		// 5 + 4 = 9
		
		// [실행화면]
		// 정수1 입력 : 5
		// 연산자 입력 : /
		// 정수2 입력 : 0
		// 0으로는 나눌 수 없습니다.
	
		// [실행화면]
		// 정수1 입력 : 5
		// 연산자 입력 : @
		// 정수2 입력 : 3
		// 존재하지 않는 연산자입니다.
	
		
		switch(op){
			case "+" : System.out.printf( "%d %s %d = %d", num1, op, num2, num1 + num2 ); break;
			case "-" : System.out.printf( "%d %s %d = %d", num1, op, num2, num1 - num2 ); break;
			case "*" : System.out.printf( "%d %s %d = %d", num1, op, num2, num1 * num2 ); break;
			case "/" : 
				                                                             // 두번째 입력한 정수가 0인 경우
		if( num2 == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {                                                             // 두번째 입력한 정수가 0이 아닌 경우
			System.out.printf( "%d %s %d = %d", num1, op, num2, num1 / num2 );
		} break;
			
			case "%" : System.out.printf( "%d %s %d = %d", num1, op, num2, num1 % num2 );  break;
			default : System.out.println("존재하지 않는 연산자입니다.");
		}

		}
	// -------------------------------------------------------------------//
	
	public void ex5() {
		
		// switch문의 break 역할
		// 계절 판별 (switch버전)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season;
		
		// switch문에서 break는 "해당 case를 수행한 후 멈춰라" 라는 뜻
		
		// break가 없을 경우
		// -> 다음 case가 연달아서 수행된다.!    
		
		switch(month) {
		case 3  : case 4  : case 5  : season = "봄";   break;
		case 6  : case 7  : case 8  : season = "여름"; break;
		case 9  : case 10 : case 11 : season = "가을"; break;
		case 12 : case 1  : case 2  : season = "겨울"; break;
		default : season = "잘못 입력하셨습니다.";
		}
				// 위와 같은 방식으로 가독성있게 정리해도된다.!(필기)
        System.out.println(season);   		
		
		
		
		
		
		
  }
}