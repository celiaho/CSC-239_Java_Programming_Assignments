package Topic_1;
/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Sun Feb 11 2024
 *  File : Topic 1 Lab - Are You Old Enough?
 *  Description : Create a program that asks the user for the month, the day, and the year of their birthday.  Validate that these dates are reasonable.  

If the user is (TODAY):
    21 or older print "you are old enough to gamble at a casino"
    18 or older print "you are old enough to be treated as an adult"
    16 or older print "you are old enough to know better"

Leap year pseudocode (from Wikepedia): 
if (year is not divisible by 4) then (it is a common year)
else if (year is not divisible by 100) then (it is a leap year)
else if (year is not divisible by 400) then (it is a common year)
else (it is a leap year)
 * ******************************************/

import java.util.Scanner;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

public class OldEnough {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Allow keyboard input

    // Ask user for the current date
    System.out.println("What is today's date? Enter digits for month, day, and year separated by spaces (MM DD YYYY): ");
    int 
      currentMonth = input.nextInt(),
      currentDay = input.nextInt(),
      currentYear = input.nextInt();
    
    // Create a program that asks the user for the month, the day, and the year of their birthday.
    System.out.println("What is your birthday? Enter digits for month, day, and year separated by spaces (MM DD YYYY): ");

    // Save user input to variables
    int 
      birthMonth = input.nextInt(),
      birthDay = input.nextInt(),
      birthYear = input.nextInt();

    // Calculate current age
    int 
      ageYears = currentYear - birthYear,
      currentAge = 0;

    if (currentMonth < birthMonth)
      currentAge = ageYears - 1;
    else if (currentMonth > birthMonth) 
      currentAge = ageYears;
    else {
      if (currentDay > birthDay) 
        currentAge = ageYears;
      else
        currentAge = ageYears - 1;
    }

    System.out.println("Your age TODAY is " + currentAge + ".");  // Test that currentAge is calculated properly - OK

    // Validate that these dates are reasonable. 
    // If the user is (TODAY) 21 or older 
    if (currentAge >= 21)
      // print "you are old enough to gamble at a casino"
      System.out.println("You are old enough to gamble at a casino.");
    // If the user is (TODAY) 18 or older
    if (currentAge >= 18)
      // print "you are old enough to be treated as an adult"
      System.out.println("You are old enough to be treated as an adult.");
    // If the user is (TODAY) 16 or older
    if (currentAge >= 16);
      // print "you are old enough to know better"
      System.out.println("You are old enough to know better.");

    // Attempt #1 at calculating age:
    // LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);  // Reference source: https://stackoverflow.com/questions/1116123/how-do-i-calculate-someones-age-in-java
    // System.out.println(birthDate);   // Test to check that birthDate saved correctly

    // LocalDate currentDate = java.time.LocalDate.now();
    // System.out.println(currentDate);    // Test to check that currentDate saved correctly

    // This does not work
    /* 
    int[] temp = (string)currentDate.split("-");

    int currentYear = Int.parseInt(temp[0]);
    int currentMonth = Int.parseInt(temp[1]);
    int currentDay = Int.parseInt(temp[2]);
    System.out.println(currentYear + currentMonth + currentDay);

    // System.out.println("Current age is " + ((Period.between(birthDate, currentDate).getYears())));  // ***THIS IS WRONG
    */

    
    /*
    *  Leap year pseudocode (from Wikepedia): 
    *    if (year is not divisible by 4) then (it is a common year)
    *    else if (year is not divisible by 100) then (it is a leap year)
    *    else if (year is not divisible by 400) then (it is a common year)
    *    else (it is a leap year)
    */
    // (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
  }

}