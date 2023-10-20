package com.sunbeam;
import java.util.*;

interface Arithmetic{
	double calc(double d1,double d2);
	
}
public class TestArithemeticLambda {

	static void calculate(double num1, double num2, Arithmetic op) 
	{
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	}
	

	public static void main(String[] args) {
		
		int choice;
		double num1,num2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------------------");
			System.out.println("0. EXIT");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("-----------------------------");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("Enter Number 1 = ");
					 num1 = sc.nextDouble();
					 System.out.println("Enter Number 1 = ");
					 num2 = sc.nextDouble();
					 calculate(num1, num2,(x,y)->x+y);
					 break;
			case 2 : System.out.println("Enter Number 1 = ");
			 		 num1 = sc.nextDouble();
			 		 System.out.println("Enter Number 1 = ");
			 		 num2 = sc.nextDouble();
			 		 calculate(num1, num2,(x,y)->x-y);
			 		 break;
			case 3:  System.out.println("Enter Number 1 = ");
			 		 num1 = sc.nextDouble();
			 		 System.out.println("Enter Number 1 = ");
			 		 num2 = sc.nextDouble();
			 		 calculate(num1, num2,(x,y)->x*y);
			 		 break;
			case 4:  System.out.println("Enter Number 1 = ");
			 		 num1 = sc.nextDouble();
			 		 System.out.println("Enter Number 1 = ");
			 		 num2 = sc.nextDouble();
			 		 calculate(num1, num2,(x,y)->x/y);
			 		 break;
			case 0:  System.out.println("EXIT!!!!");
			  		 break;
			default : System.out.println("Wrong Choice!!!");
			          break;
			}
		}while(choice!=0);
		
		System.out.println("Thank You :)");
		
	}


	
	

}
