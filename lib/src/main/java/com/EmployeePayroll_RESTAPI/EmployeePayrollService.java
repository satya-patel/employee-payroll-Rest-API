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
}
