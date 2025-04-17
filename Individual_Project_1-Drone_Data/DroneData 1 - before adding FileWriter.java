/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Tue Feb 13 2024
 *  File : Topic 2 - Individual Project #1 - Drone Data
 *  Description : https://online.bhcc.edu/mod/assign/view.php?id=2160204
 * A drone is flown on a path across the White Mountains of New Hampshire. The drone handler needs to keep track of the following information: longitude,  latitude, and altitude.  

Create a program that will hold a multi-dimensional array of up to 50 points. Allow the user to enter points in different modes: either a single point or multiple points.  You should allow the user to quit entering points before reaching 50. Using separate methods, your program should determine:
    the distance between the start and the end position,
    the minimum altitude,
    the maximum altitude 
    the altitude range.
Make sure you output this information in the main method, not in your new methods.

You may use a class if you wish!

The formula for the great circle distance (in km) (to find out the distance between the start and end) is 
d = radius * arccos(sin(lat1)*sin(lat2)+cos(lat1)*cos(lat2)*cos(long2-long1))
where radius = 6371 km

Convert degrees (which lat and long are typically stored in) to radians using Math.toRadians method.  

Test Data (format: latitude, longitude, altitude): See "DroneCoordinates.txt" file.

This program demonstrates the following learning outcomes:
    Program creation and structure
    Program documentation
    Data input and output
    Method creation
    Array creation and utilization
    Algorithm design
 * ******************************************/

 import java.util.Scanner;   // Import to read from keyboard
 import java.io.File;        // Import to read from file
import java.io.FileNotFoundException;

public class DroneData {
  // METHOD DEFINITION SECTION
  // the distance between the start and the end position
  // The formula for the great circle distance (in km) (to find out the distance between the start and end) is 
  // d = radius * arccos(sin(lat1)*sin(lat2)+cos(lat1)*cos(lat2)*cos(long2-long1))
  // where radius = 6371 km
  static double distance() {
    return 800; // ***PLACEHOLDER CODE
  }

  // (For the following?) Convert degrees (which lat and long are typically stored in) to radians using Math.toRadians method.  
  // ??? DO I NEED TO CONVERT RADIANS TO KMS?
    static double minimumAltitude() {
      return 810; // ***PLACEHOLDER CODE
    }
  
    // the maximum altitude 
    static double maximumAltitude() {
      return 820; // ***PLACEHOLDER CODE
    }
  
    // the altitude range.
    static double altitudeRange() {
      return 830; // ***PLACEHOLDER CODE
    }
  
    
  // MAIN SECTION
  public static void main(String[] args) throws FileNotFoundException {
  // ***Create a multi-dimensional array of up to 50 points
  double[][] coordinates = new double[50][3];
  // ***Allow user to enter points in different modes: either a single point or multiple points.
  // Create a scanner to allow keyboard input
  Scanner input = new Scanner(System.in); 
  // Prompt user to enter points
  System.out.println("Enter your data points in the following format: longitude,latitude,altitude: ")
  // As long as user keeps entering data
  while(input.hasNextDouble()) {    // ??? IS DOUBLE THE RIGHT DATA TYPE?
    // Add data to DroneCoordinates.txt file
      // ??? HOW TO SAVE TO FILE?
    // coordinates[i][0] = input.nextDouble();  // ??? IS NEXTDOUBLE THE RIGHT DATA TYPE, OR SHOULD THIS BE A STRING?
  }
  // ***Allow user to quit entering points before reaching 50.

  // ***Using separate methods, output in main:
  // the distance between the start and the end position,
  System.out.println("Distance between start and end positions: " + distance() + " km");
  // the minimum altitude
  System.out.println("Minimum altitude: " + minimumAltitude() + " km");
  // the maximum altitude
  System.out.println("Maximum altitude: " + maximumAltitude() + " km");
  // the altitude range
  System.out.println("Altitude range: " + altitudeRange() + " km");

  // ***You may use a class
    // A class is a blueprint for creating objects
    // public class Main {
    // 	code
    // }

  // ***TEST CODE with test data given

}