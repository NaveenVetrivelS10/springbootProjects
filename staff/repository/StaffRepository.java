package com.example.staff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.staff.entity.Staffinfo;
@Repository
public interface StaffRepository extends JpaRepository<Staffinfo, Integer>
{

}
