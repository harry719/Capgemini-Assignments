package com.spring_rest.springrest1.serivces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring_rest.springrest1.entities.Course;
@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList();
		list.add(new Course(111,"hari kripal kumawat"));
	}
	
	
	
	
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}





	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c= course;
				break;
			}
		}
		return c;
	}





	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		return course;
	}







	@Override
	public void deleteCourse(Long parseLong) {
    list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());		
	}

}
