package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table
@IdClass(User.class)
public class Emp {
	
	@Id
	@GeneratedValue
	private Long empno;
	
	private String ename;
	
}
