package collection;
import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String args[])
	{
		int n,i,age;
		String name;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Employee> hashset=new TreeSet<Employee>();
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setName(name);
			emp[i].setAge(age);
			hashset.add(emp[i]);
		}
		for(Employee e:hashset)
			  System.out.println(e.getName()+" "+e.getAge());
		sc.close();
	}
}
class Employee implements Comparable<Employee>
{
	private String name;
	private int age;
	public String getName()
	{
		return name;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public  int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 1;
	}
	}
