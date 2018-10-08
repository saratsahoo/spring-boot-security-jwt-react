package com.pt.ex.springbootsecurityoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication

@EntityScan(basePackageClasses = {
		SpringBootSecurityOauth2Application.class,
		Jsr310JpaConverters.class
})

public class SpringBootSecurityOauth2Application {


	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityOauth2Application.class, args);
	}
}
