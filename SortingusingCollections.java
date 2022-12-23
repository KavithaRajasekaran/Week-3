package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollections {

	public static void main(String[] args) {
		
		String[] strarray= {"HCL","Wipro","Aspire Systems","CTS"};
		
		System.out.println(strarray.length);
		
		List<String> listarray = new ArrayList<String>();
		
		for (int i = 0; i < strarray.length; i++) 
		{
			listarray.add(strarray[i]);
		}
		
		Collections.sort(listarray);
		System.out.println("The items in ascending order is " + listarray);
		
		Collections.sort(listarray, Collections.reverseOrder());;
		System.out.println("The items in descending order is " + listarray);

	}

}
