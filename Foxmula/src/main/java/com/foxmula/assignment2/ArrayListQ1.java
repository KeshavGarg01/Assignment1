package com.foxmula.assignment2;
import java.util.ArrayList;
public class ArrayListQ1 {
	
protected static ArrayList <Double> l1= new ArrayList<>();
private static String ifExist(double x)
{
	return (l1.contains(x)? "YES" : "NO");
}

public static void main(String args[])
{
	for(int i=0;i<5;i++)
	{
		l1.add(Math.random());
	}
	l1.add(10.0);
	
	System.out.println(ifExist(Math.random()));
	System.out.println(ifExist(10));

	
}
}
