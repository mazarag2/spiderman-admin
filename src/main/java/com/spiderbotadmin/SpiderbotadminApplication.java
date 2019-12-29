package com.spiderbotadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class SpiderbotadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiderbotadminApplication.class, args);
	}

}
