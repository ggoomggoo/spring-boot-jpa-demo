package com.example;

import java.io.Serializable;

import javax.persistence.Column;

public class User implements Serializable{
	
	@Column
	private Long empno;
	
	@Column
	private String ename;

}
