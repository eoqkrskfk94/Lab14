package edu.handong.csee.java.lab14.prob1; //package name

public class SpeedLimiter { // declaration of SpeedLimiter class
	private int speed = 0; // declaration of private integer variable speed with the value of 0
	private int limit = 0; // declaration of private integer variable speed with the value of 0


	public SpeedLimiter(int limit, int speed) { // declaration of SpeedLimiter constructor
		this.speed = speed; //insert the parameter value of speed into the variable speed of the class
		this.limit = limit; //insert the parameter value of limit into the variable limit of the class
	}



	public void warnSpeedLimit() { //declaration of warnSpeedLimit method

		try { // try block to handle exception
			if(this.speed > this.limit) //runs if statement if the speed is bigger than the limit
				throw new Exception("Speed Limit " + this.limit + "Km exceeded!"); //throws an exception with the info

			System.out.println("You are a law abiding citizen!"); //prints out

		}

		catch(Exception e) { //catches the exception if an exception is thrown

			System.out.println(e.getMessage()); //prints out the error of e
			System.out.println("You are being fined."); //prints out the info
		}
		System.out.println("Your current speed: " + this.speed); // prints out the info
	}



}




