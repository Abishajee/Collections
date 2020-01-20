package collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
public class ContaisKeyValue {
			public static void main(String args[])
			{
				HashMap<Integer,String> m=new HashMap<Integer,String>();
				m.put(1, "Amit");
				m.put(5,"Rhul");
				m.put(2,"Jai");
				m.put(6,"Amit");
				System.out.println(m);
				System.out.println(m.containsKey(2));
				System.out.println(m.containsValue("Amit"));
				System.out.println("Is the key '5' present? :"+m.containsKey(5));
				
			}
}


