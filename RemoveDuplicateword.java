package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateword {

	public static void main(String[] args) {
	
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] strArray=text.split(" ");
				
		Set<String> newset = new LinkedHashSet<String>();
				
		for (int i = 0; i < strArray.length;i++) 
		{
			newset.add(strArray[i]);
		}
		
		
		System.out.println(newset);
		
		}

}
