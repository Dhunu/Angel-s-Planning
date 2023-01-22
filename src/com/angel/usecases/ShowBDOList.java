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
				bdos.forEach(d -> System.out.println(d));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
