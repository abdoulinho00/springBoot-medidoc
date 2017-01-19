package com.savoirfairelinux.springboottest.service;

import java.util.List;

import com.savoirfairelinux.springboottest.beans.Company;

public interface CompanyService {
	
	
	public Company addCompany(Company company);
	
	public Company updateCompany(Company company);
	
	public Company getCompay(long id);
	
	public List<Company> getCompanies();
	
	public void removeCompany(long id);
}
