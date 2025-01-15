package com.program.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.service.Coach;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		Coach coach = context.getBean("coachImple",Coach.class);
		coach.getDailyWorkout();
		context.registerShutdownHook();
		
	}

}
