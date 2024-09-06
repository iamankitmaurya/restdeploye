package com.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entities.Courses;

@Service
public interface CoursesService {
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses course);

}
