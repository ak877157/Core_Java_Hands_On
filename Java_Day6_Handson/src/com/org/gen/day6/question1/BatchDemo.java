package com.org.gen.day6.question1;

public class BatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptid = {"CBD21X12","CBD21X13","CBD22X14","CBD22X122","CBD22X123","CBD22X124","CBD22X125"}; 
		int count = 0;
		
		System.out.println("Batch with year 22 : ");
		for(int i=0;i<deptid.length;i++) {
			if(deptid[i].contains("22")) {
				System.out.println(deptid[i]);
				count++;
			}

		}
		System.out.println("Count is: "+count);
	}

}
