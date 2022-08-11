package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	
	
	
	public void ex1() {
		
		// break문 : 가장 가까운 반복문을 빠져 나가는 구문 
		
		for(int i=1; 1<=10000; i++) {
			System.out.println();
			
			// i가 20일때 반복 종료
			
			if(i==20) {
				break;
			}
			
		}
		System.out.println("==============================");
		for(int row =1; row <=5; row++) {
			
			for(int col =1; col<=30; col++) {
				System.out.printf("(%d , %d) ",row, col);
				
				if(col==3) {
					break;
				}
			}
			System.out.println(); // 줄 바꿈 
			
			if(row==3) {
				break;
			}
			
		}
		
	}
	
	
	public void ex2() {
		
		// 0이 입력될 때 까지의 입력된 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) { // 조건식에 강제로 true를 작성 == 무한반복
			System.out.print("정수 입력 : ");
			int input= sc.nextInt();
			
			if(input==0) {
				break;
			}
			
			sum +=input; // 누적
			
		}
		System.out.println("합계 : "+sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다. 
	}
	
	public void ex3() {
		
          // "exit@" 문자열이 입력될 때까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";  // 빈 문자열
		
		System.out.println("---문자열 입력 (종료시 exit@ 입력)---");
		while(true) {
			String input = sc.nextLine(); // 한줄 입력
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다.
			// -> String은 기본 자료형 x , 참조형 o
			
			// -> 참조형은 A.equals(B) 값을 비교할 수 있다.
			
			// A.equals(B)    A==B
		    if(input.equals("exit@")) {
		    	break;
		    }
		    str += input + "\n"; //누적하면서 줄 바꿈
		}
		
		System.out.println(str);
		
	}
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까지 5의 배수를 제외하고 출력 (continue사용)
		
		for(int i=1; i<=30; i++) {
			
			if(i%5==0) {
				continue; // 다음 반복으로 이동 (증감식 부분으로 이동)
			}
			
			System.out.println(i);
		}
		
	}
	
	public void ex5() {
		
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너 뛰고 
		// 증가하는 값이 40이 되었을 때 출력 후 반복을 멈춤
		
		
		for(int i =1; i <=100; i++) {
			
			if(i%5==0) {
				if(i==40) {
					System.out.println(i);
					break;
				}
				continue;
			} 
			System.out.println(i);
		}
		
	}
	
	
	
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1~50 사이의 임의의 수 (난수)를 하나 생성하여 
		// 사용자가 몇회 만에 맞추는지 카운트
		
		// 만약 틀렸을 경우 난수가 입력한 수보다 크면 up / 작으면 down출력 
		
		// (임의의 수 30일 경우) 
		
		// ex) 
		// 1번 입력 : 30 
		// up
		
		// 2번 입력 : 40 
		// Down
		
		// 3번 입력 : 30 
		// 정답입니다! (총 입력 횟수 : 3회)
		
		
		// 난수 생성 : Math. random() -> java에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0             -> 0.0이상 1.0미만의 난수를 생성 (double형)		
		
		
		int ran = (int)(Math.random() * 50+1);
		//  0.0 <= x < 1.0 
		// 0.0*50 <= x*50 < 1.0*50
		//  0.0 <= x < 51.0 
		// 1 <= (int)(x *50+1) < 51        ---------> 1~50사이 난수 
//		System.out.println(ran); 
		
		Scanner sc = new Scanner(System.in);
		
        int count = 1;
		
		while(true) { // 조건식에 강제로 true를 작성 == 무한반복
			System.out.print(count+"번 입력 : ");
			int input= sc.nextInt();
			
			if(input==ran) {
				System.out.printf("정답입니다! (총 입력 횟수 : %d회)\n", count);
				break;
			} else if(input>ran) {
				System.out.println("Down");
			} else {
				System.out.println("UP");
			} 
		}
			count++;
	}
	
		public void RPSGame() {
			   // 가위 바위 보 게임
			   
			   // 몇판? : 3
			   
			   // 1번째 게임
			   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
			   // 컴퓨터는 [보]를 선택했습니다.
			   // 플레이어 승!
			   // 현재 기록 : 1승 0무 0패
			   
			   // 2번째 게임
			   // 가위/바위/보 중 하나를 입력 해주세요 :  보
			   // 컴퓨터는 [보]를 선택했습니다.
			   // 비겼습니다.
			   // 현재 기록 : 1승 1무 0패
			   
			   // 3번째 게임
			   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
			   // 컴퓨터는 [바위]를 선택했습니다.
			   // 졌습니다ㅠㅠ
			   // 현재 기록 : 1승 1무 1패
			
			// 컴퓨터는 난수로 만들자 
			// 컴퓨터 가위 바위 보
			// >>>(int)(Math.random()*3)
			// 0 >> 가위
			// 1 >> 바위
			// 2 >> 보
			
			
			// 몇판 ? 입력 값 받고 for문 이용
		    // 
			int ran = (int)(Math.random()*3);
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("몇판? : ");
			int input = sc.nextInt();
			
			for(int i = 1; 1<=input ; i++) {
				
				System.out.print(i+"번째 게임");
				System.out.print("\n가위/바위/보 중 하나를 입력해주세요 : ");
				       String input2 =sc.next();
				   
				      
				       
//				       if(ran==0) {
//				    	   System.out.print("컴퓨터는 [가위]를 선택했습니다.");
//				       } else if(ran==1) {
//				    	   System.out.print("컴퓨터는 [바위]를 선택했습니다.");
//				       } else {
//				    	   System.out.print("컴퓨터는 [보]를 선택했습니다.");
//				       }
//				
		    	  
				}
//			for(int x = 1; x>3 ; x++) {
//				 for(int g= 1; g>3; g++ ) {
//					 if()
//				 }
				
				
			}
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
}
