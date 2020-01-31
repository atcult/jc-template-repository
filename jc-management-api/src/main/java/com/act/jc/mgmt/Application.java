package com.act.jc.mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.act.jc.mgmt", "com.atc.jc.connectors"})
public class Application {
    public static final String BASE_URI = "v1.0/jcricket";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
