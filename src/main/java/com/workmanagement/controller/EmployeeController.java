package com.workmanagement.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workmanagement.dto.Employee;
import com.workmanagement.service.impl.EmployeeService;
import com.workmanagement.util.LocalDB;

@RestController
@RequestMapping("api/employee")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getAll")
	public ResponseEntity<Collection<Employee>> getAll() {
		try {
			return new ResponseEntity<>(LocalDB.getAllEmployees(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/work/{id}/{days}")
	public ResponseEntity<Employee> work(@PathVariable("id") int id,
			@PathVariable("days") int days) {
		try {
			return new ResponseEntity<>(employeeService.work(id, days), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/take-vacation/{id}/{days}")
	public ResponseEntity<Employee> takeVacation(@PathVariable("id") int id,
			@PathVariable("days") int days) {
		try {
			return new ResponseEntity<>(employeeService.takeVacation(id, days), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
