package com.app.geometry;
import java.util.*;
import java.lang.Math;
public class Point2D {

	public int x;
	public int y;
	public double distance;
	
	public Point2D()
	{
		this.x=0;
		this.y=0;
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
	

	public String getString()
	{
		String xy;
		return xy = "(" + Integer.toString(x)+","+Integer.toString(y)+")";
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
	
	public double calculateDistance(Point2D p1,Point2D p2)
	{
		double d1,d2;
		d1 = p2.x - p1.x;
		d2 = p2.y - p1.y;
		
		distance = Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2) );
		return distance;
		
	}
	 
	
	
}
