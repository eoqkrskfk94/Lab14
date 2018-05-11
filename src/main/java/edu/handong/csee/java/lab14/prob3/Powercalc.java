package edu.handong.csee.java.lab14.prob3; //package name

public class Powercalc { // declaration of Powercalc class
	
	public long power(int n, int p) throws Exception { //declaration of method that may throw exception
		
		long result = 0; //declaration of long variable result with a value of 0
		
		result = (long)Math.pow(n,p); //insert the calculated value to result 
		
		if(n < 0 || p < 0) // if statement is carried out if n is smaller than 0 or if p is smaller than 0
			throw new Exception("n or p should not be negative."); //throws exception if the above if statement is carried out
		
		if(n == 0 && p == 0) // if statement is carried out if n is 0 and p is 0 
			throw new Exception("n and p should not be zero."); //throws exception if the above if statement is carried out

		
		return result; //returns the value of result
	}

}
