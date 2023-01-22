package com.angel.main;

import java.util.Scanner;

import com.angel.usecases.CreateBDO;
import com.angel.usecases.ShowBDOList;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("---Welcome to MGNREGA---");
		
		System.out.println();
		
		boolean flag = true;
		while(flag) {
			System.out.println("Select one option brom below: ");
			System.out.println("1. Admin");
			System.out.println("2. BDO");
			System.out.println("3. Gram Panchyat Member: ");
			System.out.println("4. Exit");
			
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			
			switch (a) {
			case 1: {
				System.out.println("---Admin---");
				System.out.println();
				
				System.out.println("Select  an option: ");
				System.out.println("1. Create BDO");
				System.out.println("2. Show List of BDO");
				
				int b = sc.nextInt();
				
				switch (b) {
				case 1: {
					CreateBDO.main(args);
					break;
				}
				case 2: {
					ShowBDOList.main(args);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + b);
				}
				break;
			}
			case 2: {
				System.out.println("---BDO---");
				System.out.println();
				
				System.out.println("Select an option: ");
				System.out.println("1. Create a project");
				System.out.println("2. View list of projects");
				System.out.println("3. Create GPM");
				System.out.println("4. View list of GMP");
				System.out.println("5. Allocate projects to GPM");
				System.out.println("6. List of Employee working on a project with wages");
				
				int c = sc.nextInt();
				
				switch (c) {
				case 1: {
					
					break;
				}
				case 2: {
					
					break;
				}
				case 3: {
		
					break;
				}
				case 4: {
		
					break;
				}
				case 5: {
		
					break;
				}
				case 6: {
		
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + c);
				}
				
				break;
			}
			case 3: {
		
				break;
			}
			case 4: {
				sc.close();
				System.out.println("Exited...");
				flag = false;
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}
			
			
			
		}
		
		
		
	}

}
