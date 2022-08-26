package edu.kh.io.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class IOService {

	
	// 스트림 데이터가 이동하는 통로 
	 
	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입/출력하는 스트림.
	//   언제 사용하는지? : 문자가 아닌 파일(이미지, 영상, exe등) 입/출력                  
	
	// 문자 기반 스트림 : 문자 단위 (2byte)로 데이터를 입/출력하는 스트림.
	// 언제 사용하는지? : 문자 데이터(채팅, 코드, 데이터) 입/출력                  
	
	public void output() {
		
		String content = "Hello World\n"
				         + "132456789\n"
				         + "오늘은 금요일입니다.\n"
				         + "점심 어떤게 좋을까요?";   
		
		
		// FileOutputStream fos = new FileOutputStream(" ");
		// Unhandled exception type FileNotFoundException
		// ==> 스트림 객체 생성 시 예외 처리가 필요함
		
		 
		// ★ 바이트 기반 파일 출력 스트림 
		FileOutputStream fos = null;  // 메서드의 지역변수 == 메서드 어디서든 사용 가능 
		                              // -> finally에서도 사용 가능 
		
		
		// ○ 문자 기반 파일 출력 스트림  
		FileWriter fw = null;
		
		
		
		try {
			
			//  ★
			fos = new FileOutputStream("byte/byteTest.txt",true);
			       // new FileOutputStream("출력할 파일 경로", 이어쓰기 여부);
				   // -> 파일이 없으면 자동 생성됨
			       // 새롭게 실행될 때마다 새로운 파일/내용이 덮어쓰기 된다.
			       // 이어쓰기 여부를 true로 하면 이전 내용이 이어쓰기 된다. (log 작성 시 많이 사용 )
			
			// 1byte씩 파일로 출력 
			for(int i =0; i<content.length();i++) {
				fos.write(content.charAt(i));
				// void java.io.FileOutputStream.write(int b) throws IOException
			}
			
			System.out.println("바이트 스트림 출력 완료");
			
			//-----------------------------
			
			//  ○
			fw = new FileWriter("char/charTest.txt",true);
	    	      // new FileWriter("출력할 파일 경로",이어쓰기 여부);
				  // -> 파일이 없으면 자동 생성됨
				  // 새롭게 실행될 때마다 새로운 파일/내용이 덮어쓰기 된다.
				  // 이어쓰기 여부를 true로 하면 이전 내용이 이어쓰기 된다. (log 작성 시 많이 사용 )
			
			fw.write(content);
			
			System.out.println("문자 스트림 출력 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지의 모든 메서드 출력
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
		
			try {
				// 스트림.close();
				// ==> 스트림 내부에 존재하는 데이터를 모두 밀어낸 후
				//     객체 자원(메모리) 반환
				// ===> 스트림.close(); 필수 작성!!
				      
				// => 스트림 통로를 닫아서 스트림이 더 이상 쓸모없기에 반환 (이해를 위한 내 해석)
				//    스트림 통로를 닫지 않는다면 통로를 이동 중에 정보가 도달하지 못하고 끝나는데
				//    클로즈를 넣으면 통로를 닫기 위해 통로에 있던 정보들을 입력처로 밀어낸 후 통로가 사라지게 된다.
				
				fos.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 4교시
	public void input() {
		
		FileInputStream fis = null; // 바이트 기반
		FileReader fr = null; // 문자 기반
		
		try {
			
			fis = new FileInputStream("char/charTest.txt");
			                         // 파일 경로
			      // throws FileNotFoundException
			
			int value = 0; // 파일에서 읽어온 값을 저장할 변수
			
			// fis.read() :  다음 1byte를 읽어와 int형으로 반환 
			//               단, 읽어올 내용이 없으면 -1 반환 
			
			//======같은 식이지만 다른표현=========== 
			//--------------1번---------------
            // while( (value = fis.read()) != -1) System.out.print((char)value);

			//--------------2번---------------
			while(true) {	
				value = fis.read();
				if(value==-1) break;
				System.out.print((char)value);
			}
		
			System.out.println("\n===========================================================");
			
			
			fr = new FileReader("char/charTest.txt");
				  // throws FileNotFoundException
			
			while(true) {	
				value = fr.read();
				if(value==-1) break;
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				// 스트림 객체 자원 반환 
				if(fis != null)fis.close(); // 참조하는 스트림이 있을 때만 닫아줌 
				if(fis != null)fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 4교시
	// 어떤 형식의 파일이든 복사하기
	// 기반 + 보조 스트림 실습 
	public void fileCopy() {

		Scanner sc = new Scanner(System.in);

		// 보조 스트림(혼자 생성되서 입/출력할 수 없는 스트림)
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {

			System.out.println("복사할 파일의 경로 : ");
			String input = sc.nextLine();
			bis = new BufferedInputStream(new FileInputStream(input));
			// new BufferedInputStream(기반 스트림);
			
			System.out.println("복사 위치+파일명 경로 : ");
			String output = sc.nextLine();
			bos = new BufferedOutputStream(new FileOutputStream(output));
			
			// Buffered 보조 스트림
			// -> 버퍼를 이용해서 1byte/1문자 씩이 아닌 
			//    한번에 많은 내용을 입/출력할 수 있게 하는 보조 스트림(속도 up)
			
			// 통로 안에 바구니를 만들어서 입력값을 저장했다가 한번에 전달(성찬)
			// ex) 기존 = a b c d e 를 옮기려면 5번 왕복
			//     버퍼사용 = 통로에서 버퍼에 a b c d e를 모아서 1번에 전달 (왕복 1번) 
			
			int value = 0;
			
			while(true) {
				value =bis.read();
				// 바이트 스트림이기 때문에 1byte씩 읽어오지만
				// 한글 같은 2byte 문자가 버퍼에 쌓이면 깨졌던 모양이 복구됨
				if(value==-1) break;
				bos.write(value);
				// 1byte씩 출력되는 것 같으나
				// 내부 버퍼에 출력되는 내용이 모여서 한번에 출력됨
			}
				System.out.println("복사 완료");
				
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("입/출력 과정에서 오류가 발생했습니다.");
			e.printStackTrace();
			
		} finally {

			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
