package com.employeewageAdressBookManagementSystem;

public class EmployeeWageForMultipleCompanyUC8 {
	public static final int IS_PART_TIME  = 1 ;
	public static final int IS_FULL_TIME = 2 ;

	//private final String company = " ";
	//private final int empRatePerHour = 20;
	//private final int numOfWorkingDays = 2;
	//private final int maxHoursPerMonth = 10;
	public static int calculateEmployeeWageForCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth ) {
		//variables
		int empHrs = 0, totalWorkingDays = 0;
		int totalEmpHrs = 0;
		//computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays ) {
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
		int totalEmpWage = totalEmpHrs = empRatePerHour;
		System.out.println(" Total Employee Wage for Company: "+ company + " is: " + totalEmpWage );
		return totalEmpWage;

	}
	public static void main(String[] args) {
		calculateEmployeeWageForCompany("Bridgelabz", 20, 2,3);
		calculateEmployeeWageForCompany("reliance", 20, 4,5);
		calculateEmployeeWageForCompany("Wipro", 21, 6, 7);
		calculateEmployeeWageForCompany("Cognizant", 40, 6, 9);
		calculateEmployeeWageForCompany("IBM", 30, 7, 8);
	}
}



