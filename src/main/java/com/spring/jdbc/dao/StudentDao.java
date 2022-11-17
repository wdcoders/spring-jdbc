package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	
	// Get Student
	public Student getStudent(int id);
	
	// Create Record
	public int createRecord(String name, String email);
	
	// Get All Students
	public List<Student> getAllStudents();
}
