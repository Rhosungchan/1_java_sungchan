package edu.kh.op.ex;

import java.util.Scanner;

	public class OperatorExample1{


           public static void main(String[] args) {
	        //  * main + ctrl + space bar 
        	   
        	   // 산술 연산자 : + - * / %(나머지를 구하는 연산)
        	   // 실습 1) +
        	    System.out.println("두 정수를 입력받아 산술 연산 결과 출력하기");
        	    
        	    Scanner sc = new Scanner(System.in);   // Scanner 입력 메소드 
  
        	    System.out.print("정수입력 1 : ");     
        	    int input1 = sc. nextInt();
        	    
        	    
        	    System.out.print("정수입력 2 : ");     
        	    int input2 = sc. nextInt();
        	    
        	    // ex) 2 + 3 = 5 
        	    System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
        	    
        	    // 실습 2) - * / 
        	    
        	    // 5 - 3 = 2
        	    System.out.printf("%d - %d = %d \n", input1, input2, (input1-input2));	

        	    // 5 * 3 = 15
        	    System.out.printf("%d * %d = %d \n", input1, input2, (input1*input2));
        	    
        	    // 5 / 3 = 1 (몫) (int이기 때문에 소수점 아래자리 없어짐) 
        	    System.out.printf("%d / %d = %d \n", input1, input2, (input1/input2));
        	    
        	    // 5 % 3 = 2 (몫) 
        	    System.out.printf("%d %% %d = %d \n", input1, input2, (input1%input2));
        	                       // printf에서 '%'를 출력하기 위해서는 %%를 입력
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
	      }
 }

