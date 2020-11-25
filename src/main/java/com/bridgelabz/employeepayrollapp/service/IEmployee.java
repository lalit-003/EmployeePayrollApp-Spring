package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

import com.bridgelabz.employeepayrollapp.model.Employee;

public interface IEmployee {
	
	void addEmployee(Employee employee);

	void addEmployee(String name, Long salary);
	
	List<Employee> getEmployee();
	
	Employee getEmployeeByID(Long id);
	
	void deleteEmployee(Long id);
	
	void updateByID(Long id, Long salary);
	

}
