package com.example.staff.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.staff.dto.StaffDTO;
import com.example.staff.entity.Staffinfo;
import com.example.staff.repository.StaffRepository;
import com.example.staff.service.StaffService;


@RestController
@RequestMapping("/staffmanagement")
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@PostMapping("/savestaff")
	public Staffinfo saveStaff(@RequestBody StaffDTO staffDTO) 
	{
		return staffService.saveStaff(staffDTO);
	}
	
	@GetMapping("/getStafflist")
	public List<Staffinfo> showAllStaffinfomation()
	{
		return staffService.showAllStaffinfomation();
	}
	
	@PutMapping("/updatestaff")
	public void updateStaff(@RequestBody StaffDTO staffDTO) 
	{
		staffService.updateStaff(staffDTO);
    }
	
	@DeleteMapping("/deletestaff/{staffid}")
	public void deleteStaff(@PathVariable("staffid")  Integer staffId1) 
	{
		staffService.delete(staffId1);
    }
	
	@GetMapping(path = "/getsatffinfo/{staffid}")
	public Optional<Staffinfo> getStaffinfoId(@PathVariable("staffid") Integer id) 
	{

		return staffService.findById(id);

	}
	
	
	
}