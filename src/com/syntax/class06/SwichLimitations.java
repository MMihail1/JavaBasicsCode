package com.syntax.class06;
public class SwichLimitations {
	public static void main(String[] args) {
	// switch can work with byte, short, int, char,String
// can't work with double float long boolean
		
		double price=10;
		switch (price)  //Compiler error CE - can't switch on a value of type double.
	boolean hungry=true;
		switch (hungry) - error
		
		//switch has a operators limitations
		// can't use logical operators inside switch
		
		char choice='Y';
		String meaning;
		switch(choice) {
		case 'Y' || 'y' // can't use ||
		
		}
		
		
		
	}
}