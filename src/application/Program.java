package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	
	Scanner sc=new Scanner(System.in);
	
	List<Employee> list= new ArrayList<>();
	
	System.out.print("enter the number of employees: ");
	int n=sc.nextInt();	
	
	for (int i=0;i<n;i++) {
		System.out.printf("employee #%d data:", i+1);
		System.out.println("outsourced (y/n): ");
		char ch=sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("name: ");
		String name=sc.nextLine();
		
		System.out.println("hours worked: ");
		int hours=sc.nextInt();
		
		System.out.println("value per hour: ");
		double valuePerHour=sc.nextDouble();
		
		if (ch=='y') {
			System.out.println("additional charge: ");
			double additionalCharge=sc.nextDouble();
			list.add(new OutSourcedEmployee(name,hours,valuePerHour, additionalCharge));
		}
		else {
			list.add(new Employee(name,hours,valuePerHour));
		}
	}
	
	System.out.println();
	System.out.println("PAYMENTS: ");
	for (Employee emp : list) {
		System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
	}
	
	sc.close();
	
	
	
	
	
	
	
	
	
	

	}

}
