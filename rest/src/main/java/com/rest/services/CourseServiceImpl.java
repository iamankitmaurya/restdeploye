package com.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entities.Courses;
@Service
public class CourseServiceImpl implements CoursesService{
	
	
	List<Courses> list;
	public  CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(1,"java","this is java course","1000"));
		list.add(new Courses(2,"java","this is react course","2000"));
		list.add(new Courses(3,"java","this is rest course","3000"));
	}

	@Override
	public List<Courses> getCourses() {
		
		return list;
	}
	
	
	
	

	@Override
	public Courses getCourse(long CourseId) {
		
		Courses c=null;
		for (Courses courses : list) {
			if(courses.getId()==CourseId) {
				c=courses;
				break;
			}
			
		}
		
		return c;
		
		
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}
	
	
	
	
	
	

}
