package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
}
