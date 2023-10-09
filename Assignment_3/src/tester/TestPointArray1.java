package tester;
import java.util.*;
import java.math.*;
import com.sunbeam.Point2D;


public class TestPointArray1 {

	public static int menu()
	{
		Scanner sc2 = new Scanner(System.in);
		int choice;
		System.out.println("0 . EXIT");
		System.out.println("1 . Display details of a specific points");
		System.out.println("2 . Display X,Y Co-Ordinates of all points");
		System.out.println("3 . Is Points are equal?");
		System.out.println("Enter your choice = ");
		choice = sc2.nextInt();
		
		return choice;

	}
	public static void main(String[] args) 
	{
		
//		Point2D p1 = new Point2D();
//		p1.acceptpoints();
//		
//		Point2D p2 = new Point2D();
//		p2.acceptpoints();
//		
//		p1.getPoints(1,2);
//		p2.getPoints(10,20);
//		
//		if(p1.isEqual(p1, p2))
//			System.out.println("Points are same!!!");
//		else
//			System.out.println("Points are not same!!");
		
		Point2D p1;
		Point2D points[]=new Point2D[4];
		points[0] = new Point2D();
		points[1] = new Point2D();
		points[2] = new Point2D();
		points[3] = new Point2D();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			points[i].acceptpoints();
		}
		
		 
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
					int index;
					System.out.println("Enter index =");
					index=sc.nextInt();
					if(index<=4)
					{
						points[index].displaypoint();
					}
					else
					{
						System.out.println("Invalid index , pls retry!!!!\n");
					}
					
					break;
					
			case 2: 
					for(int i=0;i<4;i++)
					{
						points[i].displaypoint();
					}
					break;
			
			case 3:int index1 ,index2;
				   double distance,d1,d2;
				   System.out.println("Enter Index1 : ");
				   index1 = sc.nextInt();
				   System.out.println("Enter Index2 : ");
				   index2 = sc.nextInt();
				   	if((points[index2].getX()==points[index1].getX())&& (points[index1].getY()==points[index2].getY()))
				   	{
				   		System.out.println("Points are at same location!!!\n");
				   	}
				   	else
				   	{
				   	   System.out.println("Points are at doifferent location!!!\n");
				   	   d1 =  points[index2].getX() -  points[index1].getX();
					   d2 =  points[index2].getY() - points[index1].getY();
					  
					   distance = Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2));
					   System.out.println("Distance = "+distance);
				   	}
				  
				   break;
		    default :
		    	System.out.println("Wrong choice!!");
		    	break;
					
			}
		}
		System.out.println("Thank You!!!  :)");

	}
		
		
	}


