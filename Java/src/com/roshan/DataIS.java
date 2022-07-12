package com.roshan;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataIS {
    public static void main(String...s) throws Exception
    {
      FileInputStream file = new FileInputStream("abc.txt");
      DataInputStream dis = new DataInputStream(file);
      int count = file.available();
      byte[] any = new byte[count];
      dis.read(any);
      for (byte bt:any)
      {
    	  char c = (char)bt;
    	  System.out.println(c);
      }
      
    }
}
