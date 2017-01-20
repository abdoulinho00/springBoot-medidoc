package com.savoirfairelinux.springboottest.service;

import java.util.List;

import com.savoirfairelinux.springboottest.beans.Candidate;

/**
 * 
 * @author aelbardai
 *
 */
public interface CandidateService {
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Candidate addCandidate(Candidate user);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Candidate updateCandidate(Candidate user);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Candidate getCandidate(long id);
	
	/**
	 * 
	 * @return
	 */
	public List<Candidate> getCandidates();
	
	/**
	 * 
	 * @param id
	 */
	public void removeCandidate(long id);
}
