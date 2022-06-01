package com.syntax.class05;
import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		//     You are DMV representative and you need to ask customer 
		//their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("pls enter age");
		int age=scan.nextInt();
		if (age>=18) { System.out.println("issue a driver license to"); }
		else System.out.println("offer them to get a learners permit");
		

//2. Create a Java program that will ask if user has a credit card or not. 
//If you user does not have a credit card then offer them. 
//If they do have one ask what is balance on the card? If balance of the 
		//card is larger than 1000, tell them to pay off immediately, 
//otherwise you can tell them that they can spend more.
		System.out.println("user has a credit card or not?");
	    String card=scan.next();
		if (card) { System.out.println("what is balance on the card?");
		double bal=scan.nextdouble();
		else if (bal>1000) System.out.println("to pay off immediately");}
		else System.out.println("a credit card offer");
		
		else System.out.println("offer them to get a learners permit");
	
	}
}