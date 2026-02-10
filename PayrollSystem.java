package javacore;
import java.util.Scanner;
abstract class Employee {

    private int empId;
    private String name;
    protected double bonusSalary;

    // Constructor
    public Employee(int empId, String name, double bonusSalary) {
        this.empId = empId;
        this.name = name;
        this.bonusSalary = bonusSalary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    // Abstract methods
    public abstract double calculateBonus();
    public abstract double calculateTotalSalary();
}
class Manager extends Employee {

    public Manager(int empId, String name, double bonusSalary) {
        super(empId, name, bonusSalary);
    }

    @Override
    public double calculateBonus() {
        return bonusSalary * 0.20;   // 20% bonus
    }

    @Override
    public double calculateTotalSalary() {
        return bonusSalary + calculateBonus();
    }
}
class Developer extends Employee {

    public Developer(int empId, String name, double bonusSalary) {
        super(empId, name, bonusSalary);
    }

    @Override
    public double calculateBonus() {
        return bonusSalary * 0.10;   // 10% bonus
    }

    @Override
    public double calculateTotalSalary() {
        return bonusSalary + calculateBonus();
    }
}

public class PayrollSystem {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ID:");
//		int empid=sc.nextInt();
//		
//		System.out.println("Enter Name:");
//		String name=sc.next();
//		
//		System.out.println("Enter Bounus:");
//		double bonus=sc.nextDouble();
		Employee manager = new Manager(101, "Alice", 50000);
        Employee developer = new Developer(102, "Bob", 40000);

        System.out.println("Manager Details:");
        System.out.println("ID: " + manager.getEmpId());
        System.out.println("Name: " + manager.getName());
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println("Total Salary: " + manager.calculateTotalSalary());

        System.out.println();

        System.out.println("Developer Details:");
        System.out.println("ID: " + developer.getEmpId());
        System.out.println("Name: " + developer.getName());
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println("Total Salary: " + developer.calculateTotalSalary());
	}
}
