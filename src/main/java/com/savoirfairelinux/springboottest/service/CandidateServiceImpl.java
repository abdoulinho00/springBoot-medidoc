package com.savoirfairelinux.springboottest.service;

import java.util.List;

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
		dao.save(candidate);
		return candidate;
	}

	@Override
	public Candidate updateCandidate(Candidate user) {
		return null;
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
