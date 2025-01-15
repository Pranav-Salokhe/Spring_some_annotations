package com.program.entity;

import org.springframework.stereotype.Component;

import com.program.service.FortuneService;

@Component
public class RootFortuneService implements FortuneService {

	@Override
	public void getFortuneService() {
		System.out.println("This is a RootFortuneService Class.....");
		
	}

}
