package com.workmanagement.service.impl;

import org.springframework.stereotype.Service;

import com.workmanagement.factory.EmployeeFactory;
import com.workmanagement.service.EmployeeInterface;
import com.workmanagement.util.LocalDB;
import com.workmanagement.dto.Employee;

@Service
public class EmployeeService {

	public Employee work(int id, int days) throws Exception {
		Employee employee = LocalDB.getEmployeeById(id);
		if (employee != null) {
			EmployeeInterface service = EmployeeFactory.getEmployee(employee.getEmployeeType());
			service.work(employee, days);
			LocalDB.updateEmployee(employee);
		}
		return employee;
	}
	
	public Employee takeVacation(int id, int days) throws Exception {
		Employee employee = LocalDB.getEmployeeById(id);
		if (employee != null) {
			EmployeeInterface service = EmployeeFactory.getEmployee(employee.getEmployeeType());
			service.takeVacation(employee, days);
			LocalDB.updateEmployee(employee);
		}
		return employee;
	}

}
