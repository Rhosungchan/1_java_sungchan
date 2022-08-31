package employ.view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import employ.model.vo.Employee;
import employ.service.Service;

public class View {

	private Scanner sc = new Scanner(System.in);
	private Service serve = new Service();
	
	
	public void displqyMenu() {
		
		int input = 0;
		do {
			
			System.out.println("====================================================");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("====================================================");
			
			try {
				
				System.out.print("메뉴 선택 : ");
				input = sc.nextInt();
				sc.nextLine();
				
				switch(input) {
				
				case 1 : addNewEmployee(); break;
				case 2 : Lookup();         break;
				case 3 : selectEmployee(); break;
				case 4 : updateEmployee(); break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 8 : break;
				case 0 : System.out.println("프로그램을 종료하겠습니다.");break;
				default: System.out.println("잘못 입력하셨습니다.");
				}
				System.out.println();
				
			} catch(InputMismatchException e){
				System.out.println("[Error] 입력 형식이 잘못되었습니다.");
				input = -1;
				sc.next();
				
			}
			
			
		} while(input!=0);
		
		
	}
	// 1. 사원 정보  추가 
	public void addNewEmployee() {
		
		System.out.println("=== [새로운 사원정보 추가] ===");
		
		System.out.print(" 사원 번호 입력 : ");
		int empld = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" 사원 이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print(" 주민등록번호 입력 : ");
		String empNo = sc.nextLine();
		
		System.out.print(" 이메일 입력 : ");
		String email = sc.nextLine();
		
		System.out.print(" 전화번호 입력 : ");
		String phone = sc.nextLine();
		
		System.out.print(" 부서명 입력 : ");
		String departmentTitle = sc.nextLine();
		
		System.out.print(" 직급명 입력 : ");
		String jobName = sc.nextLine();
		
		System.out.print(" 급여 입력 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		if(serve.addEmployee(empld, name, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("[추가 완료]");
		} else {
			System.out.println("[Error] 학생 정부 추가 실패");
		}
			
	}
	
	// 2.전체 사원 조회 
	public void Lookup() {
		System.out.println("=== [전체 사원 정보 조회] ===");

		List<Employee> emlList = serve.getEmlList();

		for (Employee H : emlList) {
			System.out.println(H);
		}

	}
	
	// 3.사번이 일치하는 사원 정보 조회
	public void selectEmployee() {
		System.out.println("=== [사번이 일치하는 사원 정보 조회] ===");
		
		System.out.print("검색할 사번 입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		List<Employee> resultList = serve.selectEmployee(empId);
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Employee H : resultList) {
				System.out.println(H);
			}
		}
		
	}
	// 4.사번이 일치하는 사원 정보 수정 
	public void updateEmployee() {
		System.out.println("=== [사번이 일치하는 사원 정보 수정] ===");
		
		System.out.print("수정하고 싶은 사번 입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" 사원 이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print(" 주민등록번호 입력 : ");
		String empNo = sc.nextLine();
		
		System.out.print(" 이메일 입력 : ");
		String email = sc.nextLine();
		
		System.out.print(" 전화번호 입력 : ");
		String phone = sc.nextLine();
		
		System.out.print(" 부서명 입력 : ");
		String departmentTitle = sc.nextLine();
		
		System.out.print(" 직급명 입력 : ");
		String jobName = sc.nextLine();
		
		System.out.print(" 급여 입력 : ");
		int salary = sc.nextInt();
		sc.nextLine();


		if(serve.addEmployee(empId, name, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("성공");
		} else {
			System.out.println("[실패] 잘못입력하셨습니다.");
		}
		
	}
	// 사번이 일치하는 사원 정보 삭제
	// 입력받은 부서와 일치하는 모든 사원 정보 조회
	// 입력받은 급여 이상을 받는 모든 사원 정보 조회
	// 부서별 급여 합 전체회
	
}

