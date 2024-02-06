package com.naveen.service;

import java.util.List;

import com.naveen.bo.StudentBo;

public interface IStudentService {
	
	public List<StudentBo> getAllStudent();
	
	public StudentBo registerStudent(StudentBo student);
	
	public String deleteStudent(Integer Id);
	
	public StudentBo updateStudent(StudentBo bo);
	
	public StudentBo getStuent(Integer id);
	
	

}
