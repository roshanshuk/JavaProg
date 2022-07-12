package com.roshan;
import java.io.*;
public class ThrowExcep3 
{
	public static void FindFile()throws IOException
	{
		throw new IOException("File not found");
	}
	public static void main(String...s)
	{
		try
		{
	        FindFile();
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println("Exception caught...");
		}
	}

}
