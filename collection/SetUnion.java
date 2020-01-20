package collection;
import java.util.*;
public class SetUnion {
	public static void main(String args[])
	{
		Set<Integer> aa=new HashSet<Integer>();
		aa.add(new Integer(1));
		aa.add(new Integer(2));
		aa.add(new Integer(3));
		aa.add(new Integer(4));
        System.out.println("Set1 :"+aa);
        Set<Integer> bb=new HashSet<Integer>();
        bb.add(new Integer(2));
        bb.add(new Integer(7));
        bb.add(new Integer(9));
        bb.add(new Integer(3));
        System.out.println("Set2 :"+bb);
        Set<Integer> union=new HashSet<Integer>(aa);
        union.addAll(bb);
        System.out.println("Union :"+union);
        Set<Integer> inters=new HashSet<Integer>(aa);
        inters.retainAll(bb);
        System.out.println("Intersection :"+inters);
        Set<Integer> sd=new HashSet<Integer>(aa);
        sd.removeAll(bb);
        System.out.println("Symmetric difference :"+sd);
	}
}
