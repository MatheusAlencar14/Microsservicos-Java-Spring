package com.dev.hreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HrEurekaServerApplication.class, args);

		System.out.printf("Deu certo!");
	}
}
