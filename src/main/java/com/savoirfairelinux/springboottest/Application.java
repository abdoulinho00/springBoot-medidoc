package com.savoirfairelinux.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.savoirfairelinux.springboottest.util.AppKeys;

/**
 * 
 * @author aelbardai
 *
 */
@SpringBootApplication
@Controller
public class Application {
	
	
	
	@RequestMapping("/")
	String home() {
		return AppKeys.HOME;
	}
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);//NOSONAR
	}
	
	
}
