package com.program.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.service.Coach;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		Coach coach = context.getBean("coachImple",Coach.class);
		coach.getDailyWorkout();
		System.out.println(coach.hashCode());
		
		Coach coach1 = context.getBean("coachImple",Coach.class);
		coach1.getDailyWorkout();
		System.out.println(coach1.hashCode());
	}

}
