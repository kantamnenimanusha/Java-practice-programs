package javacore;
import java.util.ArrayList;
public class Genericnonprimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a=new ArrayList<>();
		a.add("Anya");
		a.add("Forger");
		System.out.println(a);
		//add(object o);
		ArrayList <String> a1=new ArrayList<>();
		a1.add("papa");
		System.out.println(a1);
		//addAll(collection c);
		a.addAll(a1);
		System.out.println(a);
		//add(int index,object o)
		a1.add(1,"Loid");
		System.out.println(a1);
		//addAll(int index,collection c)
		a.addAll(3,a1);
		System.out.println(a);
	}

}
