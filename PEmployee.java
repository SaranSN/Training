package com.cg.inheritance;

public class PEmployee {
	private int hra,ta,da;
	public PEmployee() {
		super();	
	}
	public PEmployee(int employeeId,String name,int basicSalary)
	{
		super(employeeId,name,basicSalary);
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	
