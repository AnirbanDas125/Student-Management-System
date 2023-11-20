package com.anirban.studentservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirban.studentservice.entities.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
