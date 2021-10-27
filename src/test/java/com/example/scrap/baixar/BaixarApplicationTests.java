package com.example.scrap.baixar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BaixarApplicationTests {
	
	@Autowired
	private BaixarApplication controller;

	@Test
	void contextLoads() {
		
		assertThat(controller).isNotNull();
	}

}
