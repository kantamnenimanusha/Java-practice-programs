package javacore;
import java.util.*;
//Interface
interface Transaction{
	void deposit(double amount);
	void withdraw(double amount);
}
//Abstract class
abstract class BankAccount{
	private int accountNumber;
	private double balance;
	public BankAccount(int accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	//getters
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	//setter
	void setBalance(double balance) {
		this.balance=balance;
	}
	abstract double calculateInterest();
}
//child class
class savingsAccount extends BankAccount implements Transaction{
	savingsAccount(int accountNumber,double balance){
		super(accountNumber, balance);	
	}
	//@override
	 public void deposit(double amount) {
	        setBalance(getBalance() + amount);
	    }
	 //withdrawl condition
	 public void withdraw(double amount) {
		 if (amount <= getBalance()) {
		        setBalance(getBalance() - amount);
		        System.out.println("Withdrawal successful");
		    } else {
		        System.out.println("Insufficient balance");
		    }
	    }
	 public double calculateInterest() {
	        return getBalance() * 0.04;
	    }
}
public class Bankingsystem {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        savingsAccount account = new savingsAccount(accNo, balance);

        System.out.print("Enter Deposit Amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        account.withdraw(sc.nextDouble());

        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Interest: " + account.calculateInterest());

  
    }

}
