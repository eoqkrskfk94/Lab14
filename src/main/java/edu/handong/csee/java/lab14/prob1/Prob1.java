package edu.handong.csee.java.lab14.prob1; //package name
import java.util.Scanner; // import scanner class from java utility
import java.util.Random; //import random class from java utility

public class Prob1 { //main class

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //initiate a scanner instance from scanning the inputs
		Random rand = new Random(); //initiate a random instance for using random
		
		int limit = 0, speed = 0; //declaration of integer variables limit and speed with value of 0
		
		System.out.print("Set the speed limit, officer: "); //print out the info
		limit = input.nextInt(); //insert the input value to limit
		speed = rand.nextInt(101); //insert the random number (from 0 to 100) into speed
		
		SpeedLimiter limiter = new SpeedLimiter(limit, speed); //initiate limiter instance of SpeedLimiter class
		
		limiter.warnSpeedLimit(); //run warnSpeedLimit method of limiter instance
	}

}
