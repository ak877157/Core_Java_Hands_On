package com.org.gen.day6.question2;


public class CricketerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String player[] = {"MS Dhoni Batsman","Virat Kohli Batsman","Hardik Pandya Bowler","Jaspreet Bumrah Bowler","Sachin Tendulkar Batsman","Suresh Raina AllRounder"};
		
		int batsman=0;
		int bowler=0;
		int allrounder=0;
		
		for(String s:player){
			if(s.endsWith("Batsman")){
				batsman++;
			}else if(s.endsWith("Bowler"))
				bowler++;
			else if(s.endsWith("AllRounder")) 
				allrounder++;
			
			
			
			
		}
		
		
		System.out.println(" Total Batsmans in the team : "+batsman);
		System.out.println(" Total Bowlers in the team : "+bowler);
		System.out.println(" Total  All Rounders in the team :  "+ allrounder);
		
	}

}