package com.example.staffInfoDetails.dto;

import java.util.List;

public class StaffDTO {
	
	private Integer staffId;
	private String firstName;
	private String lastName;
	private String dob;
	private String bloodGroup;
	private String experience;
	private String mobileNo;
	private String address;
	private String designation;
	private List<EducationDTO> educationDTO;
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	public List<EducationDTO> getEducationDTO() {
		return educationDTO;
	}
	public void setEducationDTO(List<EducationDTO> educationDTO) {
		this.educationDTO = educationDTO;
	}
}
