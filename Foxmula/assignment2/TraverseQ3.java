package com.foxmula.assignment2;
import java.util.*;
public class TraverseQ3 {
	public static void main(String args[])
	
	{
		SetQ2 obj = new SetQ2();
		for(int i=0;i<5;i++)
		{
			obj.s1.add(Math.random());
		}
		Iterator<Double> i = obj.s1.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
		
		//travresing TreeSet
		
		System.out.println("TressSetQ4 traversing");
		
		TreeSetQ4 obj2=new TreeSetQ4();
		for(int k=0;k<5;k++)
		{
			obj2.t1.add(Math.random());
		}
		Iterator<Double> j = obj2.t1.iterator();
		while (j.hasNext())
			System.out.println(j.next());
		
	}
	

}
