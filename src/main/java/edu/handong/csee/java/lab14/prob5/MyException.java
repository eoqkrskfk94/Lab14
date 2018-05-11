package edu.handong.csee.java.lab14.prob5; //package name

public class MyException extends Exception{ //declaration of MyException class the inherits Exception class
	
	private String message = null; //declaration of String variable message with null value
	
	public MyException() { //declaration of constructor
		super(); //run super class constructor
	}
	
	public MyException(String message) { //declaration of MyException constructor with a parameter of String message
		super(message); //run super class constructor with message as parameter
		this.message = message; //insert the parameter message value to the message of class
	}
	
	public MyException(Throwable cause) { //declaration of MyException constructor with a parameter of Throwable cause (Throwable is upper class of exception class)
		super(cause); //run super class constructor with cause as paramter
	}
	
	public String toString() { //declaration of toString method
		return message; //returns the value of message
	}

}
