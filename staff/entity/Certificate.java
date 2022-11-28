package com.example.staff.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Certificate 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Cirificate_id")
	private Integer cId;
	@Column
	private String level;
	@Column
	private Integer years;

	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	
}
