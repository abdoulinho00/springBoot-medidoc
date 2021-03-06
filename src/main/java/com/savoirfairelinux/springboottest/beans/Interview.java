package com.savoirfairelinux.springboottest.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author aelbardai
 *
 */
@Entity
public class Interview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date scheduledDate;
	private String jobTitle;
	private String jobUrl;
	private String observations;
	
	@ManyToOne(optional=false) 
    @JoinColumn(name="company_id", nullable=false, updatable=false)
	private Company company;
	
	
	@ManyToOne(optional=false) 
    @JoinColumn(name="candidate_id", nullable=false, updatable=false)
	private Candidate user;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobUrl() {
		return jobUrl;
	}
	public void setJobUrl(String jobUrl) {
		this.jobUrl = jobUrl;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Candidate getUser() {
		return user;
	}
	public void setUser(Candidate user) {
		this.user = user;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	
}
