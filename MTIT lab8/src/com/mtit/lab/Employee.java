package com.mtit.lab;

public class Employee {

	private String eid = "E001";
	String ename = "Anura";
	public String address = "Colombo";
	protected double salary = 60_000.00;
	public void setEid(String eid) {
	this.eid = eid;
	}
	public String getEid() {
	return eid;
	}
	void setEname(String ename) {
	this.ename = ename;
	}
	String getEname() {
	return ename;
	}
	protected void setAddress(String address) {
	this.address = address;
	}
	protected String getAddress() {
	return address;
	}
	private void setSalary(double salary) {
	this.salary = salary;
	}
	private double getSalary() {
	return salary;
	}
	public String display(String eid, String ename, String address,
	double salary) {
	System.out.println("Method invoked successfully");
	return eid + ", " + ename + ", " + address + ", " + salary;
	}

}
