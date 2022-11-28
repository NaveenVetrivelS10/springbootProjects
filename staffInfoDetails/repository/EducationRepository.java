package com.example.staffInfoDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.staffInfoDetails.Entity.EducationInfo;

public interface EducationRepository extends JpaRepository<EducationInfo, Integer> {

}
