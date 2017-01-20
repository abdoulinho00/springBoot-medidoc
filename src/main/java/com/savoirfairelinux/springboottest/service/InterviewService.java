package com.savoirfairelinux.springboottest.service;

import java.util.List;

import com.savoirfairelinux.springboottest.beans.Interview;

/**
 * 
 * @author aelbardai
 *
 */
public interface InterviewService {
	
	/**
	 * 
	 * @param interview
	 * @return
	 */
	public Interview addInterview(Interview interview);
	
	/**
	 * 
	 * @param interview
	 * @return
	 */
	public Interview updateInterview(Interview interview);
	
	/**
	 * 
	 * @param id
	 */
	public void removeInterview(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Interview getInterview(long id);
	
	/**
	 * 
	 * @return
	 */
	public List<Interview> getInterviews();
}
