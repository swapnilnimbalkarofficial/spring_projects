package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired 
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return "home";//html home file
		
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students",service.getAllStudents());
		return "students"; 
	}
	
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		Student student= new Student();//to hold the student obj
		model.addAttribute("students",student);
		
		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		service.saveStudent(student);
		return "redirect:/students";
	}

}
