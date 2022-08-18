package edu.kh.Array.ex;

import java.util.Scanner;

public class sungchantest {

	// ========================연산자=============================
	// 연산자 실습 1번 (완료)
	public void ex1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		System.out.println("남는 사탕 개수 : " + num2 % num1);
	}

	// 연산자 실습 2번 (완료)
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("학년(정수) :");
		int grade = sc.nextInt();
		System.out.print("반(정수) :");
		int room = sc.nextInt();
		System.out.print("번호(정수):");
		int number = sc.nextInt();
		System.out.print("성별(남학생/여학생) :");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지) :");
		double score = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", grade, room, number, name, gender, score);
	}

	// 연산자 실습 3번 (완료)
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		String result = (input == 0) ? "0" : input > 0 ? "양수" : "음수";
		System.out.println(result + "입니다.");
	}

	// 연산자 실습 4번 (완료)
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		int evg = sum / 3;

		String result = (kor >= 40 && eng >= 40 && math >= 40 && evg >= 60) ? "합격" : "불합격";
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) evg);
		System.out.println(result);
	}

	// ========================조건문=============================
	// 조건문 실습 1번 (완료)
	public void ex5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입려해주세요");
		}

	}

	// 조건문 실습 2번 (완료)
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		int evg = sum / 3;

		if (kor >= 40 && eng >= 40 && math >= 40 && evg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + (double) evg);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	// 조건문 실습 3번 (완료)
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 2:
			System.out.println(num + "월은 28일까지 있습니다.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(num + "월은 31일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(num + "월은 30일까지 있습니다.");
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}

	// 조건문 실습 4번 (완료)
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);

		System.out.println("BMI 지수 : " + BMI);
		if (BMI > 18.5) {
			if (BMI < 23) {
				System.out.println("정상체중");
			} else if (BMI < 25) {
				System.out.println("과체중");
			} else if (BMI < 30) {
				System.out.println("비만");
			} else {
				System.out.println("고도비만");
			}

		} else {
			System.out.println("저체중");
		}
	}

	// 조건문 실습 5번 (완료)
	public void ex9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int rep = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();

		double midrate = mid * 0.2;
		double finrate = fin * 0.3;
		double reprate = rep * 0.3;
		double attrate = att;

		double sum = midrate + finrate + reprate + attrate;

		System.out.println("============결과============");

		if (att >= 14) {
			System.out.println("중간 고사 점수(20) : " + midrate);
			System.out.println("기말 고사 점수(30) : " + finrate);
			System.out.println("과제 점수     (30) : " + reprate);
			System.out.println("출석 점수     (20) : " + attrate);
			System.out.println("총점 : " + sum);
			if (sum >= 70) {

				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}

		} else {
			System.out.println("Fail [출석 횟수 부족 (" + att + "/20)]");
		}

	}

	// ========================반복문=============================
	// 반복문 실습 1번 (완료)
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	// 반복문 실습 2번 (완료)
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	// 반복문 실습 3번 (완료)
	public void ex12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			sum += i;

			if (i == num) {
				System.out.print(" = ");

			} else {
				System.out.print(" + ");

			}
		}
		System.out.println(sum);
	}

	// 반복문 실습 4번 (완료)
	public void ex13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 >= 1 || num2 >= 1) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}

	// 반복문 실습 5번 (완료) (다시 한번 해보기)
	public void ex14() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.println("====" + num + "단====");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	// 반복문 실습 6번 (완료)
	public void ex15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num > 1 && num < 9) {
			for (int i = num; i <= 9; i++) {
				System.out.println("=====" + i + "단=====");
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}

	}

	// 반복문 실습 7번 (완료) (복습 필요)
	public void ex16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int row = 1; row <= num; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 반복문 실습 8번 (완료) (복습 필요)
	public void ex17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int row = num; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 반복문 실습 9번 (완료) (복습 필요)
	public void ex18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int row = 1; row <= num; row++) {
			for (int i = num - row; i >= 1; i--) {
				System.out.print(" ");

			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 반복문 실습 10번 (완료) (복습 필요)
	public void ex19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = num - 1; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 반복문 실습 13번 (완료) (복습 필요)
	public void ex20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;

			}
		}
		System.out.println("\ncount : " + count);
	}

	// 0이 입력될 때 까지의 입력된 정수의 합 구하기
	public void ex21() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);

	}

	// "exit@" 문자열이 입력될 때까지 문자열 누적하기 // .equals() 기억하기
	public void ex22() {
		Scanner sc = new Scanner(System.in);

		String sum = "";

		while (true) {
			System.out.print("정수 입력 : ");
			String input = sc.next();

			if (input.equals("exit@")) {
				break;
			}
			sum += input;
		}
		System.out.println(sum);

	}

	// continue : 다음 반복으로 넘어감
	// 1부터 30까지 5의 배수를 제외하고 출력 (continue사용)
	public void ex23() {

		for (int i = 1; i <= 30; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

	// 1~100까지 1씩 증가하며 출력하는 반복문
	// 단, 5의 배수는 건너 뛰고
	// 증가하는 값이 40이 되었을 때 출력 후 반복을 멈춤
	public void ex24() {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				if (i == 40) {
					break;
				}
				continue;
			}
			System.out.print(i + " ");
		}
	}
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

	public void ex25() {
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 50 + 1);
		int count = 1;

		while (true) {
			System.out.print(count + "번 입력 : ");
			int num = sc.nextInt();
			if (num == ran) {
				System.out.println("정답입니다. (총 입력횟수 : " + count + "회)");
				break;
			} else if (num > ran) {
				System.out.println("Down");
			} else if (num < ran) {
				System.out.println("UP");

			}
			count++;
		}

	}
	// 가위 바위 보 게임

	// 몇판? : 3

	// 1번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 : 가위
	// 컴퓨터는 [보]를 선택했습니다.
	// 플레이어 승!
	// 현재 기록 : 1승 0무 0패

	// 2번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 : 보
	// 컴퓨터는 [보]를 선택했습니다.
	// 비겼습니다.
	// 현재 기록 : 1승 1무 0패

	// 3번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 : 가위
	// 컴퓨터는 [바위]를 선택했습니다.
	// 졌습니다ㅠㅠ
	// 현재 기록 : 1승 1무 1패

	// 컴퓨터는 난수로 만들자
	// 컴퓨터 가위 바위 보
	// >>>(int)(Math.random()*3)
	// 0 >> 가위
	// 1 >> 바위
	// 2 >> 보

	public void ex26() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇판? : ");
		int input = sc.nextInt();
		int count = 1;

		int ran = (int) (Math.random() * 3);

		int win = 0;
		int rose = 0;
		int draw = 0;

		for (int i = 1; i <= input; i++) {
			System.out.print("\n" + i + "번째 게임\n");
			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
			String player = sc.next();

			String com = "";
			switch (ran) {
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);

			if (player.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else {
				boolean win1 = player.equals("가위") && com.equals("보");
				boolean win2 = player.equals("바위") && com.equals("가위");
				boolean win3 = player.equals("보") && com.equals("바위");
				if (win1 || win2 || win3) {
					System.out.println("이겼습니다.!");
					win++;
				} else {
					System.out.println("졌습니다ㅠㅠ");
					rose++;
				}
			}

			System.out.printf("현재 기록 %d승 %d무 %d패\n", win, draw, rose);
		}

	}

	// -------------------------for문 기초 사용법 10-----------------------------
	// (응용)문제 : 구구단 출력 (for문, if문, Scanner, 논리연산자, print 메서드)
	// 2 ~ 9사이의 수를 하나 입력 받아
	// 해당하는 수의 단을 출력
	// 단, 입력 받은 수가 2~9사이가 아니라면 "잘못 입력하셨습니다." 출력
	public void ex27() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단(2~9) 입력 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {

			for (int i = 1; i <= 9; i++) {

				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void ex28() {
		for (int x = 1; x <= 4; x++) { // 4번반복

			for (int i = 1; i <= 5; i++) { // 12345
				System.out.print(i);
			}
			System.out.println(); // ()안의 내용을 출력하고 줄 바꿈(개행)
		}
	}

	// 분식집
	// ex)
	// ======메뉴======
	// 1.떡볶이(5000원)
	// 2.김밥(3000원)
	// 3.라면(4000원)
	// 4.돈가스(8000원)
	// 9. 주문 완료
	// 메뉴선택 >> 1

	// ======메뉴======
	// 1.떡볶이(5000원)
	// 2.김밥(3000원)
	// 3.라면(4000원)
	// 4.돈가스(8000원)
	// 9. 주문 완료
	// 메뉴선택 >> 2

	// ======메뉴======
	// 1.떡볶이(5000원)
	// 2.김밥(3000원)
	// 3.라면(4000원)
	// 4.돈가스(8000원)
	// 9. 주문 완료
	// 메뉴선택 >> 2

	// 떡볶이, 김밥을 주문하셨습니다.
	// 총 가격은 8000원입니다.
	public void ex29() {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int input = 0;
		String menu = "";
		boolean flag = false;

		while (input != 9) {
			System.out.println("======메뉴=====");
			System.out.println("1. 떡볶이 5000원");
			System.out.println("2. 김밥 3000원");
			System.out.println("3. 라면 4000원");
			System.out.println("4. 돈가스 8000원");
			System.out.println("9. 주문완료");
			System.out.print("메뉴선택 >> ");
			input = sc.nextInt();

			System.out.println();

			if (flag && input >= 1 && input < 5) {
				menu += ", ";
			} else {
				flag = true;
			}
			switch (input) {

			case 1:
				menu += "떡볶이";
				sum += 5000;
				break;
			case 2:
				menu += "김밥";
				sum += 3000;
				break;
			case 3:
				menu += "라면";
				sum += 4000;
				break;
			case 4:
				menu += "돈가스";
				sum += 8000;
				break;
			case 9:
				break;
			default:
				System.out.println("잘못입력\n");
			}
		}
		System.out.println(menu + "을 주문하셨습니다.");
		System.out.println("총 가격은" + sum + "원입니다");

	}
	// 3행 3열 짜리 int 2차원 배열에 난수를 대입
	// 단, 각각의 마지막 행/열은 각 행/열의 합
	// 마지막 행, 마지막 열은 전체 난수의 합

	public void ex30() {
		int[][] arr = new int[3][3];

		for (int row = 0; row < arr.length - 1; row++) {
			for (int col = 0; col < arr[row].length - 1; col++) {
				int ran = (int) (Math.random() * 10);
				arr[row][col] = ran;

				arr[row][arr[row].length - 1] += ran; // 생성된 난수 누적

				// 각 행의 마지막 행을 나타내는 방법
				arr[arr.length - 1][col] += ran; // 생성된 난수 누적

				// 마지막 행, 마지막 열을 나타내는 방법
				arr[arr.length - 1][arr[row].length - 1] += ran; // 생성된 난수 누적

			}
		}

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println(); // 줄바꿈
		}

	}

}
