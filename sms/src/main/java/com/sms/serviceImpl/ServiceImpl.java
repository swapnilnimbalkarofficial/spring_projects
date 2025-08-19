package com.sms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.Studentrepository;
import com.sms.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	Studentrepository Studentrepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return Studentrepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return Studentrepository.save(student);
	}

	
 

}
