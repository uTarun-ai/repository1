package com.springcore;
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
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        student randomstudent =(student) context.getBean("randomstudent");
        System.out.println(randomstudent); 
        student randomstudent1 =(student) context.getBean("randomstudent1");
        System.out.println(randomstudent1);
        student randomstudent2 =(student) context.getBean("randomstudent2");
        System.out.println(randomstudent2); 


    }
}
