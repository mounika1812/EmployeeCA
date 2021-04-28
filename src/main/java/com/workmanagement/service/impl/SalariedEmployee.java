package com.workmanagement.service.impl;

/**
 * SalariedEmployee Class.
 *
 * @author Mounika
 */
public class SalariedEmployee extends BaseEmployee {
	/**
	 * Constructor for objects of class SalariedEmployee
	 */
	public SalariedEmployee() {
		// initialise instance variables
		/*
		 * Salaried employees accumulate 15 vacation days during the work year.
		 */
		this.maxVacationDaysPerYear = 15;
	}

}
