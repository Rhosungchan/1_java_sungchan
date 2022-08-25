package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class SetService {
//============================ [Set 기본사용법] ============================	
	/* Set(집합)
	 *  - 순서를 유지하지 않음 (인덱스가 없음)
	 *  - 중복 데이터 저장 불가 (null도 중복안됨 (1개만 저장가능))
	 */
	

	public void ex1() {
	
		Set<String> set = new HashSet<String>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의 민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add(null);
		set.add(null);
		set.add(null);
		
		// =========== [remove 사용법] =============
		// List = remove(int index)
		// Set = remove(String value) : Set에 저장된 객체 중 value가 같은 객체 제거 
		// ==> boolean 반환
		//     제거되면 true / 안되면 false     
		
		set.remove("직방");

		
		System.out.println(set.toString());

		// =========== [Iterator 사용] =============
		// set에 저장된 요소 하나씩 얻어오기
		// 1. Iterator (반복자) : 반드시 알아야되는 단어 
		//    - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
		//    -> 컬렉션에 저장된 객체를 임의의 순서로 하나씩 꺼내는 역할 
		
		Iterator<String> it = set.iterator(); 
		// set.iterator();
        // set에 저장된 객체를 이용해서 iterator 객체를 만들어 반환		
		
		
		while(it.hasNext()) {
			// hasNext() : 다음 값이 존재하면 true
			
			String temp = it.next();
			// next() : 다음 값을 얻어옴
			
			System.out.println(temp);
		}			
		System.out.println("=============================================");	
		
		// =========== [향상된 for문을 사용] =============
		// 2. 향상된 for문을 이용하는 방법
		for(String temp : set) {
			System.out.println(temp);
		}
	}
	
	// 6교시
	
	public void ex2() {
		//======================= [★chan1★] ==================================
		/* Set에 저장된 객체가 중복임을 판단하는 방법 ★chan1★
		 * - 필드에 저장된 값이 모두 일치하면 중복으로 판단
		 *   -> 중복 판단에 사용하는 메서드
		 *      Object.equals() 메서드의 오버라이딩된 메서드
		 *      => Student 오버 라이딩
		 *      
		 *========================== [HashCode()] =============================
		 *
		 * Hash라는 단어가 붙은 컬렉션이 중복을 판단하는 방법
		 *  -> Object.hashCode() 오버라이딩
		 * 
		 * Hash 함수 : 입력된 단어를 지정된 길이의 무작위 문자열로 변환하는 함수
		 * 
		 * hashCode() : 객체에 저장된 필드를 이용해서 만들어진 정수를 반환
		 *              
		 * HashSet -> equals(), hashCode() 둘 다 오버라이딩 되어 있어야 함
		 * 
		 *              -> equals() 또는 hashCode()를 오버라이딩 하면 
		 *                 나머지 하나도 반드시 오버라이딩 해라!
		 */

		
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student("홍길동",15,"서울시 중구", 'M', 50));
		set.add(new Student("김길순",17,"서울시 종로구", 'F', 100));
		set.add(new Student("홍길동",15,"서울시 중구", 'M', 50));
		
		// ============= [ ★chan1★ Student equals()동등비교 확인] ============= 
		Student s1 = new Student("홍길동",15,"서울시 중구", 'M', 50);
		Student s2 = new Student("홍길동",15,"서울시 중구", 'M', 50);
		
		System.out.println(s1.equals(s2));
		// ============= [ ★chan1★ Student equals()동등비교 확인] =============
		
		
		for( Student s : set) {
			System.out.println(s);
		}
	}	

	//=================== [TreeSet] =============================
	public void ex3() {

		// TreeSet : 오름차순으로 정렬되고 중복이 제거되는 Set
        //           => interface / 중복저장 x / 저장 순서 유지 x        
		
		// ================ [Wrapper class] ================ 
		// Wrapper class
		// * 컬렉션은 객체만 저장 가능(기본 자료형 x)
		//   -> 컬렉션에 기본 자료형도 저장할 수 있는 방법 필요 
		//      --> 기본 자료형을 포장하여 객체로 만듦.
		
		// boolean  =>  Boolean
		// byte     =>  Byte
		// int      =>  Integer
		// double   =>  Double 
		// char     =>  Character
		// float    =>  Float
		// short    =>  Short
		// long     =>  Long
		
		/// Wrapper class는 기본 자료형 값 + 추가 필드, 메서드 제공

		System.out.println(Integer.MAX_VALUE);
		
		int num = Integer.parseInt("123");
		double dNum =Double.parseDouble("123.123");
		
		// 문자열이지만 내용이 모두 숫자인 문자열이 존재
		// => Wrapper 클래스의 ParseXXX()를 이용하면 숫자로 변경 가능 
		
		// parsing : 데이터의 형식 자체를 바꾸는 것 
		
		System.out.println(num +100);  // 223
		System.out.println(dNum +100);  // 223.123
		//------------[자동 포장 및 해제]-------------
		// Auto Boxing (자동 포장)
		Integer i1 = 10; // Integer = int
		// Integer = new Integer(int)
		
		// Auto UnBoxing (자동 포장 해제)
		int i2 = i1;     // int = Integer
		// int = Integer.intValue(); (int)
		
		System.out.println(i1.intValue());
		//------------[자동 포장 및 해제]-------------
		// ================ [Wrapper class] ================ 
		
		
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		// Integer -> int Wrapper class


		while (lotto.size() < 6) {

			int ran = (int) (Math.random() * 45 + 1); // 1~45 난수

			lotto.add(ran); // 로또번호 출력
		}             // ran : Wrapper class의 자동 포장 자동 적용 

		System.out.println(lotto);
		
	
		
	}
	//=================== [TreeSet] =============================
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
