package edu.kh.inheritance.model.vo;

public class Person extends Object { // 자식이 공통적으로 가지고 있는 필드 / 메서드 작성함 (추상화)(8/23일 1교시)
                    // extends Object -> 상속 구문이 작성되지 않으면 컴파일러가 자동 추가 	(8/23일 1교시)
	
	private String name;
	private int age;

	// ctrl + space bar + enter : 기본생성자
	public Person() { }

	// alt + s -> o 또는 alt+shift + s -> o
	// Genetate Construcor using field...

	// 매개변수 생성자
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 자기소개 기능 (8/23 2교시)
	public void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("이름 : " + age);
	}

}