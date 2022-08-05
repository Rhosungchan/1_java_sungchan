package edu.kh.variable.ex1;

public class VariableExample1 {

	public static void main(String[] args) {
		
	    System.out.println("[변수 사용x]");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		
		System.out.println("===========================");
		
		System.out.println("[변수 사용 0]");
		
		double pi = 3.141592653589793;
		int r = 10;
		int h = 20;
		
		//System.out.println(pi);
		//System.out.println(3.141592653589793);
			
		System.out.println( 2 * pi * r ); // 원의 둘레
		System.out.println( pi * r * r ); // 원의 넓이
		System.out.println( pi * r * r  * h ); // 원기둥의 부피 
		System.out.println( 4 * pi * r * r );  // 구의 겉넓이
		
		// <변수(Variable)>
		// = 메모리(RAM)에 값을 기록하는 공간
		//   ->> 공간(박스)에 기록되는 값(Date)이 변할 수 있어서 변수라고 함.
		
		// = 값(Date)의 형태와 크기에 따라서 변수의 형태(자료형)는 달라져야 한다.
		
		// <변수 사용의 장점> 
		// 1. 재사용성의 증가 ( 한 번 만든 변수를 계속 사용)
		// 2. 가독성 향상 
		// 3. 코드 길이 감소
		// 4. 유지보수성 향상 
		
		//<변수의 선언>
	    // 논리형 변수 선언   ==  boolean isTrue; 
		// 정수형 변수 선언   ==  byte bNum;
		   //                     short sNum;
		   //                     int iNum;
		   //                     long lNum;
		// 문자형 변수 선언   ==  char ch; 
		
		// 실수형 변수 선언   ==  float fNum;
           //                     double dNum;
		
		// 문자열 변수 선언   ==  String str; 
		
		
		
		
		
		
	}
	
}
