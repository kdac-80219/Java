package com.sunbeam;

public class Labor implements Emp{
	private int hours;
	private double rate;
	private double totalSal;
	public Labor() {
		super();
	}

	public Labor(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Labor [hours=" + hours + ", rate=" + rate + "]";
	}

	@Override
	public double getSal() {
		 totalSal = this.hours * this.rate;
		return  totalSal;
	}
	
	public double calcIncentives()
	{
		if(this.hours>300)
		{
			double totalIncentives = this.totalSal*0.05;
			return totalIncentives;
		}
		else
			return 0.0;
		
	}

	
	
}
