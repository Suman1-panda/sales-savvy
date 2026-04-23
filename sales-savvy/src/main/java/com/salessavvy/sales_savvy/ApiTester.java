package com.salessavvy.sales_savvy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiTester {
	
	@GetMapping("/api/test")
	public String apiTest() {
		return "API was hit, go ahead!";
	}

}
