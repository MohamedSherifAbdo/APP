package com.sherif.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherif.rest.entities.Student;
import com.sherif.rest.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable long id) {
		return studentRepository.findById(id).orElse(null);
	}
	@PostMapping
public Student createStudent() {
	Student student= new Student();
	student.setFirstname("Hans");
	student.setLastname("Ropert");
	studentRepository.save(student);
	return student;
}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentRepository.deleteById(id);
		
		 
	}
	
}
