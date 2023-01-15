package com.example.demo.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentDao;
import com.example.demo.service.StudentService;


@Service
public class StudentImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	
	  
	@Override
	public Student getStudentDataByName(String firstname) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentName(firstname);
	}
	  

}
