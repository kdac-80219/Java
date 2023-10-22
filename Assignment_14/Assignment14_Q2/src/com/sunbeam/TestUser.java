package com.sunbeam;

public class TestUser {

	public static void main(String[] args) {
		Users u = new Users();
		
		try(UserDao dao = new UserDao())
		{
			u.accept();
			int cnt = dao.addUser(u);
			System.out.println("Rows Inserted = "+cnt);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
