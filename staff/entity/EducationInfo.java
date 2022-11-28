package com.example.staff.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducationInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="education_Count")
	private Integer eid;
	@Column
	private String collage;
	@Column
	private String degree;
	@Column
	private String major;
	@Column(name="Passed_out_year")
	private Integer yop;
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
