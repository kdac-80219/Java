import java.util.*;
public class Assignment1_Q3 {
	
	 Scanner s = new Scanner(System.in);
	 int foodMenu()
	{ 
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Dosa");
		System.out.println("2. Idli");
		System.out.println("3. Vadapav");
		System.out.println("4. Bhel");
		System.out.println("5. Generate Bill");
		System.out.println("Enter Choice = ");
		choice = s.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		
		Assignment1_Q3 obj = new Assignment1_Q3();
		
		int choice,bill=0,count=0;
		Scanner sc = new Scanner(System.in);
		
		
		while((choice=obj.foodMenu())!=0)
		{
			
			switch(choice)
			{
			 case 1 : System.out.println("Enter count of Dosa : ");
			 		  count = sc.nextInt();
			 		  bill = bill + 30*count;
			 		  System.out.println("Dosa Bill = "+bill);
			 		  break;
			 		  
			 case 2 :System.out.println("Enter count of Idli : ");
	 		  		 count = sc.nextInt();
	 		         bill = bill + 20*count;
	 		         System.out.println("Idli Bill = "+bill);
	 		         break;
	 		         
			 case 3: System.out.println("Enter count of Vadapav : ");
		  		 	 count = sc.nextInt();
		  		 	 bill = bill + 10*count;
		  		 	 System.out.println("Vadapav Bill = "+bill);
		  		 	 break;
		  		 	 
			 case 4: System.out.println("Enter count of Bhel : ");
  		 	 		 count = sc.nextInt();
  		 	         bill = bill + 40*count;
  		 	         System.out.println("Bhel Bill = "+bill);
  		 	         break;
  		 	         
			 case 5: System.out.println("Total Bill = "+bill);
			 		 break;
			 		
			}
		}
		
		System.out.println("Thank You!!!!");
		
		

	}

}
