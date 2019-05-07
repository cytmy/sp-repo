package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class P02ItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(P02ItemserviceApplication.class, args);
	}

}
 