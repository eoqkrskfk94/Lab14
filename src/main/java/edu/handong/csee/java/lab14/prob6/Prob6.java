package edu.handong.csee.java.lab14.prob6; //package name
import java.util.Scanner; //import Scanner class from java utility

public class Prob6 { //main class

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // //initiate a scanner instance from scanning the inputs
		String race, name; //declaration of String variable race and name
		int age; //declaration of integer variable age
		CustomID object = new CustomID(); //initiation of object of CustionID class
		boolean repeat = true; //declaration of boolean variable repeat with value true
		
		
		while(repeat) { //repeats the loop until repeat value becomes false
			
			try { //try block to handle exceptions
				if(object.getState() == 0) { //carried out if the returned value of getState method of object is 0
					System.out.print("Enter your name: "); // prints out info
					name = input.nextLine(); //insert the input value to name
					object.set_name(name); //run set_name method of object with a parameter name value
				}
				else if(object.getState() == 1) { //carried out if the returned value of getState method of object is 1
					System.out.print("Enter your age: "); //prints out info
					age = input.nextInt(); //insert the input value to age
					input.nextLine(); //erase buffer
					object.set_age(age); //run set_age method of object with a parameter age value
				}
				
				else if(object.getState() == 2) { //carried out if the returned value of getState method of object is 2
					System.out.print("Enter your race: "); //prints out info
					race = input.nextLine(); //insert the input value to race
					object.set_race(race); //run set_race method of object with a parameter race value
				}
			}
			catch(Exception e) { //catches if exception is thrown
				System.out.println(e.getMessage()); //prints out the error message
				continue; //continues the loop
			}
		}
		
	}

}
