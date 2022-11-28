package com.example.staff.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.staff.entity.EmployeeHistory;

public interface EmployeeHistoryRepository extends JpaRepository<EmployeeHistory, Integer>{

}
