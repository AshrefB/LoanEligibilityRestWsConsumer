package com.ashref.loan.rest.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashref.loan.rest.ws.feigns.ConsumerByFeign;
import com.ashref.loan.rest.ws.payload.requests.CustomerRequest;
import com.ashref.loan.rest.ws.payload.responses.WsResponse;

@Service
public class ConsumerService {
	@Autowired
	private RestTemplate restTemplate;
	private final String URL = "http://localhost:8081/ws/loan/status";
	@Autowired
	private ConsumerByFeign feign;
	
	public WsResponse consume(CustomerRequest request) {
		return restTemplate.postForObject(URL, request, WsResponse.class);
	}
	
	public WsResponse consumeByFeign(CustomerRequest request) {
		return feign.consumeByFeign(request);
	}
	
	
}
