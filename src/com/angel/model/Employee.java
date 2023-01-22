package com.angel.model;

public class Employee {
	
	private int Employee_ID;
	private String Employee_Name;
	private int Project_ID;
	private int Wage;
	private int Days_Worked;
	private int GP_ID;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_ID, String employee_Name, int project_ID, int wage, int days_Worked, int gP_ID) {
		super();
		Employee_ID = employee_ID;
		Employee_Name = employee_Name;
		Project_ID = project_ID;
		Wage = wage;
		Days_Worked = days_Worked;
		GP_ID = gP_ID;
	}

	@Override
	public String toString() {
		return "Employee [Employee_ID=" + Employee_ID + ", Employee_Name=" + Employee_Name + ", Project_ID="
				+ Project_ID + ", Wage=" + Wage + ", Days_Worked=" + Days_Worked + ", GP_ID=" + GP_ID + "]";
	}

	public int getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	public int getProject_ID() {
		return Project_ID;
	}

	public void setProject_ID(int project_ID) {
		Project_ID = project_ID;
	}

	public int getWage() {
		return Wage;
	}

	public void setWage(int wage) {
		Wage = wage;
	}

	public int getDays_Worked() {
		return Days_Worked;
	}

	public void setDays_Worked(int days_Worked) {
		Days_Worked = days_Worked;
	}

	public int getGP_ID() {
		return GP_ID;
	}

	public void setGP_ID(int gP_ID) {
		GP_ID = gP_ID;
	}
	
	

}
