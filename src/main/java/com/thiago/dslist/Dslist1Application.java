package com.thiago.dslist;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.thiago.dslist.entities")
@SpringBootApplication
public class Dslist1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dslist1Application.class, args);
	}

}
