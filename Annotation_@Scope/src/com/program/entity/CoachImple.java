package com.program.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.program.service.Coach;

@Component("coachImple")
@Scope("prototype")
public class CoachImple implements Coach {

	@Override
	public void getDailyWorkout() {
		System.out.println("This is a CoachImple Class...");
		
	}

}
