package com.example.springmongodb;

import com.example.springmongodb.document.User;
import com.example.springmongodb.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringmongodbApplicationTests {

	//UserRepository userRepository;
	User user;
	@Before
	public void create(){
		user = new User();
	}

	@Test
	public void contextLoads() {

		
	}

}
