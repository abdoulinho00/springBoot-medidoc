package com.savoirfairelinux.springboottest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savoirfairelinux.springboottest.beans.Company;

public interface CompanyDao extends JpaRepository<Company, Long>{

}
