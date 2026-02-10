package javacore;
import java.util.ArrayList;
public class GenericRemoveAccess {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);//0
		a.add(20);//1
		a.add(30);//2
		a.add(40);//3
		System.out.println(a);
		
		//remove(Object o)
		//System.out.println(a.remove(30));
		
		//remove(int index)
		System.out.println(a.remove(1));
		System.out.println(a);
		
		ArrayList<Integer> b=new ArrayList<>();
		b.add(15);
		b.add(25);
		b.add(30);
		b.add(40);
		System.out.println(b);
		
		//removeaLL(Collection c)
		System.out.println(a.removeAll(b));
		System.out.println(a);
		System.out.println(b);
		
		//retainAll(Collection c)
		System.out.println(a.retainAll(b));
		System.out.println(a);
		System.out.println(b);
		
      //clear()	
		System.out.println(b.isEmpty());
		b.clear();
		System.out.println(b);
		System.out.println(b.isEmpty());
		
		ArrayList<String> x=new ArrayList<>();
		x.add("AB");
		x.add("DEF");
		x.add("GHI");
		x.add("KLM");
		System.out.println(x);
		System.out.println(x.remove("KLM"));
		System.out.println(x.remove(1));
		System.out.println(x);
		
		ArrayList<String> y=new ArrayList<>();
		y.add("AB");
		y.add("CD");
		y.add("EF");
		y.add("GH");
		System.out.println(y);
		System.out.println(x.removeAll(y));
		System.out.println(x);
		System.out.println(x.retainAll(y));
		System.out.println(x);
		y.clear();
		System.out.println(y);
	}
	
}
