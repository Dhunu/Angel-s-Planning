package com.angel.usecases;

import java.util.List;

import com.angel.dao.BDODao;
import com.angel.dao.BDODaoImpl;
import com.angel.model.PanchayatMember;
import com.angel.model.Project;

public class ViewListOfGPM {
	
	public static void main(String[] args,int blockId) {
		
		BDODao bdoDao = new BDODaoImpl();
		
		List<PanchayatMember> members = bdoDao.viewPanchyatMember(blockId);
		
		if(members.size()==0) {
			System.out.println("No GPM in database");
		}else {
			System.out.println("************************* GPM Table ****************************");
			System.out.println();
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Project ID       | Project Name           | Block ID             |");
			System.out.println("--------------------------------------------------------------------");
			members.forEach(d ->{
				System.out.print(
						"| "+d.getProject_ID());
				for(int i=0;i<17-String.valueOf(d.getProject_ID()).length();i++) System.out.print(" ");
				
				System.out.print(
						"| "+d.getProject_Name());
				for(int i=0;i<23-d.getProject_Name().length();i++) System.out.print(" ");
				
				System.out.print(
						"| "+d.getBlock_ID());
				for(int i=0;i<21-String.valueOf(d.getBlock_ID()).length();i++) System.out.print(" ");
				
				System.out.println("|");
				
				}
				
			);
			System.out.println("--------------------------------------------------------------------");
			
		}
		
	}

}
