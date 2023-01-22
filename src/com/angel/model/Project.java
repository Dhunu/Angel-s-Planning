package com.angel.model;

public class Project {
	
	private int Project_ID;
	private String Project_Name;
	private int Block_ID;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int project_ID, String project_Name, int block_ID) {
		super();
		Project_ID = project_ID;
		Project_Name = project_Name;
		Block_ID = block_ID;
	}

	@Override
	public String toString() {
		return "Project [Project_ID=" + Project_ID + ", Project_Name=" + Project_Name + ", Block_ID=" + Block_ID + "]";
	}

	public int getProject_ID() {
		return Project_ID;
	}

	public void setProject_ID(int project_ID) {
		Project_ID = project_ID;
	}

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}

	public int getBlock_ID() {
		return Block_ID;
	}

	public void setBlock_ID(int block_ID) {
		Block_ID = block_ID;
	}
	
	

}
