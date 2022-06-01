package com.syntax.class03;

public class Task07may22 {
	public static void main(String[] args) {
		int a = 7;
		a += 500;
		a += 200;
		int b = 8;
		b += 60;
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);
		int cake = 25;
		cake /= 7;
		System.out.println(cake);
		System.out.println("_________________________________________________________________");

		double expectedHoyrs = 45.5;
		double actualHours = 40.7;
		if (expectedHoyrs > actualHours) {
			System.out.println("You will love the course and you will succeed");
		} else {
			System.out.println("Maybe the course will be very hard for you! if you are not talanted in coding");
		}
	}
}