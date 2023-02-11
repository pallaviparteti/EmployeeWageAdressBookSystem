package com.employeewageAdressBookManagementSystem;

public class EmployeeWageUsingObjectAndMethodsUC7 {
	public static final int IS_PART_TIME  = 1 ;
	public static final int IS_FULL_TIME = 2 ;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	public EmployeeWageUsingObjectAndMethodsUC7(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth ) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWageUsingObjectAndMethodsUC7 employeeWageUsingObjectAndMethods = new EmployeeWageUsingObjectAndMethodsUC7("reliance", 20, 2,3);
		//variables
		int empHrs = 0, totalWorkingDays = 0;
		int totalEmpHrs = 0;
		//computation
		while (totalEmpHrs <=  employeeWageUsingObjectAndMethods.maxHoursPerMonth && totalWorkingDays < employeeWageUsingObjectAndMethods.numOfWorkingDays ) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) %  3;
			switch (empCheck) {
			case IS_PART_TIME :
				empHrs = 4;
				break;
			case IS_FULL_TIME :
				empHrs = 8;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + "EmpHrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs = employeeWageUsingObjectAndMethods.empRatePerHour;
		System.out.println(" Total Employee Wage for Company: "+ employeeWageUsingObjectAndMethods.company + " is: " + totalEmpWage );

	}
}
