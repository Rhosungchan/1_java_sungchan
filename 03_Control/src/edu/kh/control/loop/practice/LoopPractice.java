package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num=sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
//===============================================================		
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
//===============================================================		
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i);
			sum += i;
			if(i==num) {
            System.out.print(" = ");  
			} else {
				System.out.print(" + ");
			}
		} 
		System.out.println(sum);
	}
//===============================================================
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쩨 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쩨 숫자 : ");
		int num2 = sc.nextInt();
		
		// 문제풀이 1 (내가 푼 것)  
//		if(num1 >= 1 && num2 >=1) {
//			for(int i = num1 ; i <= num2 ; i++) {
//				System.out.print(i+" ");
//			}
//		} if(num1 >= 1 && num2 >=1) {
//			for(int i = num2 ; i <= num1 ; i++) {
//				System.out.print(i+" ");
//		    }
//		} else {
//			System.out.println("1이상의 숫자를 입력해주세요");
//		}
		
		// 문제 풀이 2
//		if(num1 < 1 || num2 < 1) {
//			System.out.println("1이상의 숫자를 입려해주세요");
//		} else {
//			if( num1 < num2) {
//				for(int i = num1 ; i <=num2; i++ ) {
//					System.out.print(i+" ");
//				}
//				
//			} else {
//				for(int i = num2 ; i <=num1; i++ ) {
//					System.out.print(i+" ");
//				}
//			}
//		}
//		문제풀이 3번 	
//		if(num1 < 1 || num2 < 1) {
//			System.out.println("1이상의 숫자를 입려해주세요");
//		} else {
//			if(num1 > num2) {
//				
//			}
//			int start = num1;
//			int end = num2;
//			
//			if(num1 > num2)
//				start = num2;
//			    end = num1;
//		} 
//		  for(int i = start; i<= end; i++) {
//			  System.out.print(i+" ");
//		  }
//		문제풀이 4번  (풀이영상보기)
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입려해주세요");
		} else {
			if (num1 > num2) {
				// 두 변수의 값 교환 (Temp)
				int temp = num1; // temp : 8 / num1 : 8 / num2 : 4
				num1 = num2; // temp : 8 / num1 : 4 / num2 : 4
				num2 = temp; // temp : 8 / num1 : 4 / num2 : 8
			}
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
//===============================================================	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===="+num+"단"+"====");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
//===============================================================
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num >= 2 && num <= 9) {
			for (int i = num; i <= 9; i++) {
				System.out.println("====" + i + "단====");
				for (int k = 1; k <= 9; k++) {
					System.out.printf("%d X %d = %2d \n", i, k, i * k);
				}
				System.out.println();
			}
		} else {
			System.out.println("2~9 사이 숫자만 입려해주세요");
		}
	}

//=============================================================== 6번까지 퍼펙트
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i<=num; i++) {
			for(int x = 1; x <=i ; x++) {                
				System.out.print("*");
			} System.out.println();
		} 
	}
//=============================================================== 7번까지 퍼펙트
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int i =num ; i>=1; i--) {
			for(int x = i; x >=1 ; x--) {                
				System.out.print("*");
			}
			System.out.println();
		}
    }
//=============================================================== 8번까지 퍼펙트
	public void practice9() {
	// 문제풀이 1번 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
			
			for (int row = 1; row <= input; row++) {
				for(int i = input-row ; i >=1; i--) {
	  // 같은식 for(int i = input-1 ; i >=row; i--) {
					System.out.print(" ");
				} 
				for (int col = 1; col <= row; col++) {
					System.out.print("*");
				}
				System.out.println(); 
			}
		} 
			
	//문제풀이 2번 		
//			System.out.print("정수 입력 :");
//			int input = sc.nextInt();
//				
//				for (int row = 1; row <+ input; row++) {
//					for (int col = 1; col <= row; col++) {
//						System.out.print("*");
//					}
//					System.out.println(); 
//			} 
	// 문제풀이 3번 (if문을 사용하는 풀이)
//			for(int col =1 ; col <=input;col++) {
//				if(col <= input - row) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//					
//			} System.out.println();
//	}
//==================================================================	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
    // 문제 풀이 1 - 1 (7번+8번 합쳐서 푸는 방식)
	   // 위쪽 삼각형     
//		for(int row =1 ; row <= input ; row++) {
//			for(int col =1 ; col<=row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	  // 아래쪽 삼각형
//		for(int row =input-1 ; row >= 1 ; row--) {
//			for(int col =1 ; col<=row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	// 문제 풀이 2 (복잡한 방식)
		for(int row = 1; row<=input*2-1; row++) {
			if(row<input) {
				for(int col=1 ; col<=row; col++) {
					System.out.print("*");
				}
			} else {
				for(int col=input; col > row-input; col--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
//==================================================================	10번 정리 완료 (이해 필요)
	public void practice11() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {
//		문제풀이 1번 (for문 이용)
//			for (int i = input - row; i >= 1; i--) {
//				// 같은식 for(int i = input-1 ; i >=row; i--) {
//				System.out.print(" ");
//			}
//			for (int col = 1; col <= row*2-1; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	// 문제풀이 3번 (if문을 사용하는 풀이)
			for(int col =1 ; col <=input*2-1;col++) {
				if(input-row >=col || input + row<=col ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}		System.out.println();
			} 
		
	}	
//==================================================================	11번 정리 완료 (이해 필요)
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			for(int col =1; col<=input; col++) {
				// 첫번째 / 마지막 줄, 칸일 때만 *출력
				if(row==1 || row==input || col==1 || col==input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
//==================================================================	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		// 내가푼 것
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 00) {
				System.out.print(i + " ");
				if (i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		System.out.println("\ncount : " + count);
	}
//==================================================================	13번 완료
}
	
	
	

	
