package javacore;

public class Trycatch {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(14/0);
		}catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
