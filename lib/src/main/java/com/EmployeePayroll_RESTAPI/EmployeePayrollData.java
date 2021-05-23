package com.EmployeePayroll_RESTAPI;

import java.time.LocalDate;

public class EmployeePayrollData {

	public int id;
	public String name;
	public String gender;
	public double salary;
	public LocalDate startDate;

	public EmployeePayrollData(int id, String name, String gender, double salary, LocalDate startDate) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.startDate = startDate;
	}

}
