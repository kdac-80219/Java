package com.sunbeam;
import java.util.*;
import java.lang.Math;
public class Point2D {

	Scanner sc = new Scanner(System.in);
	public int x;
	public int y;
	public double distance;
	
	public Point2D()
	{
		
	}
	
	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public void getPoints(int x,int y)
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
	
	
	
	public boolean isEqual(Point2D p1,Point2D p2)
	{
		if ((p1.x==p2.x) && (p1.y==p2.y))
		{
			return true;
		}
		else
			return false;
	} 
	
//	public double calculateDistance(int points[], int points2[])
//	{
//		double d1,d2;
//		d1 = points.x - points.y;
//		d2 = points2.y - points.y;
//		
//		distance = Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2) );
//		return distance;	
//	}
	
	public void acceptpoints()
	{
		System.out.println("Enter X Co-ordinates = ");
		x = sc.nextInt();
		System.out.println("Enter Y Co-ordinates = ");
		y = sc.nextInt();
	}
	
	public void displaypoint()
	{
		System.out.print("X="+this.x+","+"Y="+this.y);
		System.out.println();
		System.out.println();

	}
	 
	
	
}