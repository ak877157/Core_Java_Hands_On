package com.org.gen.day1;

public class AutoTypeConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 10;
System.out.println("Integer value is : "+num);

double data = num;
System.out.println("Double value is : "+data);

int x = (int) data;
String s = String.valueOf(num);

System.out.println("Converted into string : "+s);

//string to int
int y = Integer.parseInt(s);
System.out.println("String to int : "+y);
	}

}
