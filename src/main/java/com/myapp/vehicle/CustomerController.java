package com.myapp.vehicle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return " welcome to Customer details page ";
	}

	@GetMapping("/getNewMessage")
	public String getNewMessage() {
		return "this is new changes";
	}

	@GetMapping("/getNewMessage2")

	public String restNewBranch() {
		return "the branch is created ";

	}

}
