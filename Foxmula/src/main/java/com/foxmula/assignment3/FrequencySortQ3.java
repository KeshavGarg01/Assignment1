package com.foxmula.assignment3;
import java.util.*;

public class FrequencySortQ3 {
	
	static void Fn(int arr[])
	{
		int size=arr.length;
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		List<Integer> l1=new ArrayList<>();
		for(int x: arr)
			l1.add(x);
		for (int i=0;i<size;i++) 
		{
			if (freqMap.containsKey(arr[i])) 
			{
				// If number is present in freqMap,incrementing it's count by 1	
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
			}
				
			else 
			{
				// If integer is not present in freqMap, putting this integer to freqMap with 1 as it's value
				freqMap.put(arr[i], 1);
			}
		}
		
		Collections.sort(l1, (n1, n2) -> {
		      int freq1 = freqMap.get(n1);
		      int freq2 = freqMap.get(n2);

		      if (freq1 != freq2) {
		        return freq1 - freq2;
		      }

		      return n1 - n2;
		    });
		
		System.out.println(l1);
		
	}
	
	public static void main(String args[])
	{
		int arr[]= {5,6,7,3,5,6,7,3,6,7,6,3,5,6,3,6,6,6,6,3,3,54,67,23,0,87,5};
		Fn(arr);
	}

}
