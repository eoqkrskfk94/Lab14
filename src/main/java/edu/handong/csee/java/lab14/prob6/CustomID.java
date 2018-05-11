package edu.handong.csee.java.lab14.prob6; //package name

public class CustomID extends Exception{ //declaration of CustomID class that inherits Exception class
	private String[] races = new String[] {"Vulcans", "Romulans", "Klingons"}; //declaration of String array race with such values
	private String name, race; //declaration of String variables name and race
	private int age, state = 0; //declaration of integer variables age and state with values of 0
	
	public void set_name(String name) throws Exception{ //declaration of set_name method that may throw exception
		
		if(name.length() < 5) { //carried out if the length of name is smaller than 5
			state = 0; //insert 0 into state value
			throw new Exception("Your name is short! Try again!"); //throws exception with such info
		}
		
		else { //carried out if other if statement is not carried out
			this.name = name; //insert the input name into the class variable name 
			System.out.println("The name is valid"); //print out info
			System.out.println("Name: " + this.name); //print out info (name)
			state++; //increment state by 1
		}
	}
	
	public void set_age(int age) throws Exception{ //declaration of set_age method that may throw exception
		
		if(age < 18) { //carried out if the value of age is smaller than 18
			state = 1; //insert 1 into state value
			throw new Exception("Your age is too young! Try again!"); //throws exception with such info
		}
		
		else { //carried out if other if statement is not carried out
			this.age = age; //insert the input age into other class variable age
			System.out.println("The age is valid"); //prints out the info
			System.out.println("Age: " + this.age); //prints out the info (age)
			state++; //increment state value by 1
		}
	}
	
	public void set_race(String race) throws Exception{ //declaration of set_race method that may throw exception
		for(int i = 0; i < races.length ; i++) { //loops continuously if  i is smaller than the length of array races (i is increment by 1 every loop) 
			if(races[i].equals(race)) { //carried out if the input race string value is the same with the string value of races[i]
				this.race = races[i]; //insert races[i] value into the class variable race
				System.out.println("The race is valid"); //prints out info
				System.out.println("Race: " + this.race); //prints out info (race)
				state = 0; //insert 0 into the value of state
				return; //returns (end the method)
			}
		}
		
		state = 2; //insert 2 into the value of state
		throw new Exception("Try again!"); //throws an exception with such info
			
		}
	
	public int getState() { //declaration of getState method
		return this.state; //returns the value of class variable state
	}
	}

