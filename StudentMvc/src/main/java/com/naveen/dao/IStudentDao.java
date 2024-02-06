package com.naveen.dao;

import org.springframework.data.repository.CrudRepository;

import com.naveen.bo.StudentBo;

public interface IStudentDao extends CrudRepository<StudentBo, Integer> {

}
