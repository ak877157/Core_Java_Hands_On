package com.org.gen.day1.question2;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("It is a leap year");
				}else
					System.out.println("Not a leap year");
			}
		}else
			System.out.println("Not a leap year");
	}

}
