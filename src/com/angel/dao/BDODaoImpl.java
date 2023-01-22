package com.angel.dao;

import java.util.List;

import com.angel.exceptions.EmployeeExceptions;
import com.angel.exceptions.PanchyatMemberExceptions;
import com.angel.exceptions.ProjectExceptions;
import com.angel.model.Employee;
import com.angel.model.PanchayatMember;
import com.angel.model.Project;

public class BDODaoImpl implements BDODao{

	@Override
	public String insertProject(Project project) throws ProjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> viewProjectList() throws ProjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createPanchyatMember(PanchayatMember member) throws PanchyatMemberExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PanchayatMember> viewPanchyatMember() throws PanchyatMemberExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String allocateProject(int PanchyatMemberID, int ProjectID)
			throws PanchyatMemberExceptions, ProjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listOfEmployeeOnAProject(int ProjectID) throws EmployeeExceptions, ProjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

}
