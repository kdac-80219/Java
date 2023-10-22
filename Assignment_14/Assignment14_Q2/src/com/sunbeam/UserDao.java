package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UserDao implements AutoCloseable{
	
	private Connection con;
	public UserDao() throws SQLException
	{
		con = DbUtil2.getConnection();
	}
	@Override
	public void close() throws Exception {

		try
		{
			if(con!=null)
			{
				con.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(str);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	//Add new user
	
	public int addUser(Users u) throws SQLException
	{
		String sql = "INSERT INTO users values(default,?,?,?,?,?,false,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setString(1,u.getFirstName());
			stmt.setString(2,u.getLastName());
			stmt.setString(3,u.getEmail());
			stmt.setString(4,u.getPasswd());
			String str = u.getDob();
			Date utilDate = parseDate(str);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5,sqlDate);
			stmt.setString(6,u.getRole());
			int cnt = stmt.executeUpdate();
			System.out.println("Row inserted = "+cnt);
			return cnt;
		}

	}
	
	//delete user
	
	public int deleteUser(Users u) throws SQLException
	{
		String sql = "DELETE FROM users WHERE id =?";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setInt(1, u.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	
	}
	
	public int updateUser(Users u) throws SQLException
	{
		String sql = "UPDATE users SET first_name=?,last_name=?,password=? WHERE id =?";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setString(1,u.getFirstName());
			stmt.setString(2,u.getLastName());
			stmt.setString(3,u.getPasswd());
			stmt.setInt(4,u.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public List<Users> displayUser() throws SQLException
	{
		List<Users>list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			try(ResultSet rs = stmt.executeQuery())
			{
				while(rs.next())
				{
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					String dob = rs.getString("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					Users us = new Users(id,fname,lname,email,password,dob,status,role);
					list.add(us);
				}
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
}
