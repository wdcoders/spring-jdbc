package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentJDBCTemplate;

@Configuration
public class SpringJdbcConfig {

	@Bean(name = { "ds" })
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/java_spring_jdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	
	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTempate = new JdbcTemplate();
		jdbcTempate.setDataSource(getDataSource());
		return jdbcTempate;
	}
	
	@Bean(name = { "studentDao" })
	public StudentDao getStudentDao() {
		StudentJDBCTemplate studentDao = new StudentJDBCTemplate();
		studentDao.setJdbcTemplate(getJdbcTemplate());
		return studentDao;
	}
	
}
