package com.example.staffInfoDetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.staffInfoDetails.Entity.EducationInfo;
import com.example.staffInfoDetails.Entity.StaffInformation;
import com.example.staffInfoDetails.dto.EducationDTO;
import com.example.staffInfoDetails.dto.StaffDTO;
import com.example.staffInfoDetails.repository.StaffRepository;
import com.example.staffInfoDetails.service.StaffService;


@RestController
@RequestMapping("/Staffinfo")
public class StaffController {
	
	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private StaffService staffService;
	
	@PostMapping("/saveStaffDetails")
	public StaffInformation saveStaffDetails(@RequestBody StaffDTO staffDTO)
	{
		StaffInformation staffInformation=new StaffInformation();
		List<EducationInfo> educationList=new ArrayList<EducationInfo>();
		for(EducationDTO educationDTO:staffDTO.getEducationDTO())
		{
			EducationInfo educationInfo=new EducationInfo();
			educationInfo.setCollage(educationDTO.getCollage());
			educationInfo.setDegree(educationDTO.getDegree());
			educationInfo.setMajor(educationDTO.getMajor());
			educationInfo.setYop(educationDTO.getYop());
			educationList.add(educationInfo);
		}
		BeanUtils.copyProperties(staffDTO, staffInformation);
		staffInformation.setEducationInfo(educationList);
		return staffRepository.save(staffInformation);
	}
	
	@PutMapping("/updatestaff")
	public StaffInformation updateStaff(@RequestBody StaffDTO staffDTO) 
	{
		return staffService.updateStaff(staffDTO);
    }
	
}
