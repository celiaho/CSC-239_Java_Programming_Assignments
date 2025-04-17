package Topic_1;
/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Wed Feb 07 2024
 *  File : Topic 1 Homework Assignment - Calculate Polygon Area
 *  Description : Create a program that calculates the area of a regular, n-sided polygon. The user
 *  must enter the number of sides of the polygon and the side length. The number of sides must be
 *  greater than 2, and the side length must be greater than zero. 
 *  The formula is:
 *  area = n * s2 
 *         ------
 *        4 tan(π/n)
 *  where n is the number of sides and s is the side length.
 * ******************************************/


import java.util.Scanner; 	// Import java.util package for Scanner
import java.lang.Math; 		// Import for java.lang.Math.tan() method per https://www.geeksforgeeks.org/java-math-tan-method-examples/

public class CalcPolygonArea {
     // Declare constant per https://www.javatpoint.com/java-constant
    private static final double PI = 3.14159;   // Declare & initialize constant variable pi
    
    // MAIN SECTION
    public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// 1. Read in number of sides (n) and side length (s)
		// Scanner numberOfSides = new Scanner(System.in);
		
		// Prompt the user to enter number of sides (n)
		System.out.print("This program calculates the area of a polygon when the number of sides and side length are specified. Enter the number of sides for this polygon (must be more than 2): ");
		// Read in number of sides  
		int numberOfSides = input.nextInt();
		// Validate that numberOfSides > 2
		while (numberOfSides <= 2) {
			System.out.print("Number of sides must be greater than 2. Try again: ");
			numberOfSides = input.nextInt();
		}
	
		// Prompt the user to enter side length (s)
		System.out.print("Enter a number for side length (must be more than 0): ");
		// Read in side length 
		int sideLength = input.nextInt();
		// Validate that sideLength > 0
		while (sideLength <= 0) {
			System.out.print("Side length must be greater than 0. Try again: ");
			sideLength = input.nextInt();
		}

    	// Compute area 
    	/* area = n * s2 
    		      ------
       			4 tan(π/n)
    	*/
    	double area = (numberOfSides * (sideLength * 2)) / (4 * (Math.tan(PI/numberOfSides)));	// ***Is this the correct way to denote tan?
    
    	// Optional: 4. Display the area
    	System.out.println("The area of a polygon with " + numberOfSides + " sides and a side length of " + sideLength + " is: " + area + "square units.");
	}
}