package com.program.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.program.service.Coach;

@Component("coachImple")
public class CoachImple implements Coach {

	@Value("${coach.name}")
	private String name;
	@Value("${coach.email}")
	private String email;
	@Override
	public void getDailyWorkout() {
		System.out.println("This is a CoachImple Class...");
//		System.out.println("Name is:"+name+"Email is:"+email);
		System.out.println("Name is: ".concat(name).concat(" ").concat("Email is: ").concat(email));
		
	}

}
