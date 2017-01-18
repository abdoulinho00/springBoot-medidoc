package com.savoirfairelinux.springboottest.beans;

import java.util.Date;

public class Customer {

	private long id;
	private String name;
	private Date membershipDate;
	
	public Customer(){
		
	}
	
	public Customer(String name){
		this.setName(name);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(Date membershipDate) {
		this.membershipDate = membershipDate;
	}

}
