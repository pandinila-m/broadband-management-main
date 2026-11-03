package com.pandinila.broadband_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BroadbandManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BroadbandManagementApplication.class, args);
	}

}
