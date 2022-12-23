package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
	
		String text = "kavitha rajasekaran";
		
		char[] charArray = text.toCharArray();
		
		Set<Character> newset = new HashSet<Character>();
				
		for (int i = 0; i < charArray.length;i++) 
		{
			newset.add(charArray[i]);
		}
		
		System.out.println("The unique characters in the string is " +newset);
		
		}

}
