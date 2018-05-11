package edu.handong.csee.java.lab14.prob4; //package name

public class Boundary { //declaration of class Boundary
	private int[] array = new int[5]; //declaration of integer array with the size of 5
	private int count = 0; //declaration of integer variable count with a value of 0
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{ 
		//declaration of a method which may throw an exception (exception is thrown if the array index is out of bounds)
		
		int i = count; // declaration of integer variable i 
		array[i] = num; // insert the value of num into ith array
		count++; //increment count by 1
		System.out.printf("array[" + i + "] = " + num); //prints out the info
	}

}
