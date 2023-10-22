package com.sunbeam;
import java.sql.SQLException;
import java.util.*;
public class TestDemo {

	public static void main(String[] args)
	{
		int choice;
		
		Scanner sc = new Scanner(System.in);
		Candidate c = new Candidate();
		
		
		do 
		{
			System.out.println("---------------------------------------");
			System.out.println("0.EXIT");
			System.out.println("1.ADD CANDIDATE");
			System.out.println("2.UPDATE CANDIDATE");
			System.out.println("3.GET PARTY WISE TOTAL VOTES");
			System.out.println("---------------------------------------");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				c.accept();
				try (CandidateDao dao = new CandidateDao())
				{
					int cnt = dao.saveCandidate(c);
					System.out.println("Row added:"+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			
			case 2: 
				try(CandidateDao dao = new CandidateDao())
				{
					System.out.println("Enter ID to Update = ");
					int id = sc.nextInt();
					System.out.println("Enter Name = ");
					String name = sc.next();
					System.out.println("Enter Party = ");
					String party = sc.next();
					
					Candidate cd = new Candidate(id,name,party,0);
					int cnt = dao.updateCandidate(cd);
					System.out.println(cd);
					System.out.println("Row updated = "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 3:
					try(CandidateDao dao = new CandidateDao() )
					{
						List<PartyVotes>list = dao.getPartyWisevotes();
						list.forEach(ele->System.out.println(ele));
						
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

