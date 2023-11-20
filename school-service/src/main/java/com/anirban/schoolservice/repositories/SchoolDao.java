package com.anirban.schoolservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirban.schoolservice.entitiesandmodels.School;

public interface SchoolDao extends JpaRepository<School,Integer>{

}
