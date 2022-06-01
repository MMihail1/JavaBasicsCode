package com.syntax.class05;
public class LogicalNot {
	public static void main(String[] args) {
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo2=!false;
		System.out.println(boo2);
		
	// if there is no traffic --> I will reach work ontime
		boolean traffic=false;
		if (!traffic) {System.out.println("I will reach work on time");}
String name="Emre";
if (!name.equals("Emre")) {System.out.println("You are not Emre");
	}

}