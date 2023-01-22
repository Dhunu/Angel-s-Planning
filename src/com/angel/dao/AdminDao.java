package com.angel.dao;

import java.util.List;

import com.angel.exceptions.BDOExecptions;
import com.angel.model.BDO;

public interface AdminDao {
	
	public String createBDO(BDO bdo) throws BDOExecptions;
	
	public List<BDO> viewBDO() throws BDOExecptions;

}
