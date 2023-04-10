package org.ncu.stereo_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("componentconfig.xml  ");
        student student1 = (student) context.getBean("student" , student.class);
        
        System.out.println(student1);

    }
}
