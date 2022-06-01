package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Mike";
		String lastName="Smith";		
        long phone=123456789l;
        String phoneNumber="123-456-7890";
        String address="123 Washington str";
        int age=30;
        String city="Miami";
        System.out.println(name+" "+lastName);
        //Mike Lives in Miami
        System.out.println(name+" Lives in "+city);
        // Mike is 30 years old
        System.out.println(name+" is "+age+" years old");
	}

}
