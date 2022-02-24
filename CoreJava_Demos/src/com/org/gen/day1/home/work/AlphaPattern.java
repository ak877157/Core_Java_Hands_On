package com.org.gen.day1.home.work;

public class AlphaPattern {

	static void pattern(int x,int y) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				System.out.print("*" + "");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		pattern(10,10);
		for(i=1;i<=3;i++) {
			for(j=1;j<=10;j++) {
				if(j>=6) {
				System.out.print(" ");
			}else {
			System.out.print("*" + "");
			}
		}System.out.println();
			}
	}
}
