package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee e);
	
	
	public List<Employee> showEmployees();
	
	public List<Employee> searchEmployee(Employee emp);
	public void deleteEmployee(int id);
	 
	public void updateEmployee(Employee e);
	
}
