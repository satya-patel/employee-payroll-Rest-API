package com.EmployeePayroll_RESTAPI;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {

	public enum IOService {
		DB_IO, FILE_IO, REST_IO
	}

	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = new ArrayList<>(employeePayrollList);
	}

	public EmployeePayrollService() {
	}

	public long countEntries(IOService ioService) {
		return employeePayrollList.size();
	}

	public void addEmployeeToPayroll(EmployeePayrollData employeePayrollData, IOService ioService) {
		employeePayrollList.add(employeePayrollData);
	}

	public void updateEmployeeSalary(String name, double salary, IOService ioService) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollData(name);
		if (employeePayrollData != null)
			employeePayrollData.salary = salary;
	}

	public EmployeePayrollData getEmployeePayrollData(String name) {
		EmployeePayrollData employeePayrollData;
		employeePayrollData = this.employeePayrollList.stream().filter(dataItem -> dataItem.name.equals(name))
				.findFirst().orElse(null);
		return employeePayrollData;
	}
	
	public void deleteEmployeePayroll(String name, IOService restIo) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollData(name);
		employeePayrollList.remove(employeePayrollData);
	}
}