package com.ibm.dcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@RequestMapping("/hi")
	public String hi() {
		return "hello";
	}

}
