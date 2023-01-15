
package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceImpl.StudentImpl;

@RestController
@RequestMapping("/stud")
public class StudentController {

	@Autowired
	private StudentImpl studentImpl;
	
	  
	  @GetMapping("{firstname}")
	  public ResponseEntity<Student> getStudentDataByName(@PathVariable("firstname") String firstname) {
		  Student st=studentImpl.getStudentDataByName(firstname);
		  return ResponseEntity.ok().body(st);
	  }
}

