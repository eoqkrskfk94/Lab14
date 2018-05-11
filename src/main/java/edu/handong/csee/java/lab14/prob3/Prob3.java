package edu.handong.csee.java.lab14.prob3;  //package name
import java.util.Scanner; // import Scanner class from java utility

public class Prob3 { //declaration of main class

	public static void main(String[] args) {
		
		Powercalc my_calculator = new Powercalc(); //initiate an instance my_calculaotr of Powercalc class
		Scanner input = new Scanner(System.in); //initiate a scanner instance from scanning the inputs
		
		while(input.hasNextInt()) { //continues the loop if the inputs are integers
			int n = input.nextInt(); //insert the first input value to n
			int p = input.nextInt(); //insert the second input value ot p
			
			try { //try block to handle exception
				System.out.println(my_calculator.power(n, p)); //prints out info
			} catch (Exception e) { // catches if an exception is thrown
				System.out.println(e); //prints out the error message
			}
		}

	}

}
