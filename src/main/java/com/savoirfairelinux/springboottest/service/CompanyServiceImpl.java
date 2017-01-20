package com.savoirfairelinux.springboottest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savoirfairelinux.springboottest.beans.Company;
import com.savoirfairelinux.springboottest.dao.CompanyDao;

/**
 * 
 * @author aelbardai
 *
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyDao dao;
	
	@Override
	public Company addCompany(Company company) {
		dao.save(company);
		return company;
	}

	@Override
	public Company updateCompany(Company company) {
		dao.save(company);
		return company;
	}

	@Override
	public Company getCompay(long id) {
		return dao.findOne(id);
	}

	@Override
	public List<Company> getCompanies() {
		return dao.findAll();
	}

	@Override
	public void removeCompany(long id) {
		dao.delete(id);
		
	}

}
