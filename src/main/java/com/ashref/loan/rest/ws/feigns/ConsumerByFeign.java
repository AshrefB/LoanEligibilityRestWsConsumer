package com.ashref.loan.rest.ws.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ashref.loan.rest.ws.payload.requests.CustomerRequest;
import com.ashref.loan.rest.ws.payload.responses.WsResponse;

@FeignClient(url = "http://localhost:8081", value = "http://localhost:8081")
public interface ConsumerByFeign {
	@PostMapping("/ws/loan/status")
	public WsResponse consumeByFeign(@RequestBody CustomerRequest request);
}
