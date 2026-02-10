package javacore;
class student{
	int id;
}
public class Nullpointerexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.id=001;
		s=null;
		System.out.println(s.id);

	}

}
