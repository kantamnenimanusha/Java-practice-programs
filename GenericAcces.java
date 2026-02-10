package javacore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class GenericAcces {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		//for each
		System.out.println("for each ");
		for(Integer i:a) {
			System.out.println(i);
			}
		
		//iterator method
		System.out.println("Iterator method");
		Iterator<Integer> a1=a.iterator();
		while(a1.hasNext())
		{
			System.out.println(a1.next());
		}
		
		//ListIterator method
		
		System.out.println("listIterator method");
		ListIterator<Integer> a2=a.listIterator();
		while(a2.hasNext())
		{
			System.out.println(a2.next());
		}
		
		//listIterator(int index) method
		    //forward traversal
		System.out.println("ListIt Forward Traversal");
		ListIterator<Integer> a3=a.listIterator(0);
		while(a3.hasNext()) {
			System.out.println(a3.next());
		}
			//backward traversal
		System.out.println("Backward Traversal");
		ListIterator<Integer> a4=a.listIterator(a.size());
		while(a4.hasPrevious()) {
			System.out.println(a4.previous());
		}
		
		//get(int index)
		
		System.out.println("get(int index)");
		System.out.println(a.get(1));
		     //forward traversal
		System.out.println("F T");
		for(int m=0;m<a.size();m++) {
			System.out.println(a.get(m));
		}
		     //backward traversal
		System.out.println("B T");
		for(int n=a.size()-1;n>=0;n--) {
			System.out.println(a.get(n));
		}
		
		//string type
		ArrayList<String> b=new ArrayList<>();
		b.add("Ram");
		b.add("Setu");
		b.add("abc");
		System.out.println(b);
		System.out.println("for each ");
		for(String j:b) {
			System.out.println(j);
			}
		System.out.println("iterator method");
		Iterator<String> b1=b.iterator();
		while(b1.hasNext()) {
			System.out.println(b1.next());
		}
		System.out.println("list iterator method");
		ListIterator<String> b2=b.listIterator();
		while(b2.hasNext()) {
			System.out.println(b2.next());
		}
		System.out.println("LTI Forwad method");
		ListIterator<String> b3=b.listIterator(0);
		while(b3.hasNext()) {
			System.out.println(b3.next());
		}
		System.out.println("LII backward traversal");
		ListIterator<String> b4=b.listIterator(b.size());
		while(b4.hasPrevious()) {
			System.out.println(b4.previous());
		}
		System.out.println("get ind F T");
		System.out.println(b.get(1));
		for(int y=0;y<b.size();y++) {
			System.out.println(b.get(y));
		}
		System.out.println("GIBT");
		for(int z=b.size()-1;z>=0;z--) {
			System.out.println(b.get(z));
		}
	}

}
