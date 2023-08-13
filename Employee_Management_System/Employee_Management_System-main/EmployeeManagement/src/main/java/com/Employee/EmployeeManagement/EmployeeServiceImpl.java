package com.Employee.EmployeeManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl  {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public Employee addEmployee(Employee employee) {
		
	 employeeRepo.save(employee);
		
		return null;
	}

	
	public String removeEmployee(int id) {
		
		employeeRepo.deleteById(id);
		
		return "Delete data Successfully";
	}

	
	public Optional<Employee> findEmpById(int id) {
		
		Optional<Employee> emp = employeeRepo.findById(id);
		
		if(emp.isPresent()) {
			return emp;
		}else {
			return null;
		}
	}

	
	public List<Employee> getAllEmployee() {
		List<Employee> empList = employeeRepo.findAll();
		
		return empList;
	}

	
	public String updateEmployee(int id) {
		
		Optional<Employee> emp = employeeRepo.findById(id);
		
		if(emp.isPresent()) {
			
			Employee emps = new Employee();
			
			employeeRepo.save(emps);
			
			return "updated successfully";
		}else {
			
			return "Employee not found";
		}
		
	}

	

}
