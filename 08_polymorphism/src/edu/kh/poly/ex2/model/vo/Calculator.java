package edu.kh.poly.ex2.model.vo;
// 4교시

// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 피드, 기능명을 제공하는 접점 용도
public interface Calculator {
	
	public static final double PI = 3.14;
	static final int Max_NUM = 1000000; // 100만
	final int Min_NUM = -1000000; // -100만
	int P_NUM= 333;
	// --> 예약어 어떻게 작성되든 public static final
	
	public abstract int plus(int num1, int num2); // 더하기
	
	abstract int minus(int num1, int num2);       // 빼기
	
	abstract int multiple(int num1, int num2);    // 곱하기
	
	abstract double divide (int num1, int num2);  // 나누기
	
	abstract double areaOfCircle(double r); //원의 넓이
	                             // 반지름
	
	double pow(double a, int b); // a의 b 제곱
	
	
}
