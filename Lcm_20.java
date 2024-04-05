package com.web.java;

import java.util.Scanner;

public class Lcm_20 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter first positive number:");
	        int num1 = Math.abs(scanner.nextInt()); // Absolute value to handle negative input

	        System.out.println("Enter second positive number:");
	        int num2 = Math.abs(scanner.nextInt()); // Absolute value to handle negative input

	       
	        int lcm = calculateLCM(num1, num2);

	       
	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

	        scanner.close();
	    }

	   
	    public static int calculateLCM(int a, int b) {
	        return (a * b) / calculateGCD(a, b);
	    }

	   
	    public static int calculateGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
}
