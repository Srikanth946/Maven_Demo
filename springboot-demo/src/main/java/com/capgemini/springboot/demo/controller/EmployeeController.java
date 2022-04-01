package com.capgemini.springboot.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.demo.model.Employee;
import com.capgemini.springboot.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController implements IEmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeService service;

//	http://localhost:8088/emp/get-employee-by-id/{eid}
	@Override
	@GetMapping("/get-employee-by-id/{eid}") // 101
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "eid") int employeeId) {
		LOG.info(Integer.toString(employeeId));
		Employee emp = service.getEmpById(employeeId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee " + employeeId + " was found successfully.");
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, HttpStatus.OK);
		return response;
	}

//	http://localhost:8088/emp/get-employee-by-id/{eid}
	@Override
	@GetMapping("/get-employees-by-firstname/{firstName}")
	public ResponseEntity<List<Employee>> getEmployeeByFirstName(@PathVariable(name = "firstName") String firstName) {
		LOG.info(firstName);
		List<Employee> empList = service.getEmpsByFirstName(firstName);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employees found successfully.");
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, headers, HttpStatus.OK);
		return response;
	}

	// http://localhost:8088/emp/get-all-employees
	@Override
	@GetMapping("/get-all-employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		LOG.info("get-all-employees");
		List<Employee> empList = service.getAllEmps();
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employees were found successfully.");
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, headers, HttpStatus.OK);
		return response;
	}

//	http://localhost:8088/emp/add-employee 
	@Override
	@PostMapping("/add-employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		LOG.info(employee.toString());
		Employee emp = service.addEmp(employee);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee " + emp.getEmployeeId() + " was created successfully.");
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, HttpStatus.CREATED);
		return response;
	}

//	http://localhost:8088/emp/update-employee 
	@Override
	@PutMapping("/update-employee")
//	@PostMapping("/update-employee")
//	@PatchMapping("/update-employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		LOG.info(employee.toString());
		Employee emp = service.updateEmp(employee);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee " + emp.getEmployeeId() + " was updated successfully.");
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, HttpStatus.OK);
		return response;
	}

//	http://localhost:8088/emp/delete-employee/{eid} 
	@Override
	@DeleteMapping("/delete-employee/{eid}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(name = "eid") int employeeId) {
		LOG.info(Integer.toString(employeeId));
		Employee emp = service.deleteEmp(employeeId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee " + employeeId + " was deleted successfully.");
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, HttpStatus.OK);
		return response;
	}
}