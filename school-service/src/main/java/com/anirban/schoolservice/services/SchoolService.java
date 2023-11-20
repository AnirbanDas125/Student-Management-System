package com.anirban.schoolservice.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anirban.schoolservice.entitiesandmodels.School;
import com.anirban.schoolservice.repositories.SchoolDao;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolDao schoolDao;

	public ResponseEntity<String> addSchool(School school) {
		try{
			schoolDao.save(school);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Item could not be added :(",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>("Item added successfully ",HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<School>> getAllSchools() {
		try {
			return new ResponseEntity<>(schoolDao.findAll(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error occurred while retrieving entities: "+ e.getMessage(),e);
		}
	}

	public ResponseEntity<School> getSchoolById(Integer schoolId) {
		School school = new School();
		Optional<School> opSc = schoolDao.findById(schoolId);
		
		if(opSc.isEmpty()) {
			throw new RuntimeException("Item Could not be found by ID->"+schoolId);
		}else {
			school = opSc.get();
		}
		
		return new ResponseEntity<>(school,HttpStatus.OK);
		
		
	}

	

}
