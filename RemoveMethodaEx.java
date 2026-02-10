package javacore; 
import java.util.ArrayList;
class Flower{
	String name;
	int id;
	public Flower(String name,int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString()
	{
		return "Name:" +name +"ID:" +id;
	}
	@Override
	public boolean equals(Object o) {
		Flower f3=(Flower)o;
		return this.name.equals(f3.name) && this.id==f3.id;
	}
}
public class RemoveMethodaEx {
	public static void main(String[] args) {
		ArrayList<Flower> f=new ArrayList<>();
		f.add(new Flower("Rose",001));
		f.add(new Flower("Lilly",002));
		f.add(new Flower("Lotus",003));
		f.add(new Flower("Sai",004));
		System.out.println(f);
		
		Flower f2=new Flower("Lotus",003);
		System.out.println(f.remove(f2));
		System.out.println(f);
		
		ArrayList<Flower> f1=new ArrayList<>();
		f1.add(new Flower("Rose",001));
		f1.add(new Flower("Lotus",007));
		f1.add(new Flower("Sai",004));
		f1.add(new Flower("HB",002));
		
		System.out.println(f.removeAll(f1));
		System.out.println(f);
		
		System.out.println(f.retainAll(f1));
		System.out.println(f);
		
		System.out.println(f1.isEmpty());
		System.out.println(f1);
		f1.clear();
		System.out.println(f1.isEmpty());
		
		
	}
}
