package com.wipro.trip;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.wipro.trip.AirTravelProcess.checkIn(boolean))")
    public void showPhotoId() {
        System.out.println(" Show Photo ID before Check-In.");
    }

    @Before("execution(* com.wipro.trip.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.trip.AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println("Show Boarding Pass.");
    }

    @AfterThrowing(pointcut = "execution(* com.wipro.trip.AirTravelProcess.checkIn(boolean))", throwing = "ex")
    public void handleNoSeatException(NoSeatAvailableException ex) {
        System.out.println("Exception caught: " + ex.getMessage());
    }
}
