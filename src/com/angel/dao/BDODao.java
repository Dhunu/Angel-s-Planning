package com.angel.dao;

import java.util.List;

import com.angel.exceptions.EmployeeExceptions;
import com.angel.exceptions.PanchyatMemberExceptions;
import com.angel.exceptions.ProjectExceptions;
import com.angel.model.Employee;
import com.angel.model.PanchayatMember;
import com.angel.model.Project;

public interface BDODao {
	
	public String insertProject(Project project) throws ProjectExceptions;
	
	public List<Project> viewProjectList() throws ProjectExceptions;
	
	public String createPanchyatMember(PanchayatMember member) throws PanchyatMemberExceptions;
	
	public List<PanchayatMember> viewPanchyatMember(int blockId) throws PanchyatMemberExceptions;
	
	public String allocateProject(int PanchyatMemberID, int ProjectID) throws PanchyatMemberExceptions,ProjectExceptions;
	
	public List<Employee> listOfEmployeeOnAProject(int ProjectID) throws EmployeeExceptions,ProjectExceptions;

}
