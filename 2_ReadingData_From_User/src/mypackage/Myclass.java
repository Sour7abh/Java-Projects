package mypackage;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args)
	{
		//define variables
		Scanner obj = new Scanner(System.in);
		String name;
		float salary;
		int age;
		
		//Read data from user
		System.out.println("Enter your name:");
		name = obj.nextLine();
		
		
		System.out.println("Enter your salary:");
		salary = obj.nextFloat();
		
		
		System.out.println("Enter your age:");
		age = obj.nextInt();
		
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
		System.out.println("age = "+age);
		
		
	}

}
