package com.suresh.demos.aop.annotations;

import org.springframework.stereotype.Component;

@Component
public class OpenDoorImpl implements OpenDoor {
	
	public void openDoorWithKey(int key) {
		System.out.println("Opening the Door with Key ");
	}

}
