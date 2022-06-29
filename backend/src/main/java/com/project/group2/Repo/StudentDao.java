package com.project.group2.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.group2.Model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, String> {

}
