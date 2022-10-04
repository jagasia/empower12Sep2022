package com.empower.hrms.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car_Old {
	@Autowired
	private Sony sony;
	public Car_Old() {}
	public Car_Old(Sony sony) {
		super();
		this.sony = sony;
	}
	public Sony getSony() {
		return sony;
	}
	public void setSony(Sony sony) {
		this.sony = sony;
	}
	public void startMusic()
	{
		sony.play();
	}
}
