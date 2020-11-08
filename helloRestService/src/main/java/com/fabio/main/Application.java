package com.fabio.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.fabio.client","com.fabio.server","com.fabio.service"})
@EnableAutoConfiguration
public class Application{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
}
