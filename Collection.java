package javacore;
import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) {
		ArrayList <Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		//add(Object O);
		System.out.println(a);
		ArrayList <Integer> a1=new ArrayList<>();
		a1.add(40);
		a1.add(50);
		//addAll(Collection c)
		System.out.println(a1.addAll(a));
		System.out.println(a1);
		//add(int index,Object o);
		a.add(1,15);
		System.out.println(a);
		//addAll(int index,Collection c);
		System.out.println(a1.addAll(3,a));
		System.out.println(a1);
	}

}
