package com.claim.springbackendthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.claim")
public class SpringBackEndThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackEndThreeApplication.class, args);
	}

}
