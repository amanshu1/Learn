package com.mysql.marksheet;

public class MarksheetBean {
	public int id;
	public String rollNo;
	public String name;
	public int p;
	public int c;
	public int m;
	
	public MarksheetBean() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
}
