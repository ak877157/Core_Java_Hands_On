package com.org.gen.coding.test;

class Bank{
	int getBalance() {
		return 0;
	}
}

class A extends Bank{
	int getBalance(int balance) {
		return balance;
	}
}

class B extends Bank{
	int getBalance(int balance) {
		return balance;
	}
}

class C extends Bank{
	int getBalance(int balance) {
		return balance;
	}
}
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println("The balance in Bank A is $"+a.getBalance(1000));
		System.out.println("The balance in Bank B is $"+b.getBalance(1500));
		System.out.println("The balance in Bank C is $"+c.getBalance(2000));
		

	}

}
