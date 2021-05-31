package com.foxmula.assignment2;
import java.util.*;
public class Q5andQ6 {
	
	private static double k=0;
	public static void main(String args[])
	{
		ArrayListQ1 obj = new ArrayListQ1();
		for(int i=0;i<10;i++)
		{
			obj.l1.add(Math.random());
			obj.l1.add(29.0);
		}
		
		Map<Double, Integer> hm = new HashMap<Double, Integer>();
		  
        for (Double i : obj.l1) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
  
        for (Map.Entry<Double, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        }
        
        
        System.out.println("************FINDING PAIRS*********");
        
        Scanner sc=new Scanner(System.in);
        k= sc.nextDouble();
        for (int x=0;x<obj.l1.size();x++) {

        	for (int y=x+1;y<obj.l1.size();y++)
        	{
        		if(k==( obj.l1.get(x)+ obj.l1.get(y)))
        			System.out.println("Required pair is: "+ "[" + obj.l1.get(x) + "," + obj.l1.get(y) +"]");
        	}
        		
        }
  
        
        
        
	}

}
