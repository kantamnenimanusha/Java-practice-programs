package javacore;
import java.util.ArrayList;
class Planet{
	int id;
	String name;
	public Planet(String name,int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString()
	{
		return "Name:"+name+ "ID:" +id;
	}
	@Override
	public boolean equals(Object o)
	{
		Planet p2=(Planet)o;
		return this.name.equals(p2.name)&&this.id==(p2.id);
	}
}
public class GenericClassTypeRemove {
	public static void main(String[] args) {
		ArrayList<Planet> p=new ArrayList<>();
		p.add(new Planet("Earth",101));
		p.add(new Planet("Mercury",102));
		p.add(new Planet("Mars",103));
		p.add(new Planet("Venus",104));
		
		//remove(Object o)
		//p.remove("Mars",103);
		
		Planet p1=new Planet("Mars",103);
		p.remove(p1);
		System.out.println(p);
		
//		remove(int index)
		System.out.println(p.remove(p1));
		System.out.println(p);
		
		ArrayList<Planet> p3=new ArrayList<>();
		p3.add(new Planet("Jupiter",105));
		p3.add(new Planet("Earth",101));
		p3.add(new Planet("Venus",106));
		p3.add(new Planet("Mercury",102));
		System.out.println(p3);
		
		//removeAll(Collection c)
		System.out.println(p.removeAll(p3));
		System.out.println(p);
		
		//retrieveAll(Collection c)
		System.out.println(p.retainAll(p3));
		System.out.println(p);
		
//		clear()
		System.out.println(p3.isEmpty());
		System.out.println(p3);
		p3.clear();
		System.out.println(p3.isEmpty());
	}
}
