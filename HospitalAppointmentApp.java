package javacore;
import java.util.*;
abstract class appointment{
	private int appointmentid;
	private String patientname;
	private double consultantfee;
	appointment(int appointmentid,String patientname,double conultantfee){
		this.appointmentid=appointmentid;
		this.patientname=patientname;
		this.consultantfee=consultantfee;
	}
	public int getappointmentid() {
		return appointmentid;
	}
	public String patientname() {
		return patientname;
	}
	public double consultantfee() {
		return consultantfee;
	}
	public abstract double diagnosticCharge();
	public double calculateGST() {
		return 0.24 * (consultantfee + diagnosticCharge());
	}
	public double calculateTotalBill() {
		return consultantfee + diagnosticCharge() + calculateGST();
	}
	public void displayBill() {
		System.out.println("Appointment ID: "+appointmentid);
		System.out.println("Patient Name: "+patientname);
		System.out.println("Consultant Fee: "+consultantfee);
		System.out.println("Diagnostic Charge: "+ diagnosticCharge());
		System.out.println("0.24 of GST: "+calculateGST());
		System.out.println("Total Bill: "+calculateTotalBill());
	}
}
class GeneralDoc extends appointment{
	public GeneralDoc(int id,String name,double fee) {
		super(id,name,fee);
	}
	@Override
	public double diagnosticCharge() {
		return 400;
	}
}
class SpecialistDoc extends appointment{
	public SpecialistDoc(int id,String name,double fee) {
		super(id,name,fee);
	}
	@Override
	public double diagnosticCharge() {
		return 1200;
	}
}
class SurgeonDoc extends appointment{
	public SurgeonDoc(int id,String name,double fee) {
		super(id,name,fee);
	}
	@Override
	public double diagnosticCharge() {
		return 20000;
	}
}
public class HospitalAppointmentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Appointment ID: ");
		int id=sc.nextInt();
		
		System.out.println("Enter Patient Name:");
		String name=sc.next();
		
		System.out.println("Enter consultant fee: ");
		Double fee=sc.nextDouble();
		
		System.out.println("Choose Doc Type:");
		System.out.println("1.General Doc");
		System.out.println("2.Specialist Doc");
		System.out.println("3.Surgeon Doc");
		int choice=sc.nextInt();
		
		appointment app=null;
		switch(choice) {
			case 1:
				app=new GeneralDoc(id,name,fee);
				break;
			case 2:
				app=new SpecialistDoc(id,name,fee);
				break;
			case 3:
				app=new SurgeonDoc(id,name,fee);
				break;
			default:
				System.out.println("Invalid Choice");
				System.exit(0);
	}
		app.displayBill();
		sc.close();

  }
} 
