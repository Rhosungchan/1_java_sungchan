package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		
	//-----------------------------------------	
    // ***변수 명명 규칙***
		
		
    // 1. 대소문자가 구분되며 길이 제한이 없다
 	//		(단, 띄어쓰기 안됨)	
		
	//  대소문자 구분 예시
		
		int num1;
		int Num1;
	/*  int Num1;
		-uplicate local variable Num1
		-Num1 변수가 중복이다 (error)         */
		
	// 길이 제한 없음 예시 
		
		int gsadfjklgadsfjil;
		int adsfjgkaslf;  //길이 제한이 없다.
		
	//-----------------------------------------		
	/* 2. 예약어를 사용하면 안된다.
		int int;
		int true;
		boolean final;
		char void;                   */
		
	//-----------------------------------------		
	  // 3. 숫자로 시작하면 안된다.
		
		 int age1;
      // int 1age; - Syntax error on token "1", delete this token
      //           - Syntax error : 문법 오류
	
	//-----------------------------------------		 
	  // 4. 특수문자는 _ 와 $ 만을 허용한다.
	  //  - $는 내부클래스 사용 시 자동으로 붙는 기호(직접 사용 안함)
	  //  - _는 상수 단어 구분 외에는 사용하지않는다.
	  // long longNum!!; 다른 특수문자 사용시 오류 */
		
		 double $dnum;
		 float _f_num$;
		
	//-----------------------------------------		 
		// 5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다.
		//    단, 첫 시작 글자는 소문자로 하는 것이 관례이다.
		 
		 int userAge;
		 int helloWorld; 
	
	//-----------------------------------------		 
		// 참고 : 변수명에 언어제한이 없다.
		//        단, 코드 공유시 글자 깨짐이 발생할 수 있어서 권장 x      
		int 정수1; 
		boolean 참거짓;
		
		
		// ** 변수는 한 개의 데이터만 보관 가능 **
		int iNum = 30;
		System.out.println(iNum);
		iNum = 50;
		System.out.println(iNum); // 마지막 대입한 값만 보관됨      ※ 나중에 다시 해보기! 영상
		
		
	    // 문자열 자료형 String
		// -> 기본 자료형x, 참조형 0
		
		// String의 리터럴 : 문자열
		// String의 리터럴 표기법 : "쌍따옴표"
		
		String str1;
		str1 = "안녕하세요?";    // str1 변수의 초기화(최초 값 대입)
		System.out.println(str1);
		
		str1 = "string도 기본 자료형 변수처럼 값을 변경할 수 있습니다.";
		System.out.println(str1);
		
	//-----------------------------------------		
		// 변수 선언과 동시에 초기화
		
		String name = "노성찬";
		int age = 29;
		char gender = '남';
		
		System.out.println("--------------------------------------------");
		System.out.println(age + 10);  // 숫자 + 숫자 = 두 숫자의 합
		System.out.println(name + "입니다.");  //  문자열 + 문자열 = 이어쓰기 
		System.out.println(name + age);  // 문자열 + 숫자 = 이어쓰기 
		System.out.println(age + 10 + name); // 숫자 + 숫자 + 문자열 = 숫자합 + 문자열 (이어쓰기)  (중요!)
		System.out.println(name + age + 10);  // 문자열 + 숫자 + 숫자 = 이어쓰기                   (중요!)
		                                      // 왼쪽에서 오른쪽으로 순서대로 더하기 
		
		
		// 노성찬님은 29세 남성입니다.
		System.out.println(name + "님은 " + age + "세 " + gender + "성입니다." );
		                   // 띄어쓰기 주의! ""안에서 띄어쓰기 조정
		
		System.out.println("-----------------------------------------------------");
		
   //-----------------------------------------		
		// 상수(final) : 항[상] 같은 [수] 
		// -> java에서는 한번 값을 기록하면 값을 바꿀 수 없는 변수 
		
		
		// 일반 변수 
		int num2 = 200;
		num2 = 300;  // 새로 대입 가능
		
		
		// 상수 (대문자로 표기, 여러 단어일 경우 _로 구분)
		final int CONSTANT_NUMBER = 100000000; //  1억 
		// 마지막으로 값을 대입하는 변수 = 다시는 값을 대입 받지 않겠다.
		// = 변하지 않는 수(상수)

		// CONSTANT_NUMBER = 0;  (error)
		
		System.out.println(CONSTANT_NUMBER);
		
		
	// -----------------------------------------
		// 상수 예제 
		final int UP = 10;
		final int DOWN = -10;
		final int INIT = 0;
		
		int num3 = INIT;
		System.out.println(num3);  // 0
	
		num3 = num3 + UP; 
		System.out.println(num3); // 10
		
		num3 = num3 + DOWN * 3;  // 사칙연산 우선순위 (*,/먼저)
		System.out.println(num3); // -20
		
	}
}
