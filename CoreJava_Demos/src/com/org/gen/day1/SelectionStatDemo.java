package com.org.gen.day1;

import java.util.Scanner;
public class SelectionStatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the test score : ");
		String scoreString = kb.nextLine();
		double score = Double.parseDouble(scoreString); //String to double
		
		if(score > 60) {
			System.out.println("You are doing very well");
		}else if(score ==60 ){
			System.out.println("Good Job");
			System.out.println("Gear Up!!");
		}
		else {
			System.out.println("Try again!!");
		}

	}

}