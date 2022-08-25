package edu.kh.Array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void ex1() {

		int[] arr = new int[9];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;

		int sum = 0;

		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {

				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 합계 : " + sum);

	}

	public void ex2() {
		int[] arr = new int[9];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;

		int sum = 0;

		for (int i = 8; i >= 0; i--) {
			System.out.print(arr[i] + " ");

			if (i % 2 == 1) {

				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 합계 : " + sum);

	}

	public void ex3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.print(arr[i] + " ");
		}

	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + (i) + " : ");
			arr[i] = sc.nextInt();

		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (input == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = false;
			}
		}
		if (flag) {
			System.out.println("일치하는 값이 존재하지 않습니다."); // flag기능 복습하기
		}

	}
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String row = sc.next();
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);

		String str = row;

		char[] arr = new char[str.length()];
		int count = 0;
		String index = " ";

		for (int i = 0; i < arr.length; i++) {

			arr[i] = str.charAt(i);

			if (search == arr[i]) {
				count++;
				index += i + 1 + " ";
			}
		}
		System.out.println(row + "에 " + search + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(search + "가 존재하는 개수 : " + count);
	}

	public void ex6() {
	
//		사용자가 배열의 길이를 직접 입력하여 그 값 만큼 정수형 배열을 선언 및 할당하고 // 완료
//		배열의 크기 만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];

		String haha = " ";
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();

			haha += arr[i] + " ";
			sum += arr[i];
		}
		System.out.println(haha);
		System.out.println("총 합 : " + sum);
	}
	
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String preciousNumber = sc.next();

		char[] arr = new char[preciousNumber.length()];

		for (int i = 0; i < arr.length; i++) {

			if (i > 8) {
				arr[i] = '*';
			} else {
				arr[i] = preciousNumber.charAt(i);
			}
			System.out.print(arr[i]);
		}

	}
	
//	3이상인 홀수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 
//	오름차순으로 값을 넣고, 중간 이후부터 끝까지는 
//	1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우“다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.
	public void ex8() {

		Scanner sc = new Scanner(System.in);

		int[] arr;
		int num = 1;

		while (true) {

			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				arr = new int[input];
				for (int i = 0; i < arr.length; i++) {
					if(i<arr.length/2) {
						arr[i] = num++;
					} else {
						arr[i] = num--;
					} System.out.println(arr[i]);
					
				} break;
			}
				
		}

	}
	
	public void ex9() {
		
		int[] arr = new int[10]; 
		
		System.out.print("발생한 난수 : "); 
		for(int i = 0; i<10; i++) {
			int ran = (int)(Math.random()*10+1);
			
			arr[i] = ran;
			System.out.print(arr[i]+" "); 
		}
	}
	
	public void ex10() {

		int[] arr = new int[10];
		int max = arr[0];
		int min = arr[0];

		System.out.print("발생한 난수 : ");
		for (int i =0 ; i < 10; i++) {
			int ran = (int) (Math.random() * 10+1);

			arr[i] = ran;
			System.out.print(arr[i] + " ");
		
			if(arr[i]>max) {
				max = arr[i]; 
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}	
		
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);

	}
	
	public void ex11() {
		

		int[] arr = new int[10]; 
		
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			
			arr[i] = ran;
			
			for(int x = 0; x<i; x++) {
				
				if(arr[x]==ran) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i <arr.length; i++ ) {
			
			System.out.print(arr[i]+" ");
		}
	}
	
	public void ex12() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*46);
			arr[i] = ran;
			
			for(int x = 0; x < i; x++) {
				
				if(arr[x] == ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public void ex13() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	
	}
	
	
	
}
