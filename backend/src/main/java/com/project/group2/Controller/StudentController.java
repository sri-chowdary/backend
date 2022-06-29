package com.project.group2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.group2.Model.Course;
import com.project.group2.Service.StudentService;



@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/course")
	private List<Course> getAllCourse() 
	{
	return studentService.getAllCourse();
	}

	@GetMapping("/course/{courseId}")
	private Course getCoursebyId(@PathVariable("courseId") int courseId) 
	{
	return studentService.getCoursebyId(courseId);
	}
	
//	@GetMapping("/course/{courseName}")
//	private Course getCoursebyName(@PathVariable("courseName") String courseName) 
//	{
//	return studentService.getCoursebyName(courseName);
//	}
//	
//	@PostMapping("/create")
//	public Course addCourse(@RequestBody Course course) {
//
//		return studentService.addCourse(course);
//
//	}
	
	


}
