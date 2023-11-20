package com.anirban.studentservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.studentservice.entities.Student;
import com.anirban.studentservice.services.StudentService;

@RestController
@RequestMapping("/student")                            /* http://localhost:8081/student/**  */
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public ResponseEntity<String> createNewStudent(@RequestBody Student student){
		return studentService.createNewStudent(student);
	} 
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		return studentService.getAllStudents();
	}

}
