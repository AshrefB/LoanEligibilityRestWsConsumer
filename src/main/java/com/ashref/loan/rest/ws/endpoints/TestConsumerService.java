package com.ashref.loan.rest.ws.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashref.loan.rest.ws.payload.requests.CustomerRequest;
import com.ashref.loan.rest.ws.payload.responses.WsResponse;
import com.ashref.loan.rest.ws.services.ConsumerService;

@RestController
public class TestConsumerService {
	@Autowired
	private ConsumerService service;
	
	@GetMapping("/")
	public WsResponse testConsume(/*@RequestBody CustomerRequest request*/) {
		CustomerRequest request = CustomerRequest.builder()
				.customerName("Achref")
				.age(30)
				.yearlyIncome(20001)
				.cibilScore(600)
				.employmentMode("full time")
				.build();
		return service.consume(request);
	}
	
	@GetMapping("/feign")
	public WsResponse testConsumeByFeign() {
		CustomerRequest request = CustomerRequest.builder()
				.customerName("Achref")
				.age(30)
				.yearlyIncome(20001)
				.cibilScore(600)
				.employmentMode("full time")
				.build();
		return service.consumeByFeign(request);
	}
}
