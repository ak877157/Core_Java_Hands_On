package com.org.gen.day1.home.work;

import java.util.Scanner;

public class HotelMenuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.println("Enter 1 to order South Indian Dish : ");
		System.out.println("Enter 2 to order North Indian Dish : ");
		System.out.println("Enter 3 to order Rajsthani Dish : ");
		System.out.println("Enter 4 to order Gujrati Dish : ");
		System.out.println("Enter 5 to order Bengali Dish : ");
		System.out.println("Enter 6 to order Desserts : ");

		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Welcome to South Indian food court");
			southIndian();
			break;
		case 2:
			System.out.println("Welcome to North Indian food court");
			northIndian();
			break;
		case 3:
			System.out.println("Welcome to Rajsthani food court");
			rajasthani();
			break;
		case 4:
			System.out.println("Welcome to Gujrati food court");
			gujrati();
			break;
		case 5:
			System.out.println("Welcome to Bengali food court");
			bengali();
			break;
		case 6:
			System.out.println("Welcome to Desserts food court");
			desserts();
			break;
		default:
			System.out.println("Hotel is not serving. Sorry!");
			break;
		}

	}
	
	public static void southIndian(){
		System.out.println("You get:");
		System.out.println("Idli : 2 Pieces:");
		System.out.println("Butter Cheese Dosa : 1 Pieces:");
		System.out.println("Vada : 2 Pieces:");

	}

	public static void northIndian(){
		System.out.println("You get:");
		System.out.println("Chole Bhature");
		System.out.println("Litti Chokha");
	}

	public static void rajasthani(){
		System.out.println("You get:");
		System.out.println("Dal Baati Churma");
		System.out.println("Laal maas");
		System.out.println("Methi Bajra puri");

	}

	public static void gujrati(){
		System.out.println("You get:");
		System.out.println("Dhokla");
		System.out.println("Khandvi");
		System.out.println("Methi ka Thepla");
	}

	public static void bengali(){
		System.out.println("You get:");
		System.out.println("Maach Bhaat ");
		System.out.println("Aalu Luchi");
	}

	public static void desserts(){
		System.out.println("You get:");
		System.out.println("Rasmalai");
		System.out.println("Rasgulla");
		System.out.println("Milk Cake");
		System.out.println("Gajar ka Halwa");

	}

}