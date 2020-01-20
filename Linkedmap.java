package collection;
import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Linkedmap {
	public static void main(String args[])
	{
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		m.put("one",1);
		m.put("three",3);
		m.put("six",6);
		m.put("four",4);
		for(java.util.Map.Entry<String, Integer> entry:m.entrySet())
		{
			String key=entry.getKey();
			System.out.println(key+" "+m.get(key));
			
		}
		
	}

}
