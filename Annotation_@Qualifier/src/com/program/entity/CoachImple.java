package com.program.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.program.service.Coach;
import com.program.service.FortuneService;

@Component("coachImple")
public class CoachImple implements Coach {

	@Autowired
	@Qualifier("rootFortuneService")
	private FortuneService fortuneService;

	@Override
	public void getDailyWorkout() {
		System.out.println("This is a CoachImple Class...");
		fortuneService.getFortuneService();
		
	}

}
