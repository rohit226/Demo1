//Q 3 WAP to ask name ,age and salary of an employee and print on console.


package Cop;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	float salary;
	
	void add()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name");
		name = s.next();
		System.out.println("Enter age");
		age= s.nextInt();
		System.out.println("Enter salary");
		salary= s.nextFloat();
	}
	void display()
	{
		System.out.println(name+" "+age+" "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a=new Employee();
		a.add();
		a.display();
		

	}

}
