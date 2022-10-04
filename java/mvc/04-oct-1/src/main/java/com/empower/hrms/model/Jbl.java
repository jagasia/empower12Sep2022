package com.empower.hrms.model;

import org.springframework.stereotype.Component;

@Component
public class Jbl implements Audio {

	public void play(){
		System.out.println("Jbl is very very good!");
	}

}
