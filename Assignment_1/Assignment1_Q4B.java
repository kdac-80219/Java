import java.util.Scanner;
public class Assignment1_Q4B {

	public static void main(String[] args) {
		
		int size,i,j,k,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size = ");
		size = sc.nextInt();
		

		
		for(i=size ; i>0 ; i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=i-1;k<size;k++)
			{
				System.out.print("*");
			}
			
			for(l=size-1;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1 ; i<size ; i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=i-1;k<size-1;k++)
			{
				System.out.print("*");
			}
			
			for(l=size-2;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
