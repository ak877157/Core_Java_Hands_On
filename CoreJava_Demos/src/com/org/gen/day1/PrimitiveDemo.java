package com.org.gen.day1;

public class PrimitiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
short s = 2;
byte b = 6;
long l = 1234567894;
float f = 5.30948f;
double d = 876.756d;

short b1 =(short) (s+a);  //narrowing

int x = b+a;  //widening

System.out.println("Integer = "+a);
System.out.println("Short = "+s);
System.out.println("Byte = "+b);
System.out.println("Long = "+l);
System.out.println("Float = "+f);
System.out.println("Double = "+d);

System.out.println("Narrowing = "+b1);
System.out.println("Widening  = "+x);
	}

}