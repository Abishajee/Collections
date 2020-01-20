package collection;
import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String args[])
	{
		TreeMap<Integer,String> m=new TreeMap<Integer,String>();
		m.put(1, "Amit");
		m.put(5,"Rhul");
		m.put(2,"Jai");
		m.put(6,"Amit");
		for(java.util.Map.Entry<Integer, String> entry:m.entrySet())
		{
			Integer key=entry.getKey();
			System.out.println(key+" "+m.get(key
					));
			
		}
		
	}

}
