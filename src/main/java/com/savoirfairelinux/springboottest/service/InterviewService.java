package com.savoirfairelinux.springboottest.service;

import java.util.List;

import com.savoirfairelinux.springboottest.beans.Interview;

public interface InterviewService {
	
	public Interview addInterview(Interview interview);
	
	public Interview updateInterview(Interview interview);
	
	public void removeInterview(long id);
	
	public Interview getInterview(long id);
	
	public List<Interview> getInterviews();
}
