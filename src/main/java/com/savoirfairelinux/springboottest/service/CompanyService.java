package com.savoirfairelinux.springboottest.service;

import java.util.List;

import com.savoirfairelinux.springboottest.beans.Company;

/**
 * 
 * @author aelbardai
 *
 */
public interface CompanyService {
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	public Company addCompany(Company company);
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	public Company updateCompany(Company company);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Company getCompay(long id);
	
	/**
	 * 
	 * @return
	 */
	public List<Company> getCompanies();
	
	/**
	 * 
	 * @param id
	 */
	public void removeCompany(long id);
}
