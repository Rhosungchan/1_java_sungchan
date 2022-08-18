package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		
		RSC 노성찬 = new RSC();
		// heap 영역에 RSC 클래스에 정의된 내용을 이용하여 RSC 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : "+ 노성찬.name);
		System.out.println("나이 : "+ 노성찬.age);
		System.out.println("생년월일 : "+ 노성찬.birthday);
//		System.out.println("비밀번호 : "+ 노성찬.password);
		
		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		노성찬.showPassword();
		
		
		// 기능 수행 
		노성찬.eat();
		노성찬.study();
		노성찬.plus(50, 100);
 	}
	
	
}
