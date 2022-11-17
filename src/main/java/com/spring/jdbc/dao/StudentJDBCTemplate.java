package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentJDBCTemplate implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int createRecord(String name, String email) {
		String SQL = "INSERT INTO Student(name, email) VALUES(?,?)";
		int result = this.jdbcTemplate.update(SQL, name, email);
		return result;
	}
	
	public List<Student> getAllStudents(){
		String SQL = "SELECT * FROM Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student getStudent(int id) {
		String SQL = "SELECT * FROM Student WHERE id=?";
		Student student = jdbcTemplate.queryForObject(SQL, new StudentMapper(), id);
		return student;
	}
}
