package collection;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class TreeMapExample3 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String,Integer> sa=new TreeMap<String,Integer>();
		int n=Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++)
		{
			String st=bf.readLine();
			int k=Integer.parseInt(bf.readLine());
			sa.put(st,k);
		}
		System.out.println(sa);		
	}
}




