package com.angel.usecases;

import java.util.List;

import com.angel.dao.AdminDao;
import com.angel.dao.AdminDaoImpl;
import com.angel.model.BDO;

public class ShowBDOList {
	
	public static void main(String[] args) {
		
		AdminDao adminDao = new AdminDaoImpl();
		
		try {
			List<BDO> bdos = adminDao.viewBDO();
			
			if(bdos.size()==0) {
				System.out.println("No BDO in database");
			}else {
				System.out.println("********************** BDO Table ***************************");
				System.out.println("____________________________________________________________");
				System.out.println("| Block ID     | Block Name         | BDO Name             |");
				bdos.forEach(d ->{
					System.out.print(
							"| "+d.getBlock_ID());
					for(int i=0;i<13-String.valueOf(d.getBlock_ID()).length();i++) System.out.print(" ");
					
					System.out.print(
							"| "+d.getBlock_Name());
					for(int i=0;i<19-d.getBlock_Name().length();i++) System.out.print(" ");
					
					System.out.print(
							"| "+d.getBDO_Name());
					for(int i=0;i<21-d.getBDO_Name().length();i++) System.out.print(" ");
					
					System.out.println("|");
					
					}
					
				);
				System.out.println("------------------------------------------------------------");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
