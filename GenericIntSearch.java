package javacore;
import java.util.ArrayList;
public class GenericIntSearch {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		 
		//Contains(Object o)
		System.out.println(a.contains(20));
		System.out.println(50);
		System.out.println(a);
		ArrayList<Integer> b=new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(5);
		b.add(10);
		
		//containsAll(Collection c)
		System.out.println(a.containsAll(b));
		
		//indexOf(Object 0)
		System.out.println(a.indexOf(20));
		System.out.println(a.indexOf(50));
		
		//lastIndexOf(Object o)
		System.out.println(b.lastIndexOf(10));
		System.out.println(b.lastIndexOf(20));
		System.out.println(b.lastIndexOf(40));
	}
}
