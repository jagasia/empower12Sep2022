package com.empower.hrms.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
//	@Qualifier("jbl")
	private Audio jbl;
	public Car() {}
	public Car(Audio Audio) {
		super();
		this.jbl = Audio;
	}
	public Audio getJbl() {
		return jbl;
	}
	public void setJbl(Audio Audio) {
		this.jbl = Audio;
	}
	public void startMusic()
	{
		jbl.play();
	}
}
