package Test1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		
		String str = "GoodMoringwelcome";
		
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		
		for (int i=0; i< str.length();i++) {
			
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i)) +1);
			}
			else {
			hm.put(str.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> obj : hm.entrySet()) {
			if (obj.getValue() >1) {
				System.out.println("first non repeating Char::" + obj.getKey());
				break;
			}
		}
	}

}
