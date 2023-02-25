package com.christinacruz.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value=("name"), required=false)String searchQuery, @RequestParam(value="last_name")String searchQuery2) {
		if (searchQuery == null) {
			return "Hello Human!";
		} else {
			return "Hello " + searchQuery + " " + searchQuery2 + "!";
		}
	}
	
}
