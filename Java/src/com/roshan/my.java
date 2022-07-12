package com.roshan;

interface test1
{
	void show();
}
public class my 
{
  public static void main(String...s)
  {
	  int width = 12;
	  test1 t1= ()->{
		  System.out.println("Test " +width);
	  };
	  t1.show();
  }
}
