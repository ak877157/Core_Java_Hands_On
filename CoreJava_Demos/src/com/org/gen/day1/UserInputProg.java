package com.org.gen.day1;

import java.util.Scanner;

public class UserInputProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter voterid, name, age and location : ");
		
		int voterId = sc.nextInt();
		String name = sc.next();
		sc.nextLine();
		int age = sc.nextInt();
		String loc = sc.next();
		sc.nextLine();
		
		System.out.println("Voter id is : "+voterId);
		System.out.println("The name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Location is : "+loc);

	}

}
