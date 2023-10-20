package com.sunbeam;

public class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;
	
	
	public Manager() {
		super();
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		double TotalSal = this.basicSalary+this.dearanceAllowance;
		return TotalSal;
	}
	public double calcIncentives()
	{
		double totalIncentives = this.basicSalary*0.20;
		return totalIncentives;
	}

	@Override
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", dearanceAllowance=" + dearanceAllowance + "]";
	}
	
		
}
