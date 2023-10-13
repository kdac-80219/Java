package com.sunbeam;
import java.util.*;
public class Circle {

	private int xPoint;
	private int yPoint;
	private double diameter;
	Scanner sc = new Scanner(System.in);
	
	public Circle() {
		this.xPoint = 0;
		this.yPoint = 0;
		this.diameter = 0;
	}
	
	public Circle(int xPoint, int yPoint, double diameter) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		
		if(diameter<0)
		{
			throw new UserDefinedException("Diameter can not be negative!!!!");
		}
		this.diameter = diameter;
	}
	public int getxPoint() {
		return xPoint;
	}
	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}
	public int getyPoint() {
		return yPoint;
	}
	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) 
	{
		if(diameter<0)
		{
			throw new UserDefinedException("Diameter can not be negative!!!!");
		}
		this.diameter = diameter;
	}
	public void acceptCircle()
	{
		System.out.println("Enter X-Point = ");
		this.xPoint = sc.nextInt();
		System.out.println("Enter Y-Point = ");
		this.yPoint = sc.nextInt();
		System.out.println("Enter Diameter = ");
		this.diameter = sc.nextDouble();
		if(diameter<0)
		{
			throw new UserDefinedException("Diameter can not be negative!!!!");
		}

	}

	@Override
	public String toString() {
		return "Circle [xPoint=" + xPoint + ", yPoint=" + yPoint + ", diameter=" + diameter + "]";
	}
	
	
}
