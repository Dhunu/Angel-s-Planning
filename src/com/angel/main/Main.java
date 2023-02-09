package com.angel.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.angel.model.BDO;
import com.angel.usecases.CreateBDO;
import com.angel.usecases.ShowBDOList;
import com.angel.utility.DBUtils;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("----- Welcome to MGNREGA -----");
		System.out.println("******************************");
		
		System.out.println();
		
		boolean flag = true;
		while(flag) {
			System.out.println("Select one option from below: ");
			System.out.println("1. Admin");
			System.out.println("2. BDO");
			System.out.println("3. Gram Panchyat Member: ");
			System.out.println("4. Exit");
			
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			
			switch (a) {
			case 1: {
				System.out.println("******************************");
				System.out.println("--------- Admin Login --------");
				System.out.println("******************************");
				System.out.println();
				System.out.println("Enter username: ");
				String username = sc.next();
				System.out.println("Enter password: ");
				String password = sc.next();
				if(username.equals("admin") && password.equals("admin")) {
					System.out.println("******************************");
					System.out.println("-------- Welcome Admin -------");
					
					boolean flag1 = true;
					
					while(flag1) {
						System.out.println("******************************");
						System.out.println("Select  an option: ");
						System.out.println("1. Create BDO");
						System.out.println("2. Show List of BDO");
						System.out.println("3. Logout");
						
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
						case 3: {
							flag1 = false;
							break;
						}
						default:
							throw new IllegalArgumentException("Unexpected value: " + b);
						}
						
					}
					if(!flag1) break;
					
					
				}else {
					System.out.println("Wrong Username/Password");
					System.out.println();
					break;
				}
				
				
			}
			case 2: {
				System.out.println("******************************");
				System.out.println("------------- BDO ------------");
				System.out.println("******************************");
				System.out.println();
				
				System.out.println("Enter block ID: ");
				int id = sc.nextInt();
				System.out.println("Enter block name: ");
				String blockName = sc.next();
				System.out.println("Enter BDO name: ");
				String BDOName = sc.next();
				
				try(Connection conn = DBUtils.provideConnection()) {
					
					PreparedStatement ps = conn.prepareStatement(
							"select * from BDO where blockId = ?");
					
					ps.setInt(1, id);
					
					ResultSet rs = ps.executeQuery();
					
					
					if(rs.next()==true) {
						
						BDO bdo = new BDO();
						while(rs.next()) {
							bdo.setBlock_ID(id);
							bdo.setBlock_Name(rs.getString("blockName"));
							bdo.setBDO_Name(rs.getString("BDOName"));
						}
						
						
						if(bdo.getBDO_Name().equals(BDOName) && bdo.getBlock_Name().equals(blockName)) {
							System.out.println("******************************");
							System.out.println("-------- Welcome BDO ---------");
							boolean flag1 = true;
							
							while(flag1) {
								
								System.out.println("******************************");
								
								System.out.println("Select an option: ");
								System.out.println("1. Create a project");
								System.out.println("2. View list of projects");
								System.out.println("3. Create GPM");
								System.out.println("4. View list of GMP");
								System.out.println("5. Allocate projects to GPM");
								System.out.println("6. List of Employee working on a project with wages");
								System.out.println("7. Logout");
								
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
								case 7: {
									
								}
								default:
									throw new IllegalArgumentException("Unexpected value: " + c);
								}
								
							}
							
							if(!flag1) {
								break;
							}
							
							
						}else {
							System.out.println("Wrong BDO credentials");
							
						}
						
						
						
					}else {
						System.out.println("BDO doesn't exist!");
						System.out.println();
					}
					
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
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
