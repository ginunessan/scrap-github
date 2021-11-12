package com.example.scrap.orgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import  java.net.http.HttpClient;
import java.net.http.HttpRequest;


@RestController
@RequestMapping("/api/orgs")
public class OrgsController {

	@Autowired
	private User user;

	@GetMapping("/{login}")
	@ResponseStatus(value = HttpStatus.OK)
	public User getUser(@PathVariable("login") final String login) throws IOException, InterruptedException {

		// create a client
		var client = HttpClient.newHttpClient();
		
		var request = HttpRequest.newBuilder(URI.create("https://api.github.com/users/" + login))
				.header("accept", "application/vnd.github.v3+json").build();

		// use the client to send the request
		var response = client.send(request, new JsonBodyHandler<>(User.class));

		
		return (User) response;

	}

}
