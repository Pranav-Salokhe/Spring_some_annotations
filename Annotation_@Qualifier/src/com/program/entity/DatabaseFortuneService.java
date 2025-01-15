package com.program.entity;

import org.springframework.stereotype.Component;

import com.program.service.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public void getFortuneService() {
		System.out.println("This is a DatabaseFortuneService Class....");
		
	}

}
