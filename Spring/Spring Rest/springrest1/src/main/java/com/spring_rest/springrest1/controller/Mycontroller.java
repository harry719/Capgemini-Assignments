package com.spring_rest.springrest1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_rest.springrest1.entities.Course;
import com.spring_rest.springrest1.serivces.CourseService;

@RestController
public class Mycontroller {
	@Autowired
	private CourseService courseService;
	
    @GetMapping("/Hello")
	public String hello() {
    	return "hello world!";
    }
	//get courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
		return this.courseService.getCourses();
    	
    }
    //Alternate in mvc
    //@RequestMapping(path="/courses",method=RequestMethod.GET)
    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
    	
    }
    //also use application/JSON
    @PostMapping("/courses")
    public Course addcourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
    	
    }
   //delete course
	//	@RequestMapping(value = "/course/{courseId}", method = RequestMethod.DELETE)
		@DeleteMapping("/courses/{courseId}")
		public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
			try {
				this.courseService.deleteCourse(Long.parseLong(courseId));
				return new ResponseEntity<>(HttpStatus.OK);
				
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
}
