package com.saksham.SpringAnnotationPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.saksham.SpringAnnotationPractice ")
public class CollegeConfiguration {
	
	
	@Bean
	public College collegeBeanMethod() {		//method name will be bean ID
		College college=new College();
		return college;
	}

}
