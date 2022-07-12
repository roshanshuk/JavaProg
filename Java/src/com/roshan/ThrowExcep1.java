package com.roshan;

public class ThrowExcep1 
{
	static void validate(int age)
	{
		if(age < 18)
		{
			try {
			    throw new ArithmeticException("Person is not elligible to vote");
		         }
		         catch(ArithmeticException e)
			     {
			       System.out.println(e);
			     } 
		}
		else
		{
			System.out.println("Person is elligible for vote");
		}
	}
	public static void main(String...s)
	{
		validate(13);
		System.out.println("rest of code....");
	}

}
