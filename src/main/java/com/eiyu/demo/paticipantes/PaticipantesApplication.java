package com.eiyu.demo.paticipantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eiyu.common.filter.CommonFilter;



@SpringBootApplication(scanBasePackages = {"com.eiyu.common", "com.eiyu.demo" })
public class PaticipantesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PaticipantesApplication.class, args);

		
	}


	@Bean
	public  CommonFilter loadFilter(){
		return new CommonFilter();
	}
	
	
}
