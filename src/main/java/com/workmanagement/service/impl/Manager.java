package com.workmanagement.service.impl;

/**
 * Manager Class
 *
 * @author Mounika
 */
public class Manager extends BaseEmployee {

	/**
	 * Constructor for objects of class Manager
	 */
	public Manager() {
		// initialise instance variables
		/*
		 * Salaried employees accumulate 15 vacation days during the work year.
		 */
		this.maxVacationDaysPerYear = 30;
	}

}
