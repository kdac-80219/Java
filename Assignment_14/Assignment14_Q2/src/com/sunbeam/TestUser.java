package com.sunbeam;
import java.sql.SQLException;
import java.util.*;
public class TestUser {

	public static void main(String[] args)  {
		Users u = new Users();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		do 
		{
			System.out.println("---------------------------------------");
			System.out.println("0.EXIT");
			System.out.println("1.ADD USER");
			System.out.println("2.DELETE USER");
			System.out.println("3.UPDATE USER");
			System.out.println("4.DISPLAY ALL USERS");
			System.out.println("---------------------------------------");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
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
				break;
			
			case 2: 
				try(UserDao dao2 = new UserDao())
				{
					System.out.println("Enter ID to delete = ");
					int id = sc.nextInt();
					Users u1 = new Users(id);
					int cnt = dao2.deleteUser(u1);
					System.out.println("Rows deleted = "+cnt);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 3:
				try(UserDao dao3 = new UserDao())
				{
					System.out.println("Enter ID to Update = ");
					int id = sc.nextInt();
					System.out.println("Enter First name = ");
					String fname = sc.next();
					System.out.println("Enter Last Name = ");
					String lname = sc.next();
					System.out.println("Enter Password = ");
					String passwd = sc.next();
					

					Users u2 = new Users( id,fname,lname,"",passwd,"",false,"");
					int cnt = dao3.updateUser(u2);
					System.out.println("Row Updated = "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
					break;
					
			case 4: 

				try (UserDao dao3 = new UserDao())
				{
					List<Users>list = dao3.displayUser();
					list.forEach(e->System.out.println(e));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
					break;
			case 0: System.out.println("Exit!!!!");
			 		break;
			default:System.out.println("Wrong choice!!!");
			  		break;
			
			}
		}while(choice!=0);
		
		System.out.println("Thank You!!!!");
		
	}

}
