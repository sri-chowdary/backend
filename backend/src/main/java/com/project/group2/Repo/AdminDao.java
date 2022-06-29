package com.project.group2.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.group2.Model.Admin;

@Repository
public interface AdminDao extends CrudRepository<Admin, Integer> {

}
