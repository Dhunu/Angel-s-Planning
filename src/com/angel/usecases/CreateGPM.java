package com.angel.usecases;

import java.util.Scanner;

import com.angel.dao.BDODao;
import com.angel.dao.BDODaoImpl;
import com.angel.model.PanchayatMember;

public class CreateGPM {
	
	@SuppressWarnings("resource")
	public static void main(String[] args,int blockId) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Enter GPM Details----");
		System.out.println();
		
		BDODao bdoDao = new BDODaoImpl();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter Gram Panchayat name: ");
			String GP_Name = sc.next();
			
			System.out.println("Enter Gram Panchayat Member name: ");
			String GPM_Name = sc.next();
			
			System.out.println("Enter Project ID: ");
			int projectId = sc.nextInt();
			
			PanchayatMember member = new PanchayatMember();
			
			member.setGP_Name(GP_Name);
			member.setGPM_Name(GPM_Name);
			member.setBlock_ID(blockId);
			member.setProject_ID(projectId);
			
			try {
				System.out.println(bdoDao.createPanchyatMember(member));
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
