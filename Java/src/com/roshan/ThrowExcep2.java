package com.roshan;
import java.io.*;

public class ThrowExcep2 {
	static void show()throws FileNotFoundException
	{
	    FileReader fr = new FileReader("abc.txt");
	    throw new FileNotFoundException();
	}
	public static void main(String...s)
	{
		try {
			show();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code....");
	}

}
