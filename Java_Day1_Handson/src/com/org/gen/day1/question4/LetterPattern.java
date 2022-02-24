package com.org.gen.day1.question4;

public class LetterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l;
		
		for(i=0;i<=11;i++) {
			
			for(j=10;j>=i;j--) {
				System.out.print(" "); 
			}
			
			for(k=0;k<=2;k++) {
				System.out.print("*");
			}
			
			for(l=1;l<=i;l++) {
				
				//this is the middle portion of character 'A'
				if(i>4 && i<7)
				{
				
				System.out.print("**");
			}else {
				System.out.print("  ");
				}
			}
			
			for(k=0;k<=2;k++) {
				System.out.print("*");
			}
			
			for(j=10;j>=i;j--) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
