package com.angel.usecases;

import java.util.Scanner;

import com.angel.dao.AdminDao;
import com.angel.dao.AdminDaoImpl;
import com.angel.model.BDO;

public class CreateBDO {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Enter BDO Details----");
		System.out.println();
		
		AdminDao adminDao = new AdminDaoImpl();
		
		while(true) {
			System.out.println("Enter Block name: ");
			String blockName = sc.nextLine();
			
			System.out.println("Enter BDO name: ");
			String BDOName = sc.nextLine();
			
			BDO bdo = new BDO();
			
			bdo.setBlock_Name(blockName);
			bdo.setBDO_Name(BDOName);
			
			try {
				System.out.println(adminDao.createBDO(bdo));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want to add more?(Y/N)");
			
			String result = sc.nextLine();
			if(result.equalsIgnoreCase("N")) {
				System.out.println("Thank you for registering");
				break;
			}
		}
		
		sc.close();
		
	}

}
