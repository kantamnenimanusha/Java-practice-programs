package javacore;

public class Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="ACER";
		int[] a= {2,4,6,8,1};
		try {
		//System.out.println(s.charAt(5));
			System.out.println(a[6]);

	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch(ArrayIndexOutOfBoundsException f) {
		System.out.println(f.toString());
	}catch(Throwable g){
		System.out.println(g.getMessage());

}
finally {
	System.out.println("end");
}
}
}
