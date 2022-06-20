package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="std_tbl")
public class Student {
	@Id
	@Column(name="SNo")
	int sNo;
	@Column(name="SName",length =20)
	String sName;
	@Column(name="SAddr",length =20)
	String sAddr;
	@Column(name="SMarks")
	int sMarks;
	
	public Student() {
		super();
	}

	public Student(int sNo, String sName, String sAddr, int sMarks) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sAddr = sAddr;
		this.sMarks = sMarks;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddr() {
		return sAddr;
	}

	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAddr=" + sAddr + ", sMarks=" + sMarks + "]";
	}
	
	
	

}
