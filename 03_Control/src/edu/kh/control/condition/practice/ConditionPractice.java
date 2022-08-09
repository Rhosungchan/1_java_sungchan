package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	
	Scanner sc = new Scanner(System.in);
	
    // 실습문제 1
	
	public void practice1() {
	
		System.out.println("숫자 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
		
	//실습문제 2	
			
	public void practice2() {
		// 풀이 1번
//		System.out.println("국어 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학 : ");
//		int math = sc.nextInt();
//		
//		int sum = kor + eng + math;
//		int avg = (kor + eng + math)/3;
//		
//		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >=60) ? "합격" : "불합격";
//		System.out.println(result + "입니다.");
		
		// 풀이 2번
 		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
     	double avg = sum /3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("축하합니다. 합격입니다.");
		} else { 
			System.out.println("불합격입니다.");
		}
	}	
	
	     //실습문제 3
	public void practice3() {
		
		System.out.println("1~12사이의 정수 입력: ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1 : case 3 :case 5 :case 7 : case 8 : case 10 : 
			case 12 : System.out.printf( "%d월은 31일까지 있습니다.",month); break;

			case 4 : case 6 : case 9 : 
			case 11 : System.out.printf( "%d월은 31일까지 있습니다.",month); break;
			
			case 2 : System.out.printf( "%d월은 31일까지 있습니다.",month); break;
			default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	//실습문제 4
	public void practice4() {
		
		
		System.out.println("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();	
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight/(height*height);
		System.out.println("BMI 지수 : " + BMI);
	
		String result;
		
		if(BMI < 18.5) {
			result = "저체중";
		} else if( BMI < 23 ) {
			result = "정상체중";
		} else if(BMI < 25 ) {
			result = "과체중";
		} else if(BMI < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println(result);
	}
	
	// 실습문제 5
	public void practice5() {
		
		// 변수의 장점: 재사용성
		
		
		System.out.println("중간고사 점수 : ");
		double midTerm = sc.nextInt();	// int로 입력받아도 대입 연산시 double자동 형변환
		System.out.println("기말고사 점수: ");
		double finalTetm = sc.nextInt();	
		System.out.println("과제 점수 : ");
		double report = sc.nextInt();	
		System.out.println("출석 횟수 : ");
		double attendence = sc.nextInt();	
		
		// 각각의 점수를 비율에 맞게 변경
		midTerm *= 0.2; // midTerm = midTerm * 0.2;
		finalTetm *= 0.3;
		report *= 0.3;
		// attendence *= 5 * 0.2; //  5 * 0.2; = 1
		                                      
		
		System.out.println("===============결과===============");

		if(attendence <= 20*(1-0.3)) { // 14번 이하 출석했을 경우
			System.out.println("Fail [출석 횟수 부족]("+(int)attendence+"/20)");
			                                          // 소수점 버림 처리
		} else {                    
			System.out.printf("중간고사 점수(20) : %.1f \n",midTerm);
			System.out.printf("기말고사 점수(30) : %.1f \n",finalTetm);
			System.out.printf("과제 점수(30) : %.1f \n",report);
			System.out.printf("출석 횟수(20) : %.1f \n",attendence );
			
			double sum = midTerm+finalTetm+report+attendence;
			System.out.printf("총점 : %.1f \n",sum);
			
			
			if(sum>=70.0) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [점수미달]");
			}
		}
		
			
		
		
		
	}


	
	
}
