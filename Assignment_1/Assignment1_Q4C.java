import java.util.Scanner;
public class Assignment1_Q4C {

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

		
	}

}
