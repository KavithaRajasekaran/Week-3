package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
	
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				
		Set<Integer> newset = new TreeSet<Integer> ();
				
		for (int i = 0; i < data.length; i++) 
		{
			newset.add(data[i]);
		}
		int size = newset.size();
		//System.out.println("The set size is " +size);
		System.out.println(newset);
		
		List<Integer> listarr = new ArrayList<Integer>();
		
		listarr.addAll(newset);
						
		//Printing the second largest from the array list. The largest would be size-1 and second largest would be size-2
		System.out.println(listarr.get(size-2));
		
	}

}
