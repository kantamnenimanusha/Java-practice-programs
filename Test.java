package javacore;
import java.util.ArrayList;
class Student3{
		// TODO Auto-generated method stub
		String name;
		int id;
		Student3(String name,int id){
			this.name=name;
			this.id=id;
		}
		public String toString() {
			return "Name:"+name+" Id:"+id ;
		}
}
class Test{
	public static void main(String[] args) {
		ArrayList <Student3> s=new ArrayList<>();
		s.add(new Student3("Mark",10));
		s.add(new Student3("Sam",20));
		System.out.println(s);
		
	}
	
}

	

