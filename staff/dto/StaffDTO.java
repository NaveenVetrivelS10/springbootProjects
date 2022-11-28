package com.example.staff.dto;

import java.util.List;

import com.example.staff.entity.Achievement;
import com.example.staff.entity.Certificate;
import com.example.staff.entity.EducationInfo;
import com.example.staff.entity.EmployeeHistory;

public class StaffDTO 
{
	
	private int id;
	private String firstName;
	private String lastName;
	private String dob;
	private String bloodGroup;
	private String experience;
	private String mobile;
	private String address;
	private String designation;
	private List<EducationInfo>educationInfo;
	private List<EmployeeHistory>employeeHistory;
	private List<Certificate>certificate;
	private List<Achievement>achievement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<Certificate> getCertificate() {
		return certificate;
	}
	public void setCertificate(List<Certificate> certificate) {
		this.certificate = certificate;
	}
	public List<Achievement> getAchievement() {
		return achievement;
	}
	public void setAchievement(List<Achievement> achievement) {
		this.achievement = achievement;
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
