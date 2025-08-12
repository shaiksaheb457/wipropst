package com.wipro.springdemo1;

/**
 * Hello world!
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wipro.springdemo1.Department;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Department dept = (Department) context.getBean("department");
        System.out.println(dept);
    }
}