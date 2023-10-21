import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.*;
public class BufferedTest {
	
	Scanner sc = new Scanner(System.in);
	

	static void writeIntoFile ()
	{
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter("Temp.txt"))
		{
			try(BufferedWriter bw = new BufferedWriter(fw))
			{
				for(int i=0;i<4;i++)
				{
					System.out.println("Enter a line = ");
					String line;
					line =sc.nextLine();
					bw.write(line);
					bw.newLine();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args)
	{
		writeIntoFile();
	}

	
}
