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

import java.util.Scanner;   // To read from keyboard
import java.io.File;        // To read from file
import java.io.FileNotFoundException;
// import java.io.FileWriter;  // To write to existing DroneCoordinates.txt file
// import java.io.IOException; // To enable FileWriter instance (object)


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

  // ***Create a multi-dimensional array of 20 rows with 3 elements each
  double[][] coordinates = new double[20][3];

  // ***Allow user to enter points in different modes: either a single point or multiple points.
  // Create a scanner to allow keyboard input
  Scanner input = new Scanner(System.in); 
  
  // Prompt user to enter points
  // System.out.println("Enter your data points in the following format (without quotation marks): \"longitude,latitude,altitude\": ");
  
  // As long as user keeps entering data...
  // while(input.hasNextLine()) {    // ??? IS DOUBLE THE RIGHT DATA TYPE?
    // Add data to DroneCoordinates.txt file
      // ??? HOW TO SAVE TO FILE?
    // coordinates[i][0] = input.nextDouble();  // ??? IS NEXTDOUBLE THE RIGHT DATA TYPE, OR SHOULD THIS BE A STRING?
  // ***Allow user to quit entering points before reaching 50.


    /* ***THIS WAS A MASSIVE FAIL.
    ***EXPERIMENT To write to existing DroneCoordinates.txt file (Reference source: https://www.programiz.com/java-programming/examples/append-text-existing-file)
    String path = System.getProperty("user.dir") + "\\src\\DroneCoordinates.txt";
    String testText = "\nAdded this text\n";
    String userDataPoint = scanner.nextLine();

    try {
      FileWriter fw = new FileWriter(path, true);
      fw.write(userDataPoint);
      fw.close();
    }
    catch(IOException e) {
    }
    // End experimental filewriting code 
    */

    // Read from file
    File file = new File("DroneCoordinates.tx");

    Scanner fileReader = new Scanner(file);

    // Read lines from a file with a while loop
    while (fileReader.hasNextLine()) {
        String aLine = scanner.nextLine();

        // Test code that line was read correctly
        System.out.println(aLine);

        // Split line by delimiter "," and save data to an array of strings called "temp"
        String[] temp = aLine.split(",");

        // Use Double method to convert elements to data type double & store in coordinates array
        coordinates[i][0] = Double.parseDouble(temp[0]);
        coordinates[i][1] = Double.parseDouble(temp[1]);
        coordinates[i][2] = Double.parseDouble(temp[2]);

        // Increment array
        i++;

        // TEST print out the longitudes
        System.out.println(temp[0]);
    }

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
}