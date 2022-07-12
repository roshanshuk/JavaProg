package com.roshan;
import java.io.*;
class test2 
{
    public static void main(String args[])
    {
    	try
    	{
    		FileOutputStream fout = new FileOutputStream("abc.txt");
    		String s = "India is my country";
    		byte b[] = s.getBytes();
    		fout.write(b);
    		fout.close();
    		System.out.println("File created");
    		
    	}
    	catch(Exception e)
    	{
           System.out.println(e);
    	}
    }
}
