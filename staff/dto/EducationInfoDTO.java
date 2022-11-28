package com.example.staff.dto;




public class EducationInfoDTO 
{
	
	private Integer eid;
	private String degree;
	private String major;
	private Integer yop;
	private String collage;
	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getYop() {
		return yop;
	}

	public void setYop(Integer yop) {
		this.yop = yop;
	}


}
