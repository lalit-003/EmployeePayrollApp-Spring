package com.bridgelabz.employeepayrollapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.service.IEmployee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployee employeeService;
	
	@PostMapping("/post/{empName}/{salary}")
	public void addEmployee(@PathVariable(value="empName") String name,@PathVariable(value="salary") Long salary)
	{
	   employeeService.addEmployee(name,salary);	
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployee()
	{
		 return employeeService.getEmployee();
		//employeeService.getEmployee().forEach(employee -> System.out.println(employee.toString()));

	}
	
	@GetMapping("/getbyid/{id}")
	public Employee getEmployeeById(@PathVariable("id") long empId) {
		return employeeService.getEmployeeByID(empId);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") long empId) {
		employeeService.deleteEmployee(empId);
	}
	
	@PutMapping("/update/{id}/{salary}")
	public void update(@PathVariable("id") Long id,@PathVariable(value="salary") Long salary) {
		employeeService.updateByID(id,salary);
	}
}
