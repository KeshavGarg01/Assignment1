package com.foxmula.assignment3;
import java.util.*;


class UserDefinedException extends Exception{
	UserDefinedException(String s){
	super(s);
	}
}

public class CustomExceptionQ2 {

	static void fn(int n) throws UserDefinedException{
		int b=0;
		for(int i=1;i<=(n);i++)
		{
			if(n%i==0)
				b++;
		}
		
		if(b==2 && n%2==1)
		{
			throw new UserDefinedException("Invalid Number"); 
		}
		else
		{
			System.out.println("No exception found");
		}
	}
	
	public static void main(String args[])
	{
		try {
			
			fn(3);
			fn(6);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
