package com.org.gen.day2.question5;

class Protein{
	Protein(){
		System.out.println("Human body requires protein");
	}
	
	Protein(String s){
		System.out.println(s+" is necessary for hair, eyes and muscles");
	}
}

class Sources extends Protein{
	Sources(){
		System.out.println("Sources of protein are fish, milk and eggs");
		
	}
	Sources(String s){
		super();
		System.out.println(s+" is also a good source of protein");
	}
}
public class MyProtein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sources s = new Sources();
		Sources s1 = new Sources("Chicken");
		Protein p1 = new Protein("Protein");
		
	}

}
