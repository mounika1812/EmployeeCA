package com.workmanagement.factory;

import com.workmanagement.service.EmployeeInterface;
import com.workmanagement.service.impl.HourlyEmployee;
import com.workmanagement.service.impl.Manager;
import com.workmanagement.service.impl.SalariedEmployee;

public class EmployeeFactory {

	private static EmployeeInterface hourlyEmp = new HourlyEmployee();
	private static EmployeeInterface salariedEmp = new SalariedEmployee();
	private static EmployeeInterface manager = new Manager();

	public static EmployeeInterface getEmployee(String employeeType) {
		if ("Hourly".equalsIgnoreCase(employeeType)) {
			return hourlyEmp;
		} else if ("Salaried".equalsIgnoreCase(employeeType)) {
			return salariedEmp;
		} else if ("Manager".equalsIgnoreCase(employeeType)) {
			return manager;
		}
		return hourlyEmp;
	}

}
