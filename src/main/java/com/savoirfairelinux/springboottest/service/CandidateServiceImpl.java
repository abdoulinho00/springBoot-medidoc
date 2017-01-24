package com.savoirfairelinux.springboottest.service;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savoirfairelinux.springboottest.beans.Candidate;
import com.savoirfairelinux.springboottest.dao.CandidateDao;

/**
 * 
 * @author aelbardai
 *
 */
@Service
@Transactional
public class CandidateServiceImpl implements CandidateService{
	private final Log logger = LogFactory.getLog(CandidateServiceImpl.class);
	
	@Autowired
	CandidateDao dao;
	
	@Override
	public Candidate addCandidate(Candidate candidate) {
		try{
			dao.save(candidate);
		}
		catch(ConstraintViolationException e){
			logger.error("Constraint violation : Cannot add a new candidate");
			logger.debug(e);
		}
		return candidate;
	}

	@Override
	public Candidate updateCandidate(Candidate candidate) {
		try{
			dao.save(candidate);
		}
		catch(ConstraintViolationException e){
			logger.error("Constraint violation : Cannot update candidate");
			logger.debug(e);
		}
		return candidate;
	}

	@Override
	public Candidate getCandidate(long id) {
		
		return dao.findOne(id);
	}

	@Override
	public List<Candidate> getCandidates() {
		List<Candidate> candidates = dao.findAll() ;
		logger.info("total candidates : " + candidates.size());
		return candidates;
	}

	@Override
	public void removeCandidate(long id) {
		dao.delete(id);
	}

}
