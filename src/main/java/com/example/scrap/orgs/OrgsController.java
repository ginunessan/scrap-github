package com.example.scrap.orgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orgs")
public class OrgsController {
	
	@Autowired
	private User user;
	
	@GetMapping("/{login}")
	@ResponseStatus(value = HttpStatus.OK)
	public User getUser(@PathVariable("login") final String login) {
		user.setLogin(login);
		user.setName("Giovanna");
		user.setScore(10);
		return user;  
	
	}
	

}
