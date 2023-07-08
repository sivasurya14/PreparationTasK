package com.myapp.vehicle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("/getMessage")
	public String getMessage() {		
		return " welcome to Customer details page ";
	}

}
