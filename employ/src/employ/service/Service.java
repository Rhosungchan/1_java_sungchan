package employ.service;

import java.util.ArrayList;
import java.util.List;

import employ.model.vo.Employee;

public class Service {
	
	private List<Employee> employeeList = new ArrayList<Employee>();
	
	public Service() {
		
		employeeList.add(new Employee(1, "노성찬", "940107-0000000", "skclsso52@naver.com", 
				                          "010-7130-5756", "대외협력팀", "주임",2000000));
		employeeList.add(new Employee(2, "이충재", "950308-0000000", "s하하하하@naver.com", 
				                          "010-7130-****", "대외협력팀","주임", 2500000)); }
	
	
	
	public boolean addEmployee(int empld, 
			                    String empName, 
			                    String empNo, 
			                    String email, 
			                    String phone, 
			                    String departmentTitle, 
			                    String jobName,
			                    int salary) {
		
		Employee eml = new Employee(empld, empName, empNo, email, phone, departmentTitle, jobName, salary);
				
		return employeeList.add(eml);
		
	}
	
	// 학생 전체 조회시 stdList 반환 메서드 
	public List<Employee> getEmlList(){
	
		return employeeList;
	}
	
	// 일치하는 사번 검색 
	public List<Employee> selectEmployee(int empId) {

		List<Employee> resultList = new ArrayList<Employee>();

		for (Employee H : employeeList) {

			if (H.getEmpId() == empId) {
				resultList.add(H);
			}
		}
		return resultList;
	}
	
	// 4번 사번이 일치하는 사원 정보 수정 


	public boolean updateEmployee(int empId, String empName, String empNo, String email, String phone,
			String departmentTitle, String jobName, int salary) {
		if (empId+1 >= employeeList.size() || empId+1 < 0) {

			return false;
		} else {
			
			employeeList.get(empId+1).setEmpName(empName);
			employeeList.get(empId+1).setEmpNo(empNo);
			employeeList.get(empId+1).setEmail(email);
			employeeList.get(empId+1).setPhone(phone);
			employeeList.get(empId+1).setDepartmentTitle(departmentTitle);
			employeeList.get(empId+1).setSalary(salary);
			return true;
		}
		
	}



	
	
} 	


