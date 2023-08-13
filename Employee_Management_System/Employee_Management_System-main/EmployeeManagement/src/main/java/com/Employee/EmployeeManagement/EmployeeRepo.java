package com.Employee.EmployeeManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}