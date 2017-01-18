package com.savoirfairelinux.springboottest.service;

import java.util.List;

import com.savoirfairelinux.springboottest.beans.Candidate;


public interface CandidateService {
	
	public Candidate addCandidate(Candidate user);
	
	public Candidate updateCandidate(Candidate user);
	
	public Candidate getCandidate(long id);
	
	public List<Candidate> getCandidates();
	
	public void removeCandidate(long id);
}
