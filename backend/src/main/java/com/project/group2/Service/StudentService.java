package com.project.group2.Service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.group2.Model.Course;
import com.project.group2.Repo.CourseDao;
import com.project.group2.Repo.StudentDao;

@Service
public class StudentService {

	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private StudentDao studentDao;
	

	public List<Course> getAllCourse() {
		List<Course> course = new ArrayList<Course>();
		courseDao.findAll().forEach(course1 -> course.add(course1));
		return course;
	}

	public Course getCoursebyId(int courseId) {
		// TODO Auto-generated method stub
		return courseDao.findById(courseId).get();
	}

//	public Course addCourse(Course course) {
//		// TODO Auto-generated method stub
//		return studentDao.save(course);
//	}



}
