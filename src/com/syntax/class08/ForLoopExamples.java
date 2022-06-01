package com.syntax.class08;
public class ForLoopExamples {
	public static void main(String[] args) {
		// print  numbers from 1 to 90
		for(int i=1; i<=90; i++) {System.out.print(i+" ");}
		System.out.println("");
		
		// 60 to 10
		for (int i=60; i>=10; i--) {System.out.print(i+" ");}
		System.out.println("");
		for (int i=20; i>=2; i-=2) {System.out.print(i+" ");}
		System.out.println("");
		int a=20;
		while(a>=2) {System.out.print(a+" "); a-=2;}
	}
}