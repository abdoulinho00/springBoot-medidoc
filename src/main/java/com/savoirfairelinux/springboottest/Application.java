package com.savoirfairelinux.springboottest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	private static Log logger = LogFactory.getLog(Application.class);
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		logger.info("Some logging from abderrahmane");
		logger.debug("yo some debbugging");
	}
	
	
}
