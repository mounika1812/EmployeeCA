package com.workmanagement.service;

import com.workmanagement.dto.Employee;

/**
 * I_Employee Interface Contains the methods which should be implemented by all
 * concrete Employee Classes.
 *
 * @author Mounika
 */
public interface EmployeeInterface {
	/**
	 * method work:
	 * 
	 * method that takes a single integer parameter that defines the number of days
	 * worked which should be a value between 0 and 260. When this method is called,
	 * the number of vacation days accumulated should be updated appropriately.
	 * 
	 * @param daysWorked: int: number of days worked which should be a value between
	 *        0 and 260
	 * @return void
	 * @throws Exception
	 */
	public void work(Employee emp, int daysWorked) throws Exception;

	
	//public void vacAcc(Employee emp) throws Exception;
	/**
	 * method takeVacation:
	 * 
	 * method that takes a single floating-point parameter that defines the number
	 * of vacation days used. When this method is called, the number of vacation
	 * days accumulated should be updated appropriately.
	 * 
	 * @param daysUsed: float: defines the number of vacation days used
	 * @return void
	 * @throws Exception
	 */
	public void takeVacation(Employee emp, float daysUsed) throws Exception;
}
