package com.angel.model;

public class PanchayatMember {
	
	private int GP_ID;
	private String GP_Name;
	private String GPM_Name;
	private int Block_ID;
	private int Project_ID;
	
	public PanchayatMember() {
		// TODO Auto-generated constructor stub
	}

	public PanchayatMember(int gP_ID, String gP_Name, String gPM_Name, int block_ID, int project_ID) {
		super();
		GP_ID = gP_ID;
		GP_Name = gP_Name;
		GPM_Name = gPM_Name;
		Block_ID = block_ID;
		Project_ID = project_ID;
	}

	public int getGP_ID() {
		return GP_ID;
	}

	public void setGP_ID(int gP_ID) {
		GP_ID = gP_ID;
	}

	public String getGP_Name() {
		return GP_Name;
	}

	public void setGP_Name(String gP_Name) {
		GP_Name = gP_Name;
	}

	public String getGPM_Name() {
		return GPM_Name;
	}

	public void setGPM_Name(String gPM_Name) {
		GPM_Name = gPM_Name;
	}

	public int getBlock_ID() {
		return Block_ID;
	}

	public void setBlock_ID(int block_ID) {
		Block_ID = block_ID;
	}

	public int getProject_ID() {
		return Project_ID;
	}

	public void setProject_ID(int project_ID) {
		Project_ID = project_ID;
	}

	@Override
	public String toString() {
		return "PanchayatMember [GP_ID=" + GP_ID + ", GP_Name=" + GP_Name + ", GPM_Name=" + GPM_Name + ", Block_ID="
				+ Block_ID + ", Project_ID=" + Project_ID + "]";
	}
	
	

}
