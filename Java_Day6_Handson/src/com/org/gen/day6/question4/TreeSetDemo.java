package com.org.gen.day6.question4;

import java.util.Iterator;
import java.util.TreeSet;

class Book implements Comparable<Book>{

	int id;
	String name,publisher;
	int quantity,subscriber;

	public Book(int id, String name, String publisher, int quantity, int subscriber) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.quantity = quantity;
		this.subscriber = subscriber;
	}


	@Override
	public int compareTo(Book o) {
		if(subscriber>o.subscriber)
			return 1;
		else if(subscriber<o.subscriber)
			return -1;
		else
			return 0;		
	}
	
}


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Book> tree = new TreeSet<>();
		
		Book b1 = new Book(101, "Core Java", "Galvin", 30, 300);
		Book b2 = new Book(102, "Advance Java", "Galvin", 25, 450);
		Book b3 = new Book(103, "Web Technology", "Stephen", 255, 4500);
		Book b4 = new Book(104, "C in depth", "SK Srivastva", 12, 480);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		 TreeSet<Book> head_set = new TreeSet<Book>();
		  
	        head_set = (TreeSet<Book>)tree.headSet(b3);
	        Iterator it= head_set.iterator();
		
	        System.out.println(" ----Head Set---- ");
	        while(it.hasNext()){
	        	Book b = (Book)it.next();
	        	System.out.println(" Book id = "+b.id+" Book Name = "+b.name+"   Book Publisher = "+b.publisher +"  Book subscriber =  "+ b.subscriber +"  Book quantity = "+b.quantity);
		}
	        
	        
	    TreeSet<Book> tail_set = new TreeSet<Book>();
	    
        
		    tail_set = (TreeSet<Book>)tree.tailSet(b2); 
	        Iterator it1= tail_set.iterator();
	        System.out.println(" ----Tail Set---- ");
		    while(it1.hasNext()){
				Book b = (Book)it1.next();
				System.out.println(" Book id = "+b.id+" Book Name = "+b.name+"   Book Publisher = "+b.publisher +"  Book subscriber =  "+ b.subscriber +"  Book quantity = "+b.quantity);
			} 
	       
	    
	    
	    System.out.println(" Subset of the given tree = " );
	    TreeSet<Book> subBook= (TreeSet<Book>)tree.subSet(b1, b2);
	    Iterator itSubBook= subBook.iterator();
        System.out.println(" ----SubSet---- ");
	    while(itSubBook.hasNext()){
			Book b = (Book)itSubBook.next();
			System.out.println(" Book id = "+b.id+" Book Name = "+b.name+"   Book Publisher = "+b.publisher +"  Book subscriber =  "+ b.subscriber +"  Book quantity = "+b.quantity);
		} 
	    
	    
		int sub=0;
		String name="";
		for(Book b : tree){
			if(b.subscriber>sub) {
				sub=b.subscriber;
				name=b.name;
			}
		}
		
		System.out.println("The maximum subscriber of the book is = "+sub);
		System.out.println("The name of the book is = "+name);
	}

}
