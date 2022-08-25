package edu.kh.inheritance.ex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {

	public void ex1() {
		// 상속 확인

		// Student 자식 객체 생성

		Student s1 = new Student();

		// 자식만의 기능 / 필드 (grade, classRoom)
		s1.setGrade(2); // setGrade(int grade) : void - Student(Student의 메서드)
		s1.setClassroom(3); // Student(Student의 메서드)

		s1.setName("김개똥"); // setName(String name) : void person (person의 메서드)
							// 부모인 person으로부터 상속받은 메서드라는 뜻
		s1.setAge(15);
		System.out.println(s1.getGrade());
		System.out.println(s1.getClassroom());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		// Object      (1교시)
		Person p1 = new Person();
		
		// int java.lang.Object.hashCode()  (1교시)
		System.out.println(p1.hashCode());
		// -> Object class는 모든 class의 최상위 부모 (1교시)
		// == 모든 클래스는 Object class의 후손 

		// int java.lang.Object.hashCode()  (1교시)
		System.out.println(s1.hashCode());
		// -> 상속은 누적된다. 
		// object -> Person - Student
		
		//(8/23일 1교시)
		Student s2 = new Student("김학생", 17, 1, 5);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getGrade());
		System.out.println(s2.getClassroom());
		
	}
		
//	(8/23 2교시)
	public void ex2() {
		// 오버라이딩 : 재정의
		
		Person p1 = new Person("홍길동", 15);
		Student s1 = new Student("김학생", 17, 1, 5);
		
		p1.introduce();
		System.out.println("------------------------");
		s1.introduce();
		// Person 상속 받음
		// -> 오버라이딩 진행 시 Student의 메서드로 인식됨
		
	}
	
	
	
	
	
	
	
	
}
