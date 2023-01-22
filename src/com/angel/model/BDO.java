package com.angel.model;

public class BDO {
	
	private int Block_ID;
	private String Block_Name;
	private String BDO_Name;
	
	public BDO() {
		// TODO Auto-generated constructor stub
	}

	public BDO(int block_ID, String block_Name, String bDO_Name) {
		super();
		Block_ID = block_ID;
		Block_Name = block_Name;
		BDO_Name = bDO_Name;
	}

	@Override
	public String toString() {
		return "BDO [Block_ID=" + Block_ID + ", Block_Name=" + Block_Name + ", BDO_Name=" + BDO_Name + "]";
	}

	public int getBlock_ID() {
		return Block_ID;
	}

	public void setBlock_ID(int block_ID) {
		Block_ID = block_ID;
	}

	public String getBlock_Name() {
		return Block_Name;
	}

	public void setBlock_Name(String block_Name) {
		Block_Name = block_Name;
	}

	public String getBDO_Name() {
		return BDO_Name;
	}

	public void setBDO_Name(String bDO_Name) {
		BDO_Name = bDO_Name;
	}
	
	

}
