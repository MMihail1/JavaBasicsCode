package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Mike";
		String lastName="Mikhalko";
		char grade='A';
		String city="Omsk";
		String state="Omskaya obl";
		Long phone=79136037777L;
	    System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phone);
		
        city="New York";
        state="New York";
        phone=198776556L;
        grade='B';
        System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state);
		System.out.println("My new phone number is "+phone);
			
	}}
