/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Sat Feb 17 2024
 *  File : Lab - Functions and Arrays
 *  Description : Create a class that has
 *    - a method that creates random numbers between two values using the formula 
 *      (int)( Math.random()*(max-min+1)+min)
 *    - a method that fills an array of integers with random numbers
 *    - a method that returns the sum of an array of integers
 *    - a method that returns the minimum value of an array of integers
 *    - a method that returns the maximum value of an array of integers
 *    - a method that prints the values in an array using a foreach loop
 * 
 * In the main method, ask the user for the number of items to put into the array. Create an array
 * of that size.  Fill the array with random numbers. Calculate the sum, min, and max of the array.
 * Print the array. Print the sum. Print the min. Print the max.
 * ******************************************/

import java.util.Scanner;

public class FunctionsAndArrays {
  // METHOD DECLARATION SECTION
  // a method that creates random numbers between two values using the formula (int)( Math.random()*(max-min+1)+min)
  public static int randomNumber(int min, int max) {
    int randomNum = (int)(Math.random()*(max - min + 1) + min);
    return randomNum; 
  }
  
  // a method that fills an array of integers with random numbers
  public static void loadArray(int array[], int arraySize, int randomMin, int randomMax) {
    for (int i = 0; i < array.length; i++) {
      array[i] = randomNumber(randomMin, randomMax);
    }
  }

  // a method that returns the sum of an array of integers
  public static int sumArray(int array[]) {
    int sum = 0;

    for (int i = 0; i < array.length; i++)
      sum += array[i];

    return sum;
  }

  // a method that returns the minimum value of an array of integers
  public static int findMin(int array[]) {
    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min)
        min = array[i];
    }

    return min;
  }
  
  // a method that returns the maximum value of an array of integers
  public static int findMax(int array[]) {
    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max)
        max = array[i];
    }

    return max;
  }

  // a method that prints the values in an array using a foreach loop
  public static void printArray(int array[]) {
    for (int e : array) {
      System.out.println(e);
    }
  }

  // MAIN SECTION
  public static void main(String[] args) {
    int 
      randomMin = 0,
      randomMax = 100;
    
    // In the main method, ask the user for the number of items to put into the array. 
    System.out.println("How many items would you like to put into the array?" );
    
    // Make a scanner
      Scanner input = new Scanner(System.in); // Allow keyboard input

    // Save user input
    int arraySize = input.nextInt();
    
    // Create an array of that size.
    int[] intArray = new int[arraySize];  
    
    // Fill the array with random numbers. 
    loadArray(intArray, arraySize, randomMin, randomMax);
    
    // Calculate the sum, min, and max of the array. 
    sumArray(intArray);
    findMin(intArray);
    findMax(intArray);

    // Print the array. 
    System.out.println("The array is: ");
    printArray(intArray);
    
    // Print the sum. 
    System.out.println("The sum of this array is: " + sumArray(intArray));
    
    // Print the min. 
    System.out.println("The minimum value of this array is: " + findMin(intArray));
    
    // Print the max.
    System.out.println("The maximum value of this array is: " + findMax(intArray));
  }

}