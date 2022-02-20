package com.org.gen.day1.question3;
import java.util.Scanner;

public class HotelDishes {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);


		//Creating Menu
		while(true){
			System.out.println("Press 1 to order South Indian Dish");
			System.out.println("Press 2 to North Indian Dish");
			System.out.println("Press 3 to Rajasthani Dish");
			System.out.println("Press 4 to Gujrati Dish");
			System.out.println("Press 5 to Bengali Dish");
			System.out.println("Press 6 to Desserts");
			System.out.println("Press 7 to exit");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Welcome to South Indian Food Court");
			southIndianFood();
			break;
			case 2: System.out.println("Welcome to North Indian Food Court");
			northIndianFood();
			break;
			case 3: System.out.println("Welcome to Rajasthani Food Court");
			rajasthaniFood();
			break;
			case 4: System.out.println("Welcome to Gujrati Food Court");
			gujratiFood();
			break;
			case 5: System.out.println("Welcome to Bengali Food Court");
			bengaliFood();
			break;			
			case 6: System.out.println("Welcome to Desserts Food Court");
			desserts();
			break;
			case 7: System.out.println("Thanks for ordering");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			
			}
		}
		
	}

	public static void southIndianFood(){
		int idli=100,dosa=180,vada=120;
		int totalBill = idli+dosa+vada;
		System.out.println("You get: ");
		System.out.println("Idli : 2 Pieces: Rs. 100");
		System.out.println("Butter Cheese Dosa : 1 Piece: Rs. 180");
		System.out.println("Vada : 2 Pieces: Rs. 120");
		System.out.println("Total Bill is : "+totalBill);
		

	}

	public static void northIndianFood(){
		int chole = 200, litti=400;
		int totalBill = chole+litti;
		System.out.println("You get:");
		System.out.println("Chole Bhature : 2 Pieces: Rs. 200");
		System.out.println("Litti Chokha : 4 Pieces: Rs. 400");
		System.out.println("Total Bill is : "+totalBill);
	}

	public static void rajasthaniFood(){
		int dal=150,maas=800,puri=100;
		int totalBill=dal+maas+puri;
		System.out.println("You get:");
		System.out.println("Dal Baati Churma: Rs. 150");
		System.out.println("Laal maas: Rs. 800");
		System.out.println("Methi Bajra puri: Rs. 100");
		System.out.println("Total Bill is : "+totalBill);

	}

	public static void gujratiFood(){
		int dhokla=180,khandvi=250,methi=450;
		int totalBill=dhokla+khandvi+methi;
		System.out.println("You get:");
		System.out.println("Dhokla : 2 pieces: Rs. 180");
		System.out.println("Khandvi: Rs. 250");
		System.out.println("Methi ka Thepla: Rs. 450");
		System.out.println("Total Bill is : "+totalBill);
	}

	public static void bengaliFood(){
		int maach=200,aalu=150;
		int totalBill=maach+aalu;
		System.out.println("You get:");
		System.out.println("Maach Bhaat: Rs. 200");
		System.out.println("Aalu Luchi: Rs. 150");
		System.out.println("Total Bill is : "+totalBill);
	}

	public static void desserts(){
		int rm=100,ras=120,emarti=140,gajar=80;
		int totalBill=rm+ras+emarti+gajar;
		System.out.println("You get:");
		System.out.println("Rasmalai: Rs. 100");
		System.out.println("Rasgulla : 2 Pieces: Rs. 120");
		System.out.println("Emarti : 2 Pieces: Rs. 140");
		System.out.println("Gajar ka halwa: Rs. 80");
		System.out.println("Total Bill is : "+totalBill);

	}

}