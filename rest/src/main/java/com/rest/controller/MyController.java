package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Courses;
import com.rest.services.CoursesService;

@RestController
public class MyController {
	@Autowired
	private CoursesService coursesService;
	
	
	
	//for demo
	@GetMapping("/home")
	public String home() {
		return "this id home";
	}
	
	
	//return all courses
	@GetMapping("/courses")
	public List<Courses> getCourse(){
		return coursesService.getCourses();
		
		
		
		
	}
	
	
	
	
	//return selected course by id
	@GetMapping("/courses/{CourseId}")
	public Courses getCourse(@PathVariable String CourseId) {
		return this.coursesService.getCourse(Long.parseLong(CourseId));
	}
	
	
	
	
	//Add courses
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		
		return this.coursesService.addCourse(course);
		
	}
	
	
	
	
	

}
