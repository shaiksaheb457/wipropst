package com.wipro.trip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AirTravelProcess travel = context.getBean(AirTravelProcess.class);

        try {
            travel.checkIn(true); 
            travel.collectBoardingPass();
            travel.doSecurityCheck();
            travel.doBoarding();
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}
