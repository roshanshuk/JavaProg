package com.roshan;

public class ThrowExcep {
	static void show()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception caught inside show");
			throw e;
		}
	}
	public static void main(String...s)
	{
		try
		{
			show();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main");
		}
	}

}
