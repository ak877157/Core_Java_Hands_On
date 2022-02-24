package com.org.gen.day1;

import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String menu;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.println("Enter 1 for Coffee : ");
		System.out.println("Enter 2 for Tea : ");
		System.out.println("Enter 3 for Cold Drink : ");
		System.out.println("Enter 4 Main Course : ");
		
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Welcome into Hotel ABC food court");
			System.out.println("Please enjoy your Coffee");
			break;
		case 2:
			System.out.println("Welcome into Hotel XYZ food court");
			System.out.println("Please enjoy your Tea");
			break;
		case 3:
			System.out.println("Welcome into Hotel PQR food court");
			System.out.println("Please enjoy your Cold Drink");
			break;
		case 4:
			System.out.println("Welcome into Hotel ZXC food court");
			System.out.println("Please select our dishes");
			mainCourse();
			break;
		default:
			System.out.println("Hotel is not serving. Sorry!");
			break;
		}

	}
	public static void mainCourse() {		//main course method
		System.out.println("You get");
		System.out.println("Chhole Bhatoore");
		System.out.println("Litti Chokha");
		System.out.println("Idli");
		System.out.println("Methi Bhaji Poori");
	}

}