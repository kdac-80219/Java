package com.sunbeam;

public class TestException {

	public static void main(String[] args) {

		ExceptionLineTooLong ex = new ExceptionLineTooLong();
		
		try
		{
			ex.setMessage("Hiiii,I am Vinayak Shipekar.I am from Kolhapur.Currently studying in Sunbeam Infotech Karad");
			//ex.setMessage("Hiiii,I am Vinayak Shipekar.I am from Kolhapur.");

			ex.calculateStringLength();

		}
        catch(ExceptionLineTooLong e)
        {
            e.printStackTrace();	
        }
		
		System.out.println(ex);
	}

}
