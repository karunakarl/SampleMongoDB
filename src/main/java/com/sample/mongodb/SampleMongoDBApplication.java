package com.sample.mongodb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SampleMongoDBApplication {
	
	public static void main(String[] args){
		new SpringApplicationBuilder() 
		.run(args);
	}
}
