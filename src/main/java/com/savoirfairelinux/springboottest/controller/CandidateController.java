package com.savoirfairelinux.springboottest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.savoirfairelinux.springboottest.beans.Candidate;
import com.savoirfairelinux.springboottest.service.CandidateService;

@Controller
public class CandidateController {
	
	private Log logger  = LogFactory.getLog(CandidateController.class);
	
	@Autowired
	CandidateService candidateService;
	
	@RequestMapping(value= "/user")
	public String getUserInfo(Model model){

		List<Candidate> candidates = candidateService.getCandidates();
		model.addAttribute("candidates", candidates);
		return "userInfo" ;
	}
	
	@RequestMapping(value="/user/add")
	public String addCandidate(Model model){
		model.addAttribute("cadidate",new Candidate());
		return "addCandidate";
	}
	
	@PostMapping("/user/add")
	public String addCandidateForm(@ModelAttribute Candidate candidate){
		candidateService.addCandidate(candidate);
		logger.info(candidate.getName());
		return "redirect:/user";
	}
}
