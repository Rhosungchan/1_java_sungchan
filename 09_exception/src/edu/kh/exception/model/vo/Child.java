package edu.kh.exception.model.vo;
// 7교시
import java.io.EOFException;
import java.io.IOException;

//==== 상속 예시 ====
public class Child extends Parent{

	@Override
	public void method() throws EOFException{
		
		// IOException -> Exception : 변경 불가
		// why? Exception이 더 넓은(많은) 예외 처리가 가능 

		// IOException -> EOFException : 변경 가능
		// why? EOFException이 더 좁은(구체적인) 예외 처리이기 때문에 가능
		
		
		
	}

}
