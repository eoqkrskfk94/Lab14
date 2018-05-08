package edu.handong.csee.java.lab14.prob2; //package name
import java.util.*; //import all the classes of java utility

public class In_exception { //declaration of class In_exception

	private int x = 0, y = 0; // declaration of private integer variables x and y with values of 0
	
	public In_exception() { //declaration of In_exception constructor
		
	}
	
	public void errorDetect() { //declaration of public errorDetect class
		
		try {  // try block to handle exception
			Scanner input = new Scanner(System.in); //initiate a scanner instance from scanning the inputs
			System.out.print("X: "); //prints out info
			x = input.nextInt(); // insert the input value to x
			System.out.print("Y: "); //prints out info
			y = input.nextInt(); // insert the input value to y
			System.out.println("X/Y: " + this.x/this.y); // prints out the info
		}
		catch(ArithmeticException e) { //catch arithmetic exception type exception
			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); //prints out the error message if arithmetic exception is  carried out
		}
		catch(InputMismatchException e) { //catch input mismatch exception type exception
			System.out.println("java.util.InputMismatchException"); //print out the info if input mismatch exception is carried out
		}
		catch(Exception e) { //catch other exception types
			System.out.println("Some other exception has occurred: " + e.getMessage()); //prints out the error message if other kinds of exception is carried out
		}
	}
	
}
