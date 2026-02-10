package javacore;
import java.util.ArrayList;
class Fruit{
	String name;
	double price;
	Fruit(String name,double price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Name:" +name + " Price:" +price;
	}
	public boolean equals(Object o) {
		Fruit f2=(Fruit)o;
		return this.name.equals(f2.name) && this.price==f2.price;
	}
}
public class ClassTypeGenericSearch {
	public static void main(String[] args) {
		ArrayList<Fruit> f=new ArrayList<>();
		f.add(new Fruit("Apple",60));
		f.add(new Fruit("Banana",40));
		f.add(new Fruit("Mango",80));
		f.add(new Fruit("Apple",60));
		System.out.println(f);
		
		//contains(Object o)
		Fruit f1=new Fruit("Apple",60);
		System.out.println(f.contains(f1));
		
		//indexOf(Object o)
		Fruit f3=new Fruit("Banana",40);
		System.out.println(f.indexOf(f3));
		
		//lastIndexOf(Object o)
		System.out.println(f.lastIndexOf(f1));
		
		ArrayList<Fruit> f4=new ArrayList<>();
		f4.add(new Fruit("Apple",60));
		f4.add(new Fruit("Mango",80));
		
		//containsAll(Collection c)
		System.out.println(f.containsAll(f4));
	}
}
