package com.anirban.schoolservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.schoolservice.entitiesandmodels.School;
import com.anirban.schoolservice.services.SchoolService;

@RestController
@RequestMapping("/school")                   /* http://localhost:8082 */
public class SchoolController {
    
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addSchool(@RequestBody School school ){
		return schoolService.addSchool(school);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<School>> getAllSchools(){
		return schoolService.getAllSchools();
	}
	
	
	@GetMapping("/get-school/{schoolId}")
	public ResponseEntity<School> getSchoolById(@PathVariable Integer schoolId){
		return schoolService.getSchoolById(schoolId);
	}
}
