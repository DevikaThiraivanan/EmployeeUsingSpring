package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Employee;


@Repository("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addEmployee(Employee e) {

		entityManager.persist(e);

	}

	@Override
	public List<Employee> showEmployees() {

		List<Employee> list = new ArrayList<Employee>();
		Query q = entityManager.createQuery("from Employee");

		list = q.getResultList();

		return list;
	}

	@Override
	public List<Employee> searchEmployee(Employee emp) {
		Query queryOne=entityManager.createQuery("FROM Employee where id=:emp_id");
		queryOne.setParameter("emp_id",emp.getId());
		List<Employee> empList=queryOne.getResultList();
		
		return empList;
	 
	}
	@Override
	public void deleteEmployee(int id) {
		
		Query queryOne=entityManager.createQuery
				("FROM Employee where emp_id=:id");
		queryOne.setParameter("id",id);
		Employee empList=(Employee) queryOne.getSingleResult();
	 
		entityManager.remove(empList);
	}


	@Override
	public void updateEmployee(Employee e) {
		
		entityManager.merge(e);
	}


}
