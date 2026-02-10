package javacore;
import java.util.*;

public class simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter operator:");
		String op=sc.next();
		System.out.println("enter op1 val:");
		int op1=sc.nextInt();
		System.out.println("enter op2 val");
		int op2=sc.nextInt();
		switch(op) {
		case "+":
			System.out.println(op1 + op2);
			break;
		case "-":
			System.out.println(op1-op2);
			break;
		case "*":
			System.out.println(op1*op2);
			break;
		case "/":
			System.out.println(op1/op2);
			break;
		default:
			System.out.println("invalid operator");
		}
		

	}

}
