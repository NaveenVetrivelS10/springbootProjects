			 package com.example.staff.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.staff.dto.AchievementDTO;
import com.example.staff.dto.CertificateDTO;
import com.example.staff.dto.EducationInfoDTO;
import com.example.staff.dto.EmployeeHistoryDTO;
import com.example.staff.dto.StaffDTO;
import com.example.staff.entity.Achievement;
import com.example.staff.entity.Certificate;
import com.example.staff.entity.EducationInfo;
import com.example.staff.entity.EmployeeHistory;
import com.example.staff.entity.Staffinfo;
import com.example.staff.repository.AchivementRepository;
import com.example.staff.repository.CertificateRepository;
import com.example.staff.repository.EducationRepository;
import com.example.staff.repository.EmployeeHistoryRepository;
import com.example.staff.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	private StaffRepository staffRepo;
	@Autowired
	private AchivementRepository achivementRepository;
	@Autowired
	private CertificateRepository certificateRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private EmployeeHistoryRepository employeeHistoryRepository;

	public Staffinfo saveStaff(StaffDTO staffDTO) {
		Staffinfo staffEntity = new Staffinfo();
		BeanUtils.copyProperties(staffDTO, staffEntity);
		staffRepo.save(staffEntity);
		return staffEntity;

	}

	public List<Staffinfo> showAllStaffinfomation() 
	{
		return staffRepo.findAll();

	}

	public void updateStaff(StaffDTO staffDTO) {
		
		int staffid = staffDTO.getId();
		Staffinfo staffInfo = staffRepo.findById(staffid).get();
		staffInfo.setFirstName(staffDTO.getFirstName());
		staffInfo.setLastName(staffDTO.getLastName());
		staffInfo.setMobile(staffDTO.getMobile());
		staffInfo.setAddress(staffDTO.getAddress());
		staffInfo.setBloodGroup(staffDTO.getBloodGroup());
		staffInfo.setDesignation(staffDTO.getDesignation());
		staffInfo.setExperience(staffDTO.getExperience());
		
		List<Achievement> achievementetList = new ArrayList<>();
		
			for(Achievement achivements : staffDTO.getAchievement()) {
				Achievement achEntity = achivementRepository.findById(achivements.getaId()).get();
				achEntity.setAwards(achivements.getAwards());
				achievementetList.add(achEntity);

			}
		staffInfo.setAchievement(achievementetList);
		
		
		List<Certificate> certificateList = new ArrayList<>();
		
			for(Certificate certificates:staffDTO.getCertificate()) 
			{
				Certificate certificate= certificateRepository.findById(certificates.getcId()).get();
				certificate.setcId(certificates.getcId());
				certificate.setLevel(certificates.getLevel());
				certificate.setYears(certificates.getYears());
				certificateList.add(certificate);
			
		        staffInfo.setCertificate(certificateList);
		
	     }
		
	   List<EducationInfo>educationInfoList=new ArrayList<>();
	  
		   for(EducationInfo educationinfos:staffDTO.getEducationInfo())
		   {
			   EducationInfo eduEntity=educationRepository.findById(educationinfos.getEid()).get();
			   eduEntity.setDegree(educationinfos.getDegree());
			   eduEntity.setMajor(educationinfos.getMajor());
			   eduEntity.setYop(educationinfos.getYop());
			   eduEntity.setCollage(educationinfos.getCollage());
			   educationInfoList.add(eduEntity);
		   
		   staffInfo.setEducationInfo(educationInfoList);
		}
	   
	   List<EmployeeHistory>EmployeeHistoryList=new ArrayList<>();
	  
		   for(EmployeeHistory employeehistoryes:staffDTO.getEmployeeHistory())
		   {
			   EmployeeHistory empEntity=employeeHistoryRepository.findById(employeehistoryes.getjId()).get();
			   empEntity.setCompanyName(employeehistoryes.getCompanyName());
			   empEntity.setJobTitle(employeehistoryes.getJobTitle());
			   empEntity.setYears(employeehistoryes.getYears());
			   EmployeeHistoryList.add(empEntity);
		   
		   staffInfo.setEmployeeHistory(EmployeeHistoryList);
	   }
	   
	   staffRepo.save(staffInfo);
	   }

	public void delete(Integer staffId) {
		
		Staffinfo staffInfo = staffRepo.findById(staffId).get();
		
		staffRepo.delete(staffInfo);
	}

	public Optional<Staffinfo> findById(Integer id) {
		
		return staffRepo.findById(id) ;
	}
	
	
}
