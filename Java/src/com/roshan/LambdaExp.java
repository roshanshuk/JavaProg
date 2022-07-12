package com.roshan;

interface test
{
	//public String show();
	//public String show(String name);
	int add(int a, int b);
}

public class LambdaExp {
	/* Lambda exp having no argument
 public static void main(String args[])
 {
	 test t = ()->{
		 return "I have nothing to say";
	 };
	 System.out.println(t.show());
 } */
	
	/* LambdaExp having single argument
	public static void main(String...s)
	{
		test t1 = (name)->{
			return "Hello "+name;
		};
		System.out.println(t1.show("Roshan "));
		
		test t2 = (name)->{
			return "Hello "+name;
		};
		System.out.println(t2.show("Saurabh "));
	}*/
	
	public static void main(String args[])
	{
		test t1 = (a,b)->(a+b);
		System.out.println(t1.add(50,60));
		
		test t2 = (int a,int b)->(a+b);
		System.out.println(t2.add(20,30));
	}
}
