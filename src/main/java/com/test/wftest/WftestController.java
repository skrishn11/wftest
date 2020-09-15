package com.test.wftest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/** Simple Rest controller **/

@RestController
public class WftestController {
	
	@GetMapping("/hello/{id}")
	public String getHello(@PathVariable ("id") String id) {
		return "Hello ***   " + id;
	}

}
