package com.savoirfairelinux.springboottest.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savoirfairelinux.springboottest.beans.Candidate;

@Transactional
public interface CandidateDao extends JpaRepository<Candidate, Long>{

}
