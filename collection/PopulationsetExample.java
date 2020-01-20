package collection;
import java.util.*;
public class PopulationsetExample {
	public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);
		HashSet aa=new HashSet();
		System.out.println("Popular cities :"+aa.isEmpty());
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			String as=s.next();
			aa.add(as);
		}
		
		
		System.out.println("Number of cities in the HashSet:"+n);
	}

}
