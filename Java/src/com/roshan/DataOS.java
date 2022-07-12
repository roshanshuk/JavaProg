package com.roshan;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOS {
   public static void main(String...s)throws IOException
   {
	   FileOutputStream file = new FileOutputStream("abc.txt");
	   DataOutputStream dout = new DataOutputStream(file);
	   dout.writeInt(97);
	   dout.flush();
	   dout.close();
	   System.out.println("file....Success");
			   
   }
}
