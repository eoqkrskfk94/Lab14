package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		Boundary array = new Boundary();
		boolean repeat = true;
		
		while(repeat) {
			
			try {
				System.out.print("\nEnter an Integer: ");
				num = input.nextInt();
				array.receive(num);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				repeat = false;
			}
		}

	}

}
