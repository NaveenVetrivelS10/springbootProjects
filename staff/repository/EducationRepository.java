package com.example.staff.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.staff.entity.EducationInfo;

public interface EducationRepository extends JpaRepository<EducationInfo, Integer>{

}
