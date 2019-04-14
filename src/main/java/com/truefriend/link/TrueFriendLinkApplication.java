package com.truefriend.link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TrueFriendLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrueFriendLinkApplication.class, args);
	}

}

