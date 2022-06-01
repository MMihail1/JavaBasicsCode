package com.syntax.class04;

public class Task {
	public static void main(String[] args) {
		int month = 12;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else
			System.out.println("December");
		System.out.println("____________________________________");
		double a = -0.7;
		if (a >= 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("the number is negative");

		}
		System.out.println("___________________________________________");
		
		boolean dip = true;
		double gpascore = 2;
		if (dip) {System.out.println("Congratulatioins");}
				else {System.out.println("Get a degree");
				if (gpascore>= 3.5) {System.out.println("You are eligible for scholarship");}
				else {System.out.println("You should studied harder");}}
		
		System.out.println("___________________________________________");
		System.out.println("");
		double rate=4.7;
		double price=77000;
		if (rate>4.5) { System.out.println("will not by a house"); }
		else {System.out.println("Consider buying");}
		if (price>50000) { System.out.println("take a loan");}
		else {System.out.println("pay a cash");}
		
	
		System.out.println("___________________________________________");

	}}