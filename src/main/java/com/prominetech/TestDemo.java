package com.prominetech;

import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		
		if (a > 0 && b > 0) {
		
			return a + b;
		}
	 else {  
		throw new IllegalArgumentException("Both parameters must be positive!");
	
	}
}
	public int randomNumberSquared() {
	//	int randomNumber = getRandomInt();
	//	int numberSq  = randomNumber * randomNumber; 
			
	//return numberSq;
		 return  getRandomInt() * getRandomInt();
	}

		
		public int getRandomInt() {

	    Random random = new Random();

	    return random.nextInt(10) + 1;

	}
		
	 public double calculateAverage(int[] numbers) {
		 if (numbers == null || numbers.length == 0) {


			 
		 }
		 
		 double sum = 0;
		 for (int num : numbers) {
			 sum += num;
			 
		 }
	 return sum / numbers.length;
	 }
		
	}