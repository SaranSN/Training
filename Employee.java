package com.cg.inheritance;

public class Employee {
	private int employeeId;
	private String name;
	private int basicSalary,totalSalary;
	public Employee(int employeeId, String name, int basicSalary, int totalSalary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
		this.totalSalary = totalSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}
	