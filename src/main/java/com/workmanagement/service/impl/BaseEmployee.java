package com.workmanagement.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.workmanagement.dto.Employee;
import com.workmanagement.service.EmployeeInterface;

/**
 * Employee Class This is the base class containing the logic for all types of
 * Employees. This class cannot be instantiated directly but should be extended
 * by sub-classes.
 *
 * @author Mounika
 */
abstract class BaseEmployee implements EmployeeInterface {
	// instance variables - replace the example below with your own
	public static final int maxWorkdaysPerYear = 260;
	protected int maxVacationDaysPerYear;

	/**
	 * number of vacation days accumulated for the work year (defined as 260
	 * workdays) which cannot be a negative value and is not writable externally.
	 * Upon creation its value should be set to 0.
	 */
	/**
	 * Constructor for objects of class Employee
	 */
	public BaseEmployee() {
	}

	public void work(Employee emp, int daysWorked) throws Exception {
		int UpdatedWorkDays = emp.getNumberOfDaysWorked() + daysWorked;
		if (daysWorked < 0) {
			throw new Exception("Invalid days worked, must be a positve number.");
		} else if (daysWorked > 260 || UpdatedWorkDays > 260) {
			throw new Exception("Invalid days worked, must be less than" + (BaseEmployee.maxWorkdaysPerYear + 1) + ".");
		} else {

			emp.setNumberOfDaysWorked(UpdatedWorkDays);
			
			System.out.println("here");
			calculateVacaccumation(emp);
			// Unspecified calculation for earned vacation...
			float vacAccumulated= (float) Math.ceil(((float) UpdatedWorkDays /BaseEmployee.maxWorkdaysPerYear )*maxVacationDaysPerYear);
			
			
			 
			  emp.setNumberOfVacationDaysAccumulated(vacAccumulated);
		
			  
			 
		}
	}



	public int calculateVacaccumation(Employee emp) {
		if(emp.getEmployeeType().equals("Hourly")) {
			maxVacationDaysPerYear=10;
			
		}else if(emp.getEmployeeType().equals("Salaried")) {
		// TODO Auto-generated method stub
		maxVacationDaysPerYear= 15;
		}else { 
			maxVacationDaysPerYear= 30;

		}
		return maxVacationDaysPerYear;
		
	}


	public void takeVacation(Employee emp, float daysUsed) throws Exception {
		System.out.println(daysUsed);
		if (daysUsed + emp.getNumberOfVacationDaysTaken() > maxVacationDaysPerYear) {
			throw new Exception("Invalid vacation days used, would exceed maximum vacation days allowed per year.");
		} else if (daysUsed + emp.getNumberOfVacationDaysTaken() > emp.getNumberOfVacationDaysAccumulated()) {
			throw new Exception("Invalid vacation days used, would exceed vacation days accumulated.");
		} else {
			emp.setNumberOfVacationDaysTaken(emp.getNumberOfVacationDaysTaken() + daysUsed);
		}
	}

}
