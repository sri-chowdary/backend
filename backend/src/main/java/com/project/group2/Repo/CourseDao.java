package com.project.group2.Repo;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.group2.Model.Course;

@Repository
public interface CourseDao extends CrudRepository<Course, Integer>{

	//List<Course> findById(String courseName);

}
