package com.syntax.class02;
public class HW_May1_Three_Progs {
public static void main(String[] args) {
	System.out.println("       ________________________Result of Program I _______________________________");
	double first=7.89; 	            double second=7.7;
	double add=first+second;  	    double subtract=first-second;
	double multiply=first*second;  	double divide=first/second;

	System.out.println("The add of 2 numbers "+first+" and "+second+" is equal to "+add+'.');
	System.out.println("The subtract of 2 numbers "+first+" and "+second+" is equal to "+subtract+'.');
	System.out.println("The multiply of 2 numbers "+first+" and "+second+" is equal to "+multiply+'.');
	System.out.println("The divide of 2 numbers "+first+" and "+second+" is equal to "+divide+'.');
	
	System.out.println("       ________________________Result of Program II_______________________________");
	double num=3.9; 	               double square=num*num;       System.out.println("The square of the "+num+" is "+square+'.');
	
    System.out.println("       ________________________Result of Program III______________________________");
	int width=5; 	int height=8;  		int per=(width+height)*2; 	int area=width*height;
	System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+per+" and the area is "+area+'.');
	
	} }