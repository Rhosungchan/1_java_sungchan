package edu.kh.oop.field.model.vo;

public class Trainee { // 훈련생
 
	public String name;  // 이름
	public String phone;  // 휴대폰 번호
	public String email = "aaa";  // 이메일(선택)
	public static char classroom = 'A';  // 강의장
	public int salary = 116000;  // 급여(훈련수당)
	
	// 명시적 초기화 : 필드 선언 시 바로 값 초기화
	// ex) public String email = "없음";
	
	
	// 초기화 블록 : 객체(instance) 필드를 초기화하는 블록 
	// -instance block : static이 없는 필드 값 초기화(생성 시 마다)
	// - static bolck  : static이 있는 필드 값 초기화(프로그램 실행 시 1회)
	
	
	// instance block
	{
		email = "없음";
		salary = 116000;
	}
	
	// static block
	static {
		classroom ='A';
	}
	
	
	
	
	
	
	
	
}
