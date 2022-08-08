package edu.kh.op.prcatice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		// sc.next() : 한 단어 입력, 띄어쓰기 미포함
		//             => 띄어쓰기, 엔터가 입력 종료를 의미      
		// sc.nextline() : 한 문장(한 줄)입력, 띄어쓰기 포함
		//                 => 엔터가 입력 종료를 의미
		
		// NextLine()을 쓸경우 버퍼에 맨앞에 남은 엔터를 꺼내옴
	    // -> 문자열을 입력하지 못하고 넘어감
		
		 System.out.print("이름 : ");
		 String name = sc.next();
		 System.out.print("학년(정수) : ");
		 int grade = sc.nextInt();
		 System.out.print("반(정수) : ");
		 int classroom = sc.nextInt();
		 System.out.print("번호(정수) : ");
		 int Number = sc.nextInt();
		 // 버퍼에 맨앞에 남은 엔터가 남음
		 // -> 문자열을 입력하지 못하고 넘어감
		 
		// ▶ 해결방법 : 입력버퍼 맨앞에 있는 엔터(개행문자)를 제거
			// 맨 앞에 엔터(개행문자)가 남는 경우
			// -> next(), nextInt(), nextFloat(),nextDouble().... nextLine()을 제외한 모두 
			// -> 뒤에 sc.nextLine()을 한번 더 작성하기 
		 
		 sc.nextLine(); // 입력 버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼 청소
		 
		 System.out.print("성별(남학생/여학생) : ");
		 String gender = sc.nextLine(); 
		 System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		 double score = sc.nextDouble();
		 
	     System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점입니다.", grade, classroom, Number, name, gender, score);
	  
	}

}
