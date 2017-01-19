package com.savoirfairelinux.springboottest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savoirfairelinux.springboottest.beans.Interview;

public interface InterviewDao extends JpaRepository<Interview, Long>{

}
