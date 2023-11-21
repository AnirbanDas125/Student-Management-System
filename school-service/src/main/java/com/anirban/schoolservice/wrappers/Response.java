package com.anirban.schoolservice.wrappers;

import java.util.List;

import com.anirban.schoolservice.entitiesandmodels.School;

public class Response {
	
	private School school;
	private List<Student> studens;
	
	public Response() {
		
	}

	public Response(School school, List<Student> studens) {
		super();
		this.school = school;
		this.studens = studens;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public List<Student> getStudens() {
		return studens;
	}

	public void setStudens(List<Student> studens) {
		this.studens = studens;
	}
	
	

}
