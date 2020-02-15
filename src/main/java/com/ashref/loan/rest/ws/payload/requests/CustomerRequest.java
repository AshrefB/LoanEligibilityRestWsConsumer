package com.ashref.loan.rest.ws.payload.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRequest {
	private String customerName;
	private int age;
	private long yearlyIncome;
	private int cibilScore;
	private String employmentMode;
}
