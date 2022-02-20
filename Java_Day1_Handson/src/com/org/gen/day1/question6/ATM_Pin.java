package com.org.gen.day1.question6;

import java.util.Scanner;

public class ATM_Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P=1234, pin, count = 0;
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.println(count+" .Enter your pin : ");
			pin=sc.nextInt();
			if(P==pin	) {
				System.out.println("Welcome user");
			}else {
				System.out.println("Invalid pin! Try again..");
			}
		}while(count<3);
		if(count==3) {
			System.out.println("Your ATM is locked for 24 hours");
		}

	}

}
