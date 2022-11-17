package com.spring.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        
        
        StudentDao obj = context.getBean("studentDao", StudentDao.class);
       
        System.out.println(obj.getStudent(2));
        
        context.close();
    }
}
