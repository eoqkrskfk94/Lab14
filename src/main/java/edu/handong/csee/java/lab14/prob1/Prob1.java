package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner;
import java.util.Random;

public class Prob1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int limit = 0, speed = 0;
		
		System.out.print("Set the speed limit, officer: ");
		limit = input.nextInt();
		speed = rand.nextInt(101);
		
		SpeedLimiter limiter = new SpeedLimiter(limit, speed);
		
		limiter.warnSpeedLimit();
	}

}
