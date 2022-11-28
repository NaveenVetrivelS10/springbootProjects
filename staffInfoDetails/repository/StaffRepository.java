package com.example.staffInfoDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.staffInfoDetails.Entity.StaffInformation;

;

@Repository
public interface StaffRepository extends JpaRepository<StaffInformation, Integer>{

}
