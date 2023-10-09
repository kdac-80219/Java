package com.sunbeam;
import java.util.*;

class CarDrive
{
	Scanner sc = new Scanner(System.in);
	private double total_miles;
	private double gasoline_cost;
	private double avrgMilesPerGallon;
	private double parkingFees;
	private double tolls;
	
	public CarDrive()
	{
	   
	}
	public CarDrive(double total_miles,double gasoline_cost,double avrgMilesPerGallon,double parkingFees,double tolls)
	{
		this.total_miles=total_miles;
		this.gasoline_cost=gasoline_cost;
		this.avrgMilesPerGallon=avrgMilesPerGallon;
		this.parkingFees=parkingFees;
		this.tolls=tolls;
	}
	public double getTotal_miles() {
		return total_miles;
	}
	public void setTotal_miles(double total_miles) {
		this.total_miles = total_miles;
	}
	public double getGasoline_cost() {
		return gasoline_cost;
	}
	public void setGasoline_cost(double gasoline_cost) {
		this.gasoline_cost = gasoline_cost;
	}
	public double getAvrgMilesPerGallon() {
		return avrgMilesPerGallon;
	}
	public void setAvrgMilesPerGallon(double avrgMilesPerGallon) {
		this.avrgMilesPerGallon = avrgMilesPerGallon;
	}
	public double getParkingFees() {
		return parkingFees;
	}
	public void setParkingFees(double parkingFees) {
		this.parkingFees = parkingFees;
	}
	public double getTolls() {
		return tolls;
	}
	public void setTolls(double tolls) {
		this.tolls = tolls;
	}
	
	public void acceptData()
	{
		System.out.println("Enter Total Miles = ");
		this.total_miles = sc.nextDouble();
		System.out.println("Enter Gasoline Cost = ");
		this.gasoline_cost = sc.nextDouble();
		System.out.println("Enter Average Miles Per Gallon = ");
		this.avrgMilesPerGallon = sc.nextDouble();
		System.out.println("Enter Parking Fees = ");
		this.parkingFees = sc.nextDouble();
		System.out.println("Enter Toll per day = ");
		this.tolls = sc.nextDouble();
		
	}
	public void totalCost()
	{
		double NoOfGallons = this.total_miles/this.avrgMilesPerGallon;
		System.out.println("Cost of Gallon Of Gassoline per day = "+NoOfGallons*this.gasoline_cost);
		System.out.println("Parking Fees per day = "+this.parkingFees);
		System.out.println("Toll per day = "+this.tolls);
		System.out.println("Total Cost per day = "+(NoOfGallons*this.gasoline_cost+this.parkingFees+this.tolls));
	}
}

public class DrivingCost {

	public static void main(String[] args) {
		
		
		CarDrive cd = new CarDrive();
		cd.acceptData();
		cd.totalCost();
	}

}
