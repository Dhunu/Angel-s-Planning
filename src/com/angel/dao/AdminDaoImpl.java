package com.angel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.angel.exceptions.BDOExecptions;
import com.angel.model.BDO;
import com.angel.utility.DBUtils;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String createBDO(BDO bdo) throws BDOExecptions {
		// TODO Auto-generated method stub
		
		String  message = "Not Created...";
		
		try(Connection conn = DBUtils.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement(
					"insert into BDO(blockName, BDOName) values(?,?)");
			
			
			ps.setString(1, bdo.getBlock_Name());
			ps.setString(2, bdo.getBDO_Name());
			
			int x = ps.executeUpdate();
			
			if(x>0) message = "BDO created";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BDOExecptions(e.getMessage());
		}
		
		return message;
	}

	@Override
	public List<BDO> viewBDO() throws BDOExecptions {
		
		List<BDO> bdos = new ArrayList<BDO>();
		
		try(Connection conn = DBUtils.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from BDO");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				BDO bdo = new BDO();
				bdo.setBlock_ID(rs.getInt("blockId"));
				bdo.setBlock_Name(rs.getString("blockName"));
				bdo.setBDO_Name(rs.getString("BDOName"));
				
				bdos.add(bdo);
			}
			
			return bdos;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return null;
	}

}
