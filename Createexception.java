package javacore;
import java.util.*;
class InvalidAgeException extends Exception {
	InvalidAgeException(String message)
	{
		super(message);
	}
}
class CheckAge{
	public void check(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("under age");
		}
		else {
			System.out.println("correct age");
		}
	}
}
class Createexception{
	public static void main(String[] args) {
		CheckAge c=new CheckAge();
		try {
			c.check(19);
		}catch(InvalidAgeException e) {
			System.out.println("exception caught:"+e.getMessage());
		}
	}

}
