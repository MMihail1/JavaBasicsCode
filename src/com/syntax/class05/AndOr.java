package com.syntax.class05;

import java.util.Scanner;

public class AndOr {
	public static void main(String[] args) {
		//     Prompt the user to enter person heights in inches. Person should be classified as one of the following:
Scanner scan=new Scanner(System.in);
		
		System.out.println("pls enter your height, inches");
		int height=scan.nextInt();
		if (height<60) { System.out.println("short");
		}		else if (height>60 && height<72); {System.out.println("medium");
		} 		else if (height>72) {System.out.println("tall");}
	
	    
	   // Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
	    //Ask user to enter a number and then define if number is small, medium or large

	    //Small number is value between 1 and 10
	    //Medium number is value between 11 and 100
	    //Large number is value between 101 and 1000
	}
}