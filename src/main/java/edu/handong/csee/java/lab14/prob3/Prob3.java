package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
		Powercalc my_calculator = new Powercalc();
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextInt()) {
			int n = input.nextInt();
			int p = input.nextInt();
			
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
