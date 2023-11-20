package com.anirban.studentservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirban.studentservice.entities.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

	
	public List<Student> findBySchoolId(Integer schoolId);

}
