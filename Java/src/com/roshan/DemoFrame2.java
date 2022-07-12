package com.roshan;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoFrame2 extends Frame 
{ 
	DemoFrame2()
	{
		// addRegistration
		// closing logic by anonymouous class
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				//System.exit(0);
				dispose();
			}
		});
		setSize(300,400);
		setLayout(null);
		setVisible(true);
		setTitle("This is my Frame");
	}
	public static void main(String...s)
	{
		new DemoFrame2();
	}
}
