package com.savoirfairelinux.springboottest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.savoirfairelinux.springboottest.beans.Candidate;
import com.savoirfairelinux.springboottest.beans.Company;
import com.savoirfairelinux.springboottest.beans.Interview;
import com.savoirfairelinux.springboottest.service.CandidateService;
import com.savoirfairelinux.springboottest.service.CompanyService;
import com.savoirfairelinux.springboottest.service.InterviewService;
import com.savoirfairelinux.springboottest.util.AppKeys;

/**
 * 
 * @author aelbardai
 *
 */
@Controller
public class CandidateController {
	
	private Log logger  = LogFactory.getLog(CandidateController.class);

	
	@Autowired
	CandidateService candidateService;
	@Autowired
	CompanyService comapnyService;
	@Autowired
	InterviewService interviewService;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value= "/user")
	public String getUserInfo(Model model){

		List<Candidate> candidates = candidateService.getCandidates();
		model.addAttribute("candidates", candidates);
		return AppKeys.CANDIDATELIST ;
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/user/add")
	public String addCandidate(Model model){
		model.addAttribute("cadidate",new Candidate());
		return AppKeys.ADDCANDIDATE;
	}
	
	/**
	 * 
	 * @param candidate
	 * @return
	 */
	@PostMapping("/user/add")
	public String addCandidateForm(@ModelAttribute Candidate candidate){
		try{
		candidateService.addCandidate(candidate);
		}
		catch(TransactionSystemException e ){
			logger.info("Cannot finish transaction. check the service layer");
			logger.debug(e);
		}
		logger.info(candidate.getName());
		return "redirect:/user";
	}
	
	/**
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/user/view")
	public String viewCandidate(@RequestParam("id") long id, Model model){
		Candidate candidate = candidateService.getCandidate(id);
		logger.info("candidate email : " + candidate.getEmail());
		model.addAttribute("candidate", candidate);
		
		logger.info("number of interviews : " + candidate.getInterviews().size());
		return AppKeys.VIEWCANDIDATE;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/user/delete")
	public String deleteCandidate(@RequestParam("id") long id){
		
		try{
			candidateService.removeCandidate(id);
		}
		catch(Exception e){
			logger.error("problem deleting user" , e);
		}
		return "redirect:/user";
	}
	
	/**
	 * 
	 * @param candidate
	 * @return
	 */
	@RequestMapping(value = "/user/view" , method=RequestMethod.POST)
	public String updateCandidate(@ModelAttribute Candidate candidate){
		try{
			candidateService.updateCandidate(candidate);
			}
			catch(TransactionSystemException e ){
				logger.info("Cannot finish transaction. check the service layer");
				logger.debug(e);
			}
			logger.info(candidate.getName());
		return "redirect:/user";
	}
	/**
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/user/addInterview")
	public String addInterviewForm(@RequestParam("id") long id, Model model){
		Candidate candidate = candidateService.getCandidate(id);
		List<Company> companies = comapnyService.getCompanies();
		
		model.addAttribute("candidate", candidate);
		model.addAttribute("companies", companies);
		
		return AppKeys.ADDINTERVIEW;
	}
	
	/**
	 * 
	 * @param id
	 * @param companyId
	 * @param interview
	 * @return
	 */
	@RequestMapping(value = "/user/addInterview", method=RequestMethod.POST)
	public String addInterview(@RequestParam("id") long id,@RequestParam("company_id") long companyId, @ModelAttribute Interview interview ){
		
		Candidate candidate = candidateService.getCandidate(id);
		Company company = comapnyService.getCompay(companyId);
		interview.setId(0);
		interview.setUser(candidate);
		interview.setCompany(company);
		
		interviewService.addInterview(interview);
		
		logger.info("interview : " + interview.getId() );
		return "redirect:/user/view?id="+id;
	}
}
