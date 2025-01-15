package com.program.entity;

import org.springframework.stereotype.Component;

import com.program.service.Coach;


@Component("getCricket")
public class CricketCoach implements Coach {
	
	@Override
	public void display() {
		System.out.println("This is a Cricket Coach class.....");
	}

}
