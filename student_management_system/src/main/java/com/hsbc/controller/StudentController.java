package com.hsbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hsbc.service.studentService;

@Controller
public class StudentController {
	
	private studentService student_service;

	public StudentController(studentService student_service) {
		super();
		this.student_service = student_service;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", student_service.getAllStudents());
		return "students";
	}
}
