package com.example.staff.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Staffinfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="staff_id")
	private Integer sId;
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String dob;
	@Column(name="blood_group")
	private String bloodGroup;
	@Column
	private String experience;
	@Column
	private String mobile;
	@Column
	private String address;
	@Column
	private String designation;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<EducationInfo>educationInfo;	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<EmployeeHistory>employeeHistory;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Achievement>achievement;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Certificate>certificate;
	
	public List<EducationInfo> getEducationInfo() {
		return educationInfo;
	}
	public void setEducationInfo(List<EducationInfo> educationInfo) {
		this.educationInfo = educationInfo;
	}
	public List<EmployeeHistory> getEmployeeHistory() {
		return employeeHistory;
	}
	public void setEmployeeHistory(List<EmployeeHistory> employeeHistory) {
		this.employeeHistory = employeeHistory;
	}
	public List<Achievement> getAchievement() {
		return achievement;
	}
	public void setAchievement(List<Achievement> achievement) {
		this.achievement = achievement;
	}
	public List<Certificate> getCertificate() {
		return certificate;
	}
	public void setCertificate(List<Certificate> certificate) {
		this.certificate = certificate;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
