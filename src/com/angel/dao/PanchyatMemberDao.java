package com.angel.dao;

import java.util.List;

import com.angel.exceptions.EmployeeExceptions;
import com.angel.exceptions.ProjectExceptions;
import com.angel.model.Employee;

public interface PanchyatMemberDao {
	
	public String createEmployee(Employee employee) throws EmployeeExceptions;
	
	public List<Employee> viewAllEmployee() throws EmployeeExceptions;
	
	public String assignEmployeeToAProject(int EmployeeID, int ProjectID) throws EmployeeExceptions, ProjectExceptions;
	
	public String totalNoAndWageOfEmployee(int EmployeeID, int ProjectID) throws EmployeeExceptions, ProjectExceptions;
	

}
