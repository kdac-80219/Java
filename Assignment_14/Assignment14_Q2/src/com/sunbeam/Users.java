package com.sunbeam;

import java.util.Date;
import java.util.*;

public class Users {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String passwd;
	private String dob;
	private boolean status;
	private String role;
	
	public Users() {
		super();
	}
	public Users(int id) {
		this.id = id;
	}
	public Users(int id, String firstName, String lastName, String email, String passwd, String dob, boolean status,
			String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passwd = passwd;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter First Name =");
		this.firstName = sc.next();
		System.out.println("Enter Last Name =");
		this.lastName = sc.next();
		System.out.println("Enter Email = ");
		this.email = sc.next();
		System.out.println("Enter password = ");
		this.passwd = sc.next();
		System.out.println("Enter DOB = ");
		this.dob = sc.next();
//		System.out.println("Enter Status = ");
//		this.status = sc.nextBoolean();
		System.out.println("Enter role = ");
		this.role = sc.next();
		
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", passwd=" + passwd + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	
}
