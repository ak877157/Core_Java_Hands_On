package com.org.gen.day6.question3;

import java.util.HashSet;
import java.util.Set;

public class SetEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<OldEmployee> hs = new HashSet<>();
		OldEmployee e1 = new OldEmployee(106, 4, "Amit", "DS", 50000);
		OldEmployee e2 = new OldEmployee(2, 2, "Shivam", "Java", 100000);
		
		
		Set<NewEmployee> hs1 = new HashSet<>();
		
		NewEmployee ne1 = new NewEmployee(3, 6, "Himan", "Java", 60000);
		
		hs.add(e1);
		hs.add(e2);
		hs1.add(ne1);
		
		
		int size1 = hs.size();
		int size2 = hs1.size();
		
		System.out.println(" Total Employees = "+(size1+size2));

		for(OldEmployee e: hs){
			
			System.out.println(" Employee Id = "+e.id +" ,Employee Exp Year = "+ e.exYear+" ,Employee name = "+ e.name  +" ,Employee Skill = "+e.skill+ "  Employee salary "+ e.salary);
			
			if(e.id == 106){
				System.out.println(e.id+"  is working ");
			}
			if(e.exYear<3){
				hs.remove(e);
			}
			if(e.skill.equalsIgnoreCase("Java")){
				System.out.println(e.name + " has Java Skill ");
			}
			
		}
		
		System.out.println(" New Employees List   ");
		
		for(NewEmployee e: hs1){
			System.out.println(" Employee Id = "+e.id +" ,Employee Exp Year = "+ e.exYear+" ,Employee name = "+ e.name  +" ,Employee Skill = "+e.skill+ "  Employee salary "+ e.salary);
		
		
			if(e.id == 106){
				System.out.println(e.id+"  is working ");
			}
			if(e.exYear<3){
				hs.remove(e);
			}
			if(e.skill.equalsIgnoreCase("Java")){
				System.out.println(e.name + " has Java Skill ");
			}
		
		}
		
		System.out.println(" Total Employee :: = "+(size1+size2));
	
		
	}

}
