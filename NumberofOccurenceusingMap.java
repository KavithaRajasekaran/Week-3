package week3.day2.assignments;

import java.util.Map;
import java.util.TreeMap;


public class NumberofOccurenceusingMap {

	public static void main(String[] args) {
		
		int[] numb={2,3,5,6,3,2,1,4,2,1,6,-1};
		int count=1;
		
		Map<Integer, Integer> newmap = new TreeMap<Integer, Integer>();
			
		for (int i = 0; i < numb.length; i++) 
		{
			if(newmap.containsKey(numb[i]))
			{
				count = newmap.get(numb[i]);
				newmap.put(numb[i],count+1);
			}
			else
			{
				newmap.put(numb[i],count);
			}
			
		}
		
		System.out.println(newmap);

	}

}
