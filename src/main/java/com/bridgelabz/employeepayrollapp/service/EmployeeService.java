package com.bridgelabz.employeepayrollapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployee {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public void addEmployee(Employee employee) {

		empRepository.save(employee);
	}

}
