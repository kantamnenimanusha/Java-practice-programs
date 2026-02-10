package javacore;
import java.util.ArrayList;
public class Nongenericcollection {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		//add(object o);
		a.add(10);
		a.add('A');
		System.out.println(a);
		ArrayList a1=new ArrayList();
		a1.add(true);
		a1.add(20);
		System.out.println(a1);
		//addAll(collection c)
		a.addAll(a1);
		System.out.println(a);
		//add(int index,object o);
		a.add(2,'B');
		System.out.println(a);
		//addAll(int index,collection c);
		a.addAll(4,a1);
		System.out.println(a);
		
	}

}
