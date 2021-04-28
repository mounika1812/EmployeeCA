package com.workmanagement.dto;

public class Employee {

	private int id;	
	private String name;
	private String employeeType;
	private int numberOfDaysWorked;
	private float numberOfVacationDaysAccumulated;
	private float numberOfVacationDaysTaken;
	private int maxVacationDaysPerYear;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String employeeType, int numberOfDaysWorked, float numberOfVacationDaysAccumulated,
			int numberOfVacationDaysTaken, int maxVacationDaysPerYear) {
		super();
		this.id = id;
		this.name = name;
		this.employeeType = employeeType;
		this.numberOfDaysWorked = numberOfDaysWorked;
		this.numberOfVacationDaysAccumulated = numberOfVacationDaysAccumulated;
		this.numberOfVacationDaysTaken = numberOfVacationDaysTaken;
		this.maxVacationDaysPerYear = maxVacationDaysPerYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public int getNumberOfDaysWorked() {
		return numberOfDaysWorked;
	}

	public void setNumberOfDaysWorked(int numberOfDaysWorked) {
		this.numberOfDaysWorked = numberOfDaysWorked;
	}

	public float getNumberOfVacationDaysAccumulated() {
		return numberOfVacationDaysAccumulated;
	}

	public void setNumberOfVacationDaysAccumulated(float vacAccumulated) {
		this.numberOfVacationDaysAccumulated = vacAccumulated;
	}

	public float getNumberOfVacationDaysTaken() {
		return numberOfVacationDaysTaken;
	}

	public void setNumberOfVacationDaysTaken(float numberOfVacationDaysTaken) {
		this.numberOfVacationDaysTaken = numberOfVacationDaysTaken;
	}

	public int getMaxVacationDaysPerYear() {
		return maxVacationDaysPerYear;
	}

	public void setMaxVacationDaysPerYear(int maxVacationDaysPerYear) {
		this.maxVacationDaysPerYear = maxVacationDaysPerYear;
	}

}
