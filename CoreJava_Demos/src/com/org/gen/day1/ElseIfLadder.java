package com.org.gen.day1;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exam_marks = 75;
		char grade ;
		
		if(exam_marks >=90) {
			grade = 'A';
		}
		else if(exam_marks >=80) {
			grade = 'B';
		}else if(exam_marks >=70) {
			grade = 'C';
		}else if(exam_marks >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("Grade is : "+grade);
			

	}

}