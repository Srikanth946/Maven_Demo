package com.capgemini.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboot.demo.exception.EmployeeNotFoundException;
import com.capgemini.springboot.demo.model.Employee;
import com.capgemini.springboot.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee getEmpById(int employeeId) {
		LOG.info("getEmpById " + employeeId);
		Optional<Employee> empOptional = employeeRepository.findById(employeeId);
		if (empOptional.isPresent())
			return empOptional.get();
		else
			throw new EmployeeNotFoundException("Employee with employeeId " + employeeId + " not found");
	}

	public List<Employee> getEmpsByFirstName(String firstName) {
		LOG.info("getEmpByFirstName " + firstName);
		List<Employee> empList = employeeRepository.findByFirstName(firstName);
		if (empList.isEmpty())
			throw new EmployeeNotFoundException("Any employee with the firstName " + firstName + " not found");
		else
			return empList;
	}

	public List<Employee> getAllEmps() {
		LOG.info("getAllEmps");
		return employeeRepository.findAll();
	}

	public Employee addEmp(Employee employee) {
		LOG.info("addEmp");
		
//		employeeRepository.
		
		return employeeRepository.save(employee);
	}

	public Employee updateEmp(Employee employee) {
		LOG.info("updateEmp");
		Optional<Employee> empOptional = employeeRepository.findById(employee.getEmployeeId());
		if (empOptional.isPresent())
			return employeeRepository.save(employee);
		else
			throw new EmployeeNotFoundException("Employee not found");

	}

	public Employee deleteEmp(int employeeId) {
		LOG.info("deleteEmp");
		Optional<Employee> empOptional = employeeRepository.findById(employeeId);
		Employee emp;
		if (empOptional.isPresent()) {
			emp = empOptional.get();
			employeeRepository.delete(emp);
			return emp;
		} else {
			throw new EmployeeNotFoundException("Employee with employeeId " + employeeId + " not found");
		}
	}
}