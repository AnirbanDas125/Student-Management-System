package com.anirban.studentservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anirban.studentservice.entities.Student;
import com.anirban.studentservice.repositories.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public ResponseEntity<String> createNewStudent(Student student) {
		try {
			studentDao.save(student);
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("User could not be added because of "+e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>("User Created Successfully",HttpStatus.CREATED);
	}

	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> allStudents = new ArrayList<>();
		try{
		    allStudents = studentDao.findAll();
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(allStudents,HttpStatus.OK);
		
	}


}
