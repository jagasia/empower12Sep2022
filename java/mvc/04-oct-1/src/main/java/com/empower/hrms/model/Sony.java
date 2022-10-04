package com.empower.hrms.model;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Audio {

	public void play(){
		System.out.println("Sony plays good music");
	}

}
