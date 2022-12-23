package week3.day2.assignments;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class FindMostDuplicateCharUsingMap {

	public static void main(String[] args) {
		
		String strarray="zabbabazzz";
		char[] charArray = strarray.toCharArray();
		
		int count=1;
		
		Map<Character, Integer> newmap = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) 
		{
			if(newmap.containsKey(charArray[i]))
			{
				count = newmap.get(charArray[i]);
				newmap.put(charArray[i],count+1);
			}
			else
			{
				newmap.put(charArray[i],count);
			}
			
		}
		
		System.out.println(newmap);
		
		Set<Entry<Character,Integer>> entrySet = newmap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) 
		{
			Integer maxvalue = Collections.max(newmap.values());
			if(entry.getValue()==maxvalue)
			{
				System.out.println("The maximum character that was repeated is " +entry.getKey());
			}
		}
		
	}

}
