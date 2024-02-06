package com.naveen.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GrretingServiceImpl implements IGrretingService {

	
	@Override
	public String greet() {
		
		LocalTime time=LocalTime.now();
		int hours=time.getHour();
		
		if(hours<12)
		{
			return "Good Morning";
		}
		if(hours<16)
		{
			return "Good Afternoon";
		}
		
		if(hours<20)
		{
			return "Good Evening";
		}
		else
		{
			return "Good Night";
		}
		
	}

}
