package com.ashref.loan.rest.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LoanEligibilityRestWsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanEligibilityRestWsConsumerApplication.class, args);
	}

}
