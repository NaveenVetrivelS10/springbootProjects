package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.domain.Student;
import com.student.dto.StudentDTO;
import com.student.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@PostMapping(path = "/saveStudent")
	public void createStudent(@RequestBody StudentDTO studentDTO) {
		Student student = new Student();

		BeanUtils.copyProperties(studentDTO, student);
		studentRepository.save(student);
		
	}

	@GetMapping(path = "/getStudentByname/{name}")
	public StudentDTO getStudent(@PathVariable("name") String name) {

		StudentDTO studentDTO = (StudentDTO) studentRepository.findStudent(name);

		return studentDTO;
	}

	@GetMapping(path = "/getStudentlist")
	public List<Student> getStudentList() {

		List<Student> studentList = (List<Student>) studentRepository.findAll();

		return studentList;

	}

	@DeleteMapping("/deletestudentbyid/{studentid}")
	private void deleteStudent(@PathVariable("studentid") Integer studentid) {
		studentRepository.delete(studentid);
	}

	@GetMapping(path = "/getStudentcount")
	private Long count() {
		return studentRepository.count();

	}

	@GetMapping(path = "/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") Integer id) {

		return studentRepository.findById(id);

	}
	
	
}
