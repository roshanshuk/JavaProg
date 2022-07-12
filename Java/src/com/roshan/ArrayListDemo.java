package com.roshan;

import java.util.*;

public class ArrayListDemo {
	public static void main(String args[])
	{
	ArrayList al = new ArrayList();
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(40);
    ArrayList al2 = new ArrayList();
    al2.add(60);
    al2.add(70);
    al2.add(80);
    System.out.println(al.remove(3));
    al2.addAll(al);
    System.out.println(al2);
}
}
