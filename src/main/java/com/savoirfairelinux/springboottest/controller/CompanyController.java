package com.savoirfairelinux.springboottest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.savoirfairelinux.springboottest.beans.Company;
import com.savoirfairelinux.springboottest.service.CompanyService;
import com.savoirfairelinux.springboottest.util.AppKeys;

/**
 * 
 * @author aelbardai
 *
 */
@Controller
@RequestMapping(value = "/companies")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "")
	public String viewCompanies(Model model){
		List<Company> companies = companyService.getCompanies();
		model.addAttribute("companies",companies);
		return AppKeys.LISTCOMPANIES;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/add")
	public String addCompanyForm(){
		return AppKeys.ADDCOMPANY;
	}
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	@RequestMapping(value="/add" , method=RequestMethod.POST)
	public String addCompany(@ModelAttribute Company company){
		
		companyService.addCompany(company);
		return "redirect:/companies";
	}
}
