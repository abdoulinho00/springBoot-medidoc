package com.savoirfairelinux.springboottest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savoirfairelinux.springboottest.beans.Interview;
import com.savoirfairelinux.springboottest.dao.InterviewDao;

@Service
@Transactional
public class InterviewServiceImpl implements InterviewService {
	
	@Autowired
	InterviewDao dao;
	
	@Override
	public Interview addInterview(Interview interview) {
		return dao.save(interview);
	}

	@Override
	public Interview updateInterview(Interview interview) {
		return dao.save(interview);
	}

	@Override
	public void removeInterview(long id) {
		dao.delete(id);
		
	}

	@Override
	public Interview getInterview(long id) {
		return dao.findOne(id);
	}

	@Override
	public List<Interview> getInterviews() {
		return dao.findAll();
	}

}
