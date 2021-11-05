package com.example.scrap.run;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.scrap.run.RunApplication;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RunApplicationTests {
	
	@Autowired
	private RunApplication controller;

	@Test
	void contextLoads() {
		
		assertThat(controller).isNotNull();
	}

}
