package homework.test.practice;

import java.util.Scanner;

public class Test {

	public void ex1() {

		Scanner sc = new Scanner(System.in);

		double[] heightArr = new double[5];

		for (int i = 0; i < heightArr.length; i++) {
			System.out.print(i + 1 + "번 키 입력 : ");
			heightArr[i] = sc.nextDouble();

		}
		System.out.print("입력받은 키 : ");
		double sum = 0;

		for (int i = 0; i < heightArr.length; i++) {
			sum += heightArr[i];
			System.out.print(heightArr[i] + " ");
		}

		double evg = sum / 5;
		System.out.println("\n평균 : " + evg);

	}
	public void ex2() {
		
	}
}
