package edu.handong.csee.java.lab14.prob5; //package name
import java.util.Scanner; //import Scanner class of java utility

public class Prob5 { //declaration of main class

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //initiate a scanner instance from scanning the inputs
		try { //try block to handle exception
			String str = input.nextLine(); //insert the input value to declared String variable str
			Prob5.myTest(str); //run myTest method with the parameter of str 
		} 
		catch(MyException e) { //catches if exception is thrown
			System.out.println("Inside catch block: " + e); //prints of the error message
		}

	}

	static void myTest(String str) throws MyException{ //declaration of myTest that may thrown exception (implemented in MyException class)
		if(str.equals("null")) //if statement is carried out if str is null
			throw new MyException("String val is null"); //throws exception method of MyException

		else //carried if the if statement is not carried out
			System.out.println("String val is: " + str); //prints out the info
	}
}
