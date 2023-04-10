package com.Spring.Initial_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started " );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/Initial_JDBC/config_jdbc.xml");
        JdbcTemplate template =context.getBean("jdbctemplate", JdbcTemplate.class);
        
        String query= "insert into student(id,name,city) values(?,?,?)";
        int result = template.update(query,123 ,"krati " , "gurgaon");
        System.out.println("number of records inserted..." + result);
        
    }
}
