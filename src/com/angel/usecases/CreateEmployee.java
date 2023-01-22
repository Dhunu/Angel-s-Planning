package com.angel.usecases;

import java.util.Scanner;

import com.angel.dao.PanchayatMemberDaoImpl;
import com.angel.dao.PanchyatMemberDao;
import com.angel.model.Employee;

public class CreateEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Enter Employee Details---");
		
		System.out.println();
		
		PanchyatMemberDao member = new PanchayatMemberDaoImpl();
		
		while(true) {
			System.out.println("Enter employee name: ");
			String employeeName = sc.nextLine();
			
			System.out.println("Enter employee wage: ");
			int wage = sc.nextInt();
			
			System.out.println("Enter days worked: ");
			int daysWorked = sc.nextInt();
			
			System.out.println("Enter GP_ID: ");
			int GP_ID = sc.nextInt();
			sc.close();
			
			Employee employee = new Employee();
			employee.setEmployee_Name(employeeName);
			employee.setWage(wage);
			employee.setDays_Worked(daysWorked);
			employee.setGP_ID(GP_ID);
			
			try {
				System.out.println(member.createEmployee(employee));
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
		
		
	}

}
