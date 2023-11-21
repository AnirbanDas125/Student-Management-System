package com.anirban.schoolservice.repositories;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anirban.schoolservice.wrappers.Student;


@FeignClient("STUDENT-SERVICE")
public interface StudentInterface {
	
	@GetMapping("student/get-by-school-id/{schoolId}")
	public ResponseEntity<List<Student>> findAllStudentsBySchool(@PathVariable Integer schoolId) ;
	    

}
