package com.student.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.student.domain.Student;
import com.student.dto.StudentDTO;

@Service
public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	@Query(value="select * from student_information s where s.student_name=:name",nativeQuery=true)
	public StudentDTO findStudent(@Param("name")String name);

	@Transactional
	@Modifying
	@Query(value="delete from student_information  where student_id=:studentid",nativeQuery=true)
	public void delete(@Param("studentid")Integer studentid);
	

}
