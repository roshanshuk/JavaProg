package com.roshan;
class StringBuf
{ 

	public static void main(String...ss)
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.insert(1,"java");
		System.out.println(sb);
	}

}
