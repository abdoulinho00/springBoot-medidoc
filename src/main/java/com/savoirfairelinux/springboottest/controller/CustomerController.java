package com.savoirfairelinux.springboottest.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.savoirfairelinux.springboottest.beans.Customer;

@Controller
public class CustomerController {
	private static Log logger = LogFactory.getLog(CustomerController.class);
	
	//@GetMapping("/users")
	@RequestMapping(value="/users")
	public String listCustomer(Model model){
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("mohamed"));
		customers.add(new Customer("billel"));
		customers.add(new Customer("alex"));
		model.addAttribute("customers" , customers);
		logger.info("from the controller");
		return "listcustomers";
	}
}
