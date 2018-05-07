package edu.handong.csee.java.lab14.prob2;
import java.util.*;

public class In_exception {

	private int x = 0, y = 0;
	
	public In_exception() {
		
	}
	
	public void errorDetect() {
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("X: ");
			x = input.nextInt();
			System.out.print("Y: ");
			y = input.nextInt();
			System.out.println("X/Y: " + this.x/this.y);
		}
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Some other exception has occurred: " + e.getMessage());
		}
	}
	
}
