package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
	
		String text = "PayPal India";
	
		char[] charArray = text.toCharArray();
		
		Set<Character> charset = new LinkedHashSet<Character>();
		
		Set<Character> dupcharset = new LinkedHashSet<Character>();
				
		for (int i = 0; i < charArray.length;i++) 
		{
			if(!charset.contains(charArray[i]))
			{
			charset.add(charArray[i]);
			}
			/*else if(chararray[i]=='')
			{
			}*/
			else
			{
				dupcharset.add(charArray[i]);
			}
		}
		
		System.out.println(charset);
		System.out.println(dupcharset);
		
		}

}
