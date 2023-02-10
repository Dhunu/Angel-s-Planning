package com.angel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.angel.exceptions.EmployeeExceptions;
import com.angel.exceptions.PanchyatMemberExceptions;
import com.angel.exceptions.ProjectExceptions;
import com.angel.model.Employee;
import com.angel.model.PanchayatMember;
import com.angel.model.Project;
import com.angel.utility.DBUtils;

public class BDODaoImpl implements BDODao{
	
	Connection conn = DBUtils.provideConnection();

	@Override
	public String insertProject(Project project) throws ProjectExceptions {
		// TODO Auto-generated method stub
		String message = "Project not inserted";
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(
					"insert into Project(projectName, blockId) values(?,?)");
			
			ps.setString(1, project.getProject_Name());
			ps.setInt(2, project.getBlock_ID());
			
			int x = ps.executeUpdate();
			
			if(x>0) message = "Project inserted";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public List<Project> viewProjectList() throws ProjectExceptions {
		// TODO Auto-generated method stub
		List<Project> projects = new ArrayList<>();
		
		try(Connection conn = DBUtils.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement(
					"select * from Project");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Project project = new Project();
				project.setProject_ID(rs.getInt("projectId"));
				project.setProject_Name(rs.getString("projectName"));
				project.setBlock_ID(rs.getInt("blockId"));
				
				projects.add(project);
			}
			
			return projects;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return projects;
	}

	@Override
	public String createPanchyatMember(PanchayatMember member) throws PanchyatMemberExceptions {
		// TODO Auto-generated method stub
		String message = "Member not created";
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(
					"insert into GPM(GP_Name, GPM_Name, blockId, projectId) values(?,?,?,?)");
			
			ps.setString(1, member.getGP_Name());
			ps.setString(2, member.getGPM_Name());
			ps.setInt(3, member.getBlock_ID());
			ps.setInt(4, member.getProject_ID());
			
			int x = ps.executeUpdate();
			if(x>0) message = "Panchayat member inserted";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public List<PanchayatMember> viewPanchyatMember(int blockID) throws PanchyatMemberExceptions {
		// TODO Auto-generated method stub
		
		List<PanchayatMember> members  = new ArrayList<>();
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(
					"select * from GPM where blockId = ?");
			
			ps.setInt(1, blockID);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				PanchayatMember member = new PanchayatMember();
				member.setGP_ID(rs.getInt("GP_ID"));
				member.setGP_Name(rs.getString("GP_Name"));
				member.setGPM_Name(rs.getString("GPM_Name"));
				member.setBlock_ID(rs.getInt("blockId"));
				member.setProject_ID(rs.getInt("projectId"));
				
				members.add(member);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return members;
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
