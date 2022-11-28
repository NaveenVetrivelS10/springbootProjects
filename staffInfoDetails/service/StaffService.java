package com.example.staffInfoDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.staffInfoDetails.Entity.EducationInfo;
import com.example.staffInfoDetails.Entity.StaffInformation;
import com.example.staffInfoDetails.dto.EducationDTO;
import com.example.staffInfoDetails.dto.StaffDTO;
import com.example.staffInfoDetails.repository.EducationRepository;
import com.example.staffInfoDetails.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	private StaffRepository staffRepository;
	
	@Autowired
	private EducationRepository educationRepository;

	public StaffInformation updateStaff(StaffDTO staffDTO) {
		
		StaffInformation staffInformation =staffRepository.findById(staffDTO.getStaffId()).get();
		staffInformation.setFirstName(staffDTO.getFirstName());
		staffInformation.setLastName(staffDTO.getLastName());
		staffInformation.setMobileNo(staffDTO.getMobileNo());
		staffInformation.setAddress(staffDTO.getAddress());
		staffInformation.setBloodGroup(staffDTO.getBloodGroup());
		staffInformation.setDesignation(staffDTO.getDesignation());
		staffInformation.setExperience(staffDTO.getExperience());
		
		
		List<EducationInfo> EducationInfoList=new ArrayList<EducationInfo>();
				
				for(EducationDTO educationDTO:staffDTO.getEducationDTO())
				{
					EducationInfo educationInfo=educationRepository.findById(educationDTO.getEid()).get();
					educationInfo.setCollage(educationDTO.getCollage());
					educationInfo.setDegree(educationDTO.getDegree());
					educationInfo.setMajor(educationDTO.getMajor());
					educationInfo.setYop(educationDTO.getYop());
					EducationInfoList.add(educationInfo);
				}
				staffInformation.setEducationInfo(EducationInfoList);
			return staffRepository.save(staffInformation);
	}           

}
