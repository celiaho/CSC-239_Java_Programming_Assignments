package Topic_1;
/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Sat Feb 10 2024
 *  File : Topic 1 Lab - Guess the Secret Number
 *  Description : Create a program that uses Math.random to generate a number between 1 and 100
 *  (int)(Math.random() * 100) + 1;
 *  That is the SECRET_NUMBER.
 *  Ask the user to guess the secret number. If they guess too low, print too low. If too high, 
 *  print too high. If just right print BINGO. Allow for multiple guesses. (ONLY 1 SECRET_NUMBER)
 *  Print how many guesses it took for the user to guess the number
 * ******************************************/

 import java.util.Scanner; 	// Import java.util package for Scanner
 import java.lang.Math;      // Import for Math.random method 
 
 public class SecretNumber {
 
   public static void main(String[] args) {
       
       int 
        SECRET_NUMBER = 1 + (int)(Math.random() * 100),  // Generate a random integer between 1 and 100 and store to constant SECRET_NUMBER
        guess = 0,          // Initialize variable to store user's guesses
        guessCounter = 0;   // Initialize variable to store count of guesses

       // System.out.println(secretNumber);   // Test that SECRET_NUMBER generated correctly

       Scanner scanner = new Scanner(System.in);  // Create a scanner to read keyboard input

        // Ask the user to guess the secret number.
        System.out.print("Guess the secret number (It's between 1 and 100): ");

        while (guess != SECRET_NUMBER) {   // Allow for multiple guesses. (ONLY 1 SECRET_NUMBER)
          guess = scanner.nextInt();       // Store user input in variable "guess"

          guessCounter++;       // Add 1 to the guessCounter variable

         // If they guess too low, print too low.
         if (guess < SECRET_NUMBER)
           System.out.print("\nToo low, try again: ");
         // If too high, print too high. 
             else if (guess > SECRET_NUMBER)
               System.out.print("\nToo high, try again: ");
         // If just right print BINGO.
                 else
                 System.out.print("BINGO\n");
        }
      // }
 
     // Print how many guesses it took for the user to guess the number
     System.out.println("Number of guesses it took you: " + guessCounter);
 
   }
 
 }