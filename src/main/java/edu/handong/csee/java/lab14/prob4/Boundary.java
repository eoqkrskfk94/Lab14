package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	private int[] array = new int[5];
	private int count = 0;
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{
		
		int i = count;
		array[i] = num;
		count++;
		System.out.printf("array[" + i + "] = " + num);
	}

}
