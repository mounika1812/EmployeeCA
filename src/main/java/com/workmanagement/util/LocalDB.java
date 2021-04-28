package com.workmanagement.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.workmanagement.dto.Employee;

public class LocalDB {

	private static Map<Integer, Employee> employees = new HashMap<>();

	static {
		// Hourly Employee
		employees.put(101, new Employee(101, "Hourly1", "Hourly", 150, 7, 0, 10));
		employees.put(102, new Employee(102, "Hourly2", "Hourly", 100, 4, 0, 10));
		employees.put(103, new Employee(103, "Hourly3", "Hourly", 250, 9, 0, 10));
		employees.put(104, new Employee(104, "Hourly4", "Hourly", 68, 2, 0, 10));
		employees.put(105, new Employee(105, "Hourly5", "Hourly", 10, 0, 0, 10));
		employees.put(106, new Employee(106, "Hourly6", "Hourly", 26, 0, 0, 10));
		employees.put(107, new Employee(107, "Hourly7", "Hourly", 70, 2, 0, 10));
		employees.put(108, new Employee(108, "Hourly8", "Hourly", 63, 2, 0, 10));
		employees.put(109, new Employee(109, "Hourly9", "Hourly", 46, 1, 0, 10));
		employees.put(110, new Employee(110, "Hourly10", "Hourly", 96, 3, 0, 10));

		// Salaried Employee
		employees.put(201, new Employee(201, "Salaried1", "Salaried", 150, 7, 0, 15));
		employees.put(202, new Employee(202, "Salaried2", "Salaried", 100, 4, 0, 15));
		employees.put(203, new Employee(203, "Salaried3", "Salaried", 250, 9, 0, 15));
		employees.put(204, new Employee(204, "Salaried4", "Salaried", 68, 2, 0, 15));
		employees.put(205, new Employee(205, "Salaried5", "Salaried", 15, 0, 0, 15));
		employees.put(206, new Employee(206, "Salaried6", "Salaried", 26, 0, 0, 15));
		employees.put(207, new Employee(207, "Salaried7", "Salaried", 70, 2, 0, 15));
		employees.put(208, new Employee(208, "Salaried8", "Salaried", 63, 2, 0, 15));
		employees.put(209, new Employee(209, "Salaried9", "Salaried", 46, 1, 0, 15));
		employees.put(210, new Employee(210, "Salaried10", "Salaried", 96, 3, 0, 15));

		// Manager Employee
		employees.put(301, new Employee(301, "Manager1", "Manager", 150, 7, 0, 30));
		employees.put(302, new Employee(302, "Manager2", "Manager", 100, 4, 0, 30));
		employees.put(303, new Employee(303, "Manager3", "Manager", 250, 9, 0, 30));
		employees.put(304, new Employee(304, "Manager4", "Manager", 68, 2, 0, 30));
		employees.put(305, new Employee(305, "Manager5", "Manager", 10, 0, 0, 30));
		employees.put(306, new Employee(306, "Manager6", "Manager", 26, 0, 0, 30));
		employees.put(307, new Employee(307, "Manager7", "Manager", 70, 2, 0, 30));
		employees.put(308, new Employee(308, "Manager8", "Manager", 63, 2, 0, 30));
		employees.put(309, new Employee(309, "Manager9", "Manager", 46, 1, 0, 30));
		employees.put(310, new Employee(310, "Manager10", "Manager", 96, 3, 0, 30));
	}

	public static Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public static Employee getEmployeeById(int id) {
		return employees.get(id);
	}

	public static void updateEmployee(Employee employee) {
		employees.put(employee.getId(), employee);
	}

}
