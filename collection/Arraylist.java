package collection;
import java.util.*;
public class Arraylist {
	public static void main(String[]args)
	{
		ArrayList aa=new ArrayList();
		aa.add(5);
		aa.add(21);
		aa.add(12);
		aa.add(4);
		aa.add(3);
		HashSet bb=new HashSet();
		bb.addAll(aa);
		System.out.println(bb);
	}
}
