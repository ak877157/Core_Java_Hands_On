package com.org.gen.day1.home.work;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin=1234;
		int tpin;
		System.out.println("Enter Your ATM pin : ");
		Scanner sc = new Scanner(System.in);
		tpin = sc.nextInt();
//		System.out.println("Pin Accepted. Welcome to XYZ Bank.");
		do {
			System.out.println("\n Sorry, Incorrect Pin. Try again");
			System.out.println("Enter your pin again : ");
			tpin =sc.nextInt();
			
		}while(tpin!=pin);


	}

}
