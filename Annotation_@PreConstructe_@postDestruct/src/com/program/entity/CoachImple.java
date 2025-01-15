package com.program.entity;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.program.service.Coach;

@Component("coachImple")
public class CoachImple implements Coach {

	
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Database connection open...");
	}
	
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Database connection close...");
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("This is a CoachImple Class...");
		
	}
	
	
	
	

}
