package com.wipro.springdemo1;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class MainApp {
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
////        Department dept = (Department) context.getBean("department");
////        System.out.println(dept);
//        
////        College college = (College) context.getBean("college");
////        System.out.println(college);
//          Car car = (Car) context.getBean("car");
//          System.out.println(car);
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Mobile mobile = context.getBean(Mobile.class);
        System.out.println(mobile);

    }
}
