package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentJDBCTemplate;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        
        
        StudentDao obj = context.getBean("studentDao", StudentDao.class);
        
//        String SQL = "INSERT INTO Student(name, email) VALUES(?,?)";
//        obj.update(SQL, "Uttam Kumar", "uttam@gmail.com");
        
//        Student student = new Student();
//        student.setName("Rakesh Kumar");
//        student.setEmail("rakesh@gmail.com");
//        System.out.println(obj.createRecord("Rakesh Kumar", "rakesh@gmail.com"));
        System.out.println(obj.getStudent(2));
    }
}
