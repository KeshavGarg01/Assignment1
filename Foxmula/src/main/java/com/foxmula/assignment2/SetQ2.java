package com.foxmula.assignment2;
import java.util.*;
public class SetQ2 {
	
	protected static  Set <Double> s1 = new HashSet<>();
	private static  String ifExist(double x)
	{
		return (s1.contains(x)? "YES" : "NO");
	}

	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			s1.add(Math.random());
		}
		s1.add(10.0);
		
		System.out.println(ifExist(Math.random()));
		System.out.println(ifExist(10));

	}
	
}
