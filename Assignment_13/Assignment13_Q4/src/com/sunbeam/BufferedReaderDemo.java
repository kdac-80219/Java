package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedReaderDemo {

Scanner sc = new Scanner(System.in);
	

	static void writeIntoFile ()
	{
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter("Temp1.txt"))
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
	
	
	static void readFromFile ()
	{
		Scanner sc = new Scanner(System.in);
		try(FileReader fr = new FileReader("Temp1.txt"))
		{
			try(BufferedReader br = new BufferedReader(fr))
			{	
				String str="";
				while((str = br.readLine())!=null)
				{
					br.readLine();
				}
			}
		}
		catch(EOFException ef)
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		
		writeIntoFile();
		readFromFile();

	}

}
