package com.example.staff.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Achievement
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="achivements_id")
	private Integer aId;
	@Column
	private String awards;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	
}
