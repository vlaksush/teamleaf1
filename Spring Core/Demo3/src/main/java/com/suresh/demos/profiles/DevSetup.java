package com.suresh.demos.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevSetup implements Setup {

	@Override
	public String setupData() {
		return "Development Setup";
	}

}
