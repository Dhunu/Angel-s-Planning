package com.angel.usecases;

import java.util.Scanner;

import com.angel.dao.BDODao;
import com.angel.dao.BDODaoImpl;
import com.angel.model.Project;

public class CreateProject {
	
	@SuppressWarnings("resource")
	public static void main(String[] args,int blockId) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Enter Project Details----");
		System.out.println();
		
		BDODao bdoDao = new BDODaoImpl();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter Project name: ");
			String projectName = sc.next();
			
			
			Project project = new Project();
			
			project.setBlock_ID(blockId);
			project.setProject_Name(projectName);
			
			try {
				System.out.println(bdoDao.insertProject(project));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want to add more?(Y/N)");
			
			String result = sc.next();
			if(result.equalsIgnoreCase("N")) {
				flag = false;
				break;
			}
		}
		
		
	}

}
