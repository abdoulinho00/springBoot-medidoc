package com.savoirfairelinux.springboottest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savoirfairelinux.springboottest.beans.Candidate;

/**
 * 
 * @author aelbardai
 *
 */

public interface CandidateDao extends JpaRepository<Candidate, Long>{
	
}
