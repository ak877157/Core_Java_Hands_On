package com.org.gen.day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter name age and salary : ");
		
		String name = sc.nextLine(); //string input
		
		int age = sc.nextInt();
		
		double salary = sc.nextDouble();
		
		System.out.println("Employee name = "+name);
		System.out.println("Employee age = "+age);
		System.out.println("Employee salary = "+salary);
		

	}

}
