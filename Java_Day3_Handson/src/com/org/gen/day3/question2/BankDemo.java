package com.org.gen.day3.question2;

abstract class Bank{
	abstract void getBalance();
}

class A1 extends Bank{
	void getBalance() {
		int deposit=100;
		System.out.println("The balance after deposting is : "+deposit);
	}
}

class B1 extends Bank{
	void getBalance() {
		int deposit=200;
		System.out.println("The balance after deposting is : "+deposit);
	}
}

class C1 extends Bank{
	void getBalance() {
		int deposit=300;
		System.out.println("The balance after deposting is : "+deposit);
	}
}
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		a1.getBalance();
		
		B1 b1 = new B1();
		b1.getBalance();
		
		C1 c1 = new C1();
		c1.getBalance();

	}

}
