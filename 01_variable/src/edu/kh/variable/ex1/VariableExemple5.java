package edu.kh.variable.ex1;

public class VariableExemple5 {
	
	public static void main(String[] args) {
		
		
		// 트레이 아이콘 -> 인텔 HD 그래픽 -> 그래픽 옵션 -> 바로가기 키 -> 사용안함
        // Ctrl + Alt + 방향키 위 또는 아래	
		
		/* 출력 메소드
		 * 
		 * System.out.print("내용")
		 * -> () 안의 내용 출력 (줄바꿈 X)
		 * 
		 * System.out.println("내용")
		 * -> () 안의 내용 출력 (줄바꿈 ㅇ)
		 * 
		 * System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
		 */

		
			System.out.print("aaaaa");
			System.out.print("bbbbb");
			System.out.println("ccccc");
			System.out.println("ddddd");
		
			String name = "노성찬";
			int age =33;
			char gender = '남';
			double height = 177.8;
			boolean tf = true;
			
			//노성찬님은 29세 남성, 키는 177.8cm입니다. (true)
			System.out.println( name + "님은 " 
	                            + age + "세 " 
	                            + gender + "성, 키는 "  
	                            + height + "cm입니다. (" + tf + ")" );
			System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm 입니다. (%b)\n" ,name, age, gender, height,tf  );          // (중요! 복습하기)
			// \n : 줄바꿈(개행)을 나타내는 탈출(escape) 문자
			
			
			//open perspective
			
			// 주석 김효동은 놓쳣다
			System.out.println("노성찬 깃허브 어려어");
	}

}
