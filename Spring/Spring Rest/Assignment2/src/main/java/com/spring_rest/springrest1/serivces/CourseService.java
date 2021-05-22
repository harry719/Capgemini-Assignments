package com.spring_rest.springrest1.serivces;

import java.util.List;

import com.spring_rest.springrest1.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public void deleteCourse(Long parseLong);

}
