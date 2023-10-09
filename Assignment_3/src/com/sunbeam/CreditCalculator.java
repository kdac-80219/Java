package com.sunbeam;
import java.util.*;
class Customer
{
	Scanner sc = new Scanner(System.in);
	private int accountNo;
	private int balance;
	private int charges;
	private int credits;
	private int creditLimit;
	
	public Customer()
	{
		
	}
	public Customer(int accno,int balance,int charges,int credits,int creditLimit)
	{
		this.accountNo=accno;
		this.balance=balance;
		this.charges=charges;
		this.credits=credits;
		this.creditLimit=creditLimit;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void acceptData()
	{
		System.out.print("Enter Account Number = ");
		this.accountNo = sc.nextInt();
		System.out.print("Enter Balance = ");
		this.balance = sc.nextInt();
		System.out.print("Enter Charges = ");
		this.charges = sc.nextInt();
		System.out.print("Enter Credits = ");
		this.credits = sc.nextInt();
		System.out.print("Enter credit Limit = ");
		this.creditLimit = sc.nextInt();

	}

	public int creditAmount(int amt)
	{
		this.balance = this.balance+amt;
		return this.balance;
	}
	public int debitAmount(int amt)
	{
		this.balance = this.balance-amt;
		return this.balance;
	}
	public  int newBalance(int balance)
	{
		int newBalance = this.balance+this.charges-this.credits;
		return newBalance;
	}
	
	public void limitStatus()
	{
		int newBalance ;
		newBalance = newBalance(this.balance);
		if(newBalance>this.creditLimit)
		{
			System.out.println("Balance = "+newBalance);
			System.out.println("Credit limit exceeded");
		}
		else
		{
			System.out.println("Balance = "+newBalance);
			System.out.println("Credit limit not exceeded");
		}
			
	}
	
}
public class CreditCalculator {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.acceptData();
		c1.limitStatus();
		

	}

}
