package com.project.group2.Model;

import javax.persistence.*;


@Entity
@Table(name="CourseDetail")
public class Course {

	@Id
	private int courseId;
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	public Course() {
		super();
		
	}
	
}
