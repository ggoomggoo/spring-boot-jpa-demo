package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue
	private Long empno;
	
//	@Column
	private String ename;
	
	

	public Long getEmpno() {
		return empno;
	}

	public Emp setEmpno(Long empno) {
		this.empno = empno;
		return this;
	}

	public String getEname() {
		return ename;
	}

	public Emp setEname(String ename) {
		this.ename = ename;
		return this;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}

}
