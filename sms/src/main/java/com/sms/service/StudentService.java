package com.sms.service;

import java.util.List;

import com.sms.entity.Student;

public interface StudentService {
 
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
}
