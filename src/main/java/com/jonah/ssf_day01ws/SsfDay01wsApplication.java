package com.jonah.ssf_day01ws;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsfDay01wsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SsfDay01wsApplication.class);
		String port = "3000";
		ApplicationArguments argsOptions = new DefaultApplicationArguments(args);

		if(argsOptions.containsOption("port")){
			port = argsOptions.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
	}

}
