package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

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

	@Override
	public void addEmployee(String name, Long salary) {
		Employee employee = new Employee();
		employee.setSalary(salary);
		employee.setEmpName(name);
		empRepository.save(employee);

	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeByID(Long id) {
		// TODO Auto-generated method stub
		return empRepository.findById(id).get();
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		empRepository.deleteById(id);
	}

	@Override
	public void updateByID(Long id, Long salary) {
		// TODO Auto-generated method stub
		Employee employee = empRepository.findById(id).get();
		employee.setSalary(salary);
		empRepository.save(employee);
		
	}

}
