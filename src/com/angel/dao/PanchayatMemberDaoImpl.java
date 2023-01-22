package com.angel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.angel.exceptions.EmployeeExceptions;
import com.angel.exceptions.ProjectExceptions;
import com.angel.model.Employee;
import com.angel.utility.DBUtils;

public class PanchayatMemberDaoImpl implements PanchyatMemberDao{

	@Override
	public String createEmployee(Employee employee) throws EmployeeExceptions {
		
		String message = "Data not inserted...";
		
		try(Connection conn = DBUtils.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Employee(Employee_Name, Wage, Days_Worked, GP_ID)");
			
			ps.setString(1, employee.getEmployee_Name());
			ps.setInt(2, employee.getWage());
			ps.setInt(3, employee.getDays_Worked());
			ps.setInt(4, employee.getGP_ID());
			
			int x = ps.executeUpdate();
			
			if(x>0) message = "Employee Created";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeExceptions(e.getMessage());
		}
		
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public List<Employee> viewAllEmployee() throws EmployeeExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String assignEmployeeToAProject(int EmployeeID, int ProjectID) throws EmployeeExceptions, ProjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String totalNoAndWageOfEmployee(int EmployeeID, int ProjectID) throws EmployeeExceptions, ProjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

}
