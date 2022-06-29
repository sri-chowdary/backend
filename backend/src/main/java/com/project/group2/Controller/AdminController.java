package com.project.group2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.group2.Model.Course;
import com.project.group2.Repo.AdminDao;
import com.project.group2.Service.AdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired 
	private AdminDao adminDao;
	
	@PostMapping("/create")
	public Course addCourse(@RequestBody Course course) {

		return adminService.addCourse(course);

	}
	@PutMapping("/update")
	public Course update(@RequestBody Course course) {

		return adminService.update(course);

	}
	@DeleteMapping("/delete/{courseId}")
	private void delete(@PathVariable("courseId") int courseId) 
	{
	adminService.delete(courseId);
	}
	

}
