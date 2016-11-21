package com.example;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Emp {
	
	@EmbeddedId
	private User user;
	
	public Emp() {
	}

	public Emp(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
