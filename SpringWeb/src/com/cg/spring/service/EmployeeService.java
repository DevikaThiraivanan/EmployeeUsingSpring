package com.cg.spring.service;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee e);
	public List<Employee> showemployees();
	public List<Employee> searchEmployee(Employee emp);
	public void deleteEmployee(int id);
	 
	public void updateEmployee(Employee e);

}
