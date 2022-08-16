package edu.kh.Array.ex;

import java.util.Scanner;

public class sungchantest {

		//========================연산자=============================
public void ex1() {
	
	// 연산자 실습 문제 1 (완료)
		
		
//			Scanner sc = new Scanner(System.in);
//				System.out.print("인원 수 : ");
//				int input1 = sc.nextInt();
//				System.out.print("사탕 개수 : ");
//				int input2 = sc.nextInt();
//			
//				System.out.println("1인당 사탕 개수 : " + input2/input1);
//				System.out.println("남은 사탕 개수 : " + input2%input1);
}
public void ex2() {
		// 연산자 실습 문제 2 (완료)
			
//			Scanner sc = new Scanner(System.in);
//				System.out.print("이름 : ");
//				String name = sc.next();
//				System.out.print("학년(정수) : ");
//				int grade = sc.nextInt();
//				System.out.print("반(정수) : ");
//				int roomnumber = sc.nextInt();
//				System.out.print("번호(정수) : ");
//				int number =sc.nextInt();
//				System.out.print("성별(남학생/여학생) : ");
//				String gender = sc.next();
//				System.out.print("성적(소수점 아래 둘째 자리까지) : ");
//				double score = sc.nextDouble();
//				
//				System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",grade, roomnumber, number, name, gender, score);
					
}
		// 연산자 실습 문제 3 (복습 필요) 
public void ex3() {
		
//			Scanner sc = new Scanner(System.in);
//				System.out.print("정수 입력 : ");
//				int input = sc.nextInt();
//				String result = input == 0 ? "0": (input > 0 ? "양수" :  "음수");
//				System.out.println(result+"입니다.");
}
public void ex4() {
		// 연산자 실습 문제 4 (완료) 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.print("국어 : ");
//			int kor = sc.nextInt();
//			System.out.print("영어 : ");
//			int eng = sc.nextInt();
//			System.out.print("수학 : ");
//			int math = sc.nextInt();
//
//			int sum = kor+eng+math;
//			double evg = sum / 3;
//		
//			System.out.println("합계 : "+ sum);
//			System.out.println("평균 : "+ evg);
//			
//			String result = (kor >= 40 && eng >= 40 && math >= 40 && evg >=60) ? "합격" : "불합격";   
//			System.out.println(result);
		
		//========================반복문=============================
		
		// 반복문 실습 문제 1 (완료) 
}		
		public void ex5() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input>0) {
				for(int i = 1; i<=input ; i++) {
					System.out.print(i+" ");
				} 
				
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			
		}
		
		// 반복문 실습 문제 2 
		
		public void ex6() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input>0) {
			for(int i = input; i > 0; i--) {
				System.out.print(i+" ");
			} 
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			
		}
		//========================조건문=============================
		// 조건문 실습 문제 1 (완료)
		
		public void ex18() {

			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 한개 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 0) {
				if (num % 2 == 0) {
					System.out.println("짝수입니다.");
				} else {
					System.out.println("홀수입니다.");
				}
			} else {
				System.out.println("양수만 입력해주세요");
			}

		}
		
		// 조건문 실습 문제 2 (완료)
	
		public void ex19() {
			Scanner sc = new Scanner(System.in);
			System.out.print("국어 점수 : " );
			int kor = sc.nextInt();
			System.out.print("영어 점수 : " );
			int eng = sc.nextInt();
			System.out.print("수학 점수 : " );
			int math = sc.nextInt();
			
			int sum = kor+eng+math;
			double evg = sum /3;
			
			if(kor>=40 && eng>=40 && math>=40 && evg>=60) {
				System.out.println("국어 : "+kor);
				System.out.println("영어 : "+eng);
				System.out.println("수학 : "+math);
				System.out.println("합계 : "+sum);
				System.out.println("평균 : "+evg);
				System.out.println("축하합니다. 합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}
		
		// 조건문 실습 문제 3 (완료)
		
		public void ex20() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("1~12사이의 정수 입력 : ");
			int num = sc.nextInt();
			
			if(num>0 && num < 12) {
				switch(num) {
				case 2 : System.out.println(num + "월은 28일까지 있습니다."); break;
				case 4 : case 6 : case 9 : case 11 :  System.out.println(num + "월은 30일까지 있습니다."); break;
				case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :  
				case 12 : System.out.println(num + "월은 31일까지 있습니다."); break;
				}
			} else {
				System.out.println(num + "월은 잘못입력된 달입니다. ");
			}
		}
	 // 28 : 2 
	 // 30 : 4 / 6 / 9 / 11
	 //	31 : 1 / 3 / 5 / 7 / 8 / 10 / 12
		
		// 조건문 실습 문제 4 (완료)
		
		public void ex21() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("키를 입력해주세요 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게를 입력해주세요 : ");
			double weight = sc.nextDouble();
			double BMI = weight / (height * height);
			
			System.out.println("BMI 지수 : "+ BMI);
			
			if(BMI > 18.5) {
				
			 if( BMI < 23) {
				 System.out.println("정상체중");
			} else if(BMI < 25) {
				System.out.println("과체중");
			} else if(BMI < 30) {
				System.out.println("비만");
			} else {
				System.out.println("고도비만");
			}
				
			} else {
				System.out.println("저체중");
			}
		
		}
		
		// 조건문 실습 문제 4 (완료)
		
		public void ex22() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("중간고사 점수 : ");
			int mid = sc.nextInt();
			System.out.print("기말고사 점수 : ");
			int fin = sc.nextInt(); 
			System.out.print("과제 점수 : ");
			int rep = sc.nextInt();
			System.out.print("출석 횟수 : ");
			int att = sc.nextInt();
			
			double midrate = mid * 0.2;
			double finrate = fin * 0.3;
			double reprate = rep * 0.3;
			double attrate = att;
			
			double sum = midrate+finrate+reprate+attrate;
			
			
			System.out.println("=====결과=====");
			System.out.println("중간 고사 점수(20%) : "+ midrate);
			System.out.println("기말 고사 점수(30%) : "+ finrate);
			System.out.println("과제 점수     (30%) : "+ reprate);
			System.out.println("출석 횟수     (20%) : "+ attrate);
			System.out.println("총점 : "+ sum);
			if(sum >= 70 && att >= 14){
				System.out.println("Pass");
			} else if(sum<70){
					System.out.println("fail [점수미달]");
				
			} else {
				System.out.println("fail [출석미달]");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
