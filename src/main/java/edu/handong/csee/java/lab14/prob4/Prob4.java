package edu.handong.csee.java.lab14.prob4; //package name
import java.util.Scanner; //import Scanner class of java utility

public class Prob4 { //declaration of main class

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //initiate a scanner instance from scanning the inputs
		int num; //declaration of integer variable num
		Boundary array = new Boundary(); // declaration of array of class Boundary
		boolean repeat = true; //declaration of boolean variable repeat with a value true
		
		while(repeat) { //continues the loop if repeat is true
			
			try { //try block to handle exception
				System.out.print("\nEnter an Integer: "); //prints out info
				num = input.nextInt(); //insert the input value to num
				array.receive(num); // run receive method of instance array
			}
			catch(ArrayIndexOutOfBoundsException e) { //catches if the exception is thrown
				System.out.println("Invalid array index access!"); //prints out the info (error message)
				repeat = false; //put false into repeat
			}
		}

	}

}
