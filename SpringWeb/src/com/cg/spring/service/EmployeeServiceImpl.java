package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDAO;
import com.cg.spring.dto.Employee;


@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public void addEmployee(Employee e) {
	 
		employeeDao.addEmployee(e);
	}

	@Override
	public List<Employee> showemployees() {
	 
		return employeeDao.showEmployees();
	}

	@Override
	public List<Employee> searchEmployee(Employee emp) {
		 
		return employeeDao.searchEmployee(emp);
	}
	
	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
		
	}
	
	@Override
	public void updateEmployee(Employee e) {
		
		 employeeDao.updateEmployee(e);
		
	}
	

}
