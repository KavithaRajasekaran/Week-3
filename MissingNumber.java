package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numb= {3,8,10,7,6,4,1,5,2};
		
		Set<Integer> newset = new TreeSet<Integer>();
		
		for (int i = 0; i < numb.length; i++) 
		{
			newset.add(numb[i]);
		}
		
		System.out.println(newset);
		
		
		List<Integer> listarray = new ArrayList<Integer>();
		listarray.addAll(newset);
		//System.out.println(listarray);
				
		for (int i = 1; i <= listarray.size(); i++) 
		{
			if(i == (listarray.get(i-1)))
			{
				//System.out.println("inside if");
			}
			else
			{
				System.out.println("missing vaue is " +i);
				break;
			}
		}
		
	//	System.out.println(listarray.get(2));
		
		
		
		
	}

}
