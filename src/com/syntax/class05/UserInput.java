package com.syntax.class05;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

    System.out.println("pls enter name");
	String name=scan.next();
	System.out.println(name);
	
	System.out.println("pls enter age");
	int age=scan.nextInt();
	System.out.println(age);
	
	System.out.println("pls enter price");
	double price=scan.nextInt();
	System.out.println(price);
	
	
	
	
	}
}