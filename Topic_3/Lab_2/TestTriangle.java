/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Tue Feb 27 2024
 *  File : TestTriangle.java
 *  Description : Test file for Topic 3 Lab 2 file Triangle.java
 * ******************************************/

public class TestTriangle {

  public static void display(Triangle[] triangles) {
    for (Triangle t : triangles) {
      System.out.println(t);    // Same as "System.out.println(t.toString());"
    }
  }

  public static void main(String[] args) {
    
    // Instantiate 1 triangle using the default constructor
    Triangle triangle1 = new Triangle();

    /*
    // Test that data prints out correctly
    System.out.println("The base is " + triangle1.getBase());
    System.out.println("The height is " + triangle1.getHeight());
    System.out.println("The area is " + triangle1.area());
    */

    // Instantiate 2 triangles using the multi-argument constructor,  one of them should have a base or height that is less than zero
    Triangle triangle2 = new Triangle(-2, 3);

    Triangle triangle3 = new Triangle(3, 4);

    /*
    // Test that data prints out correctly
    System.out.println("The base is " + triangle2.getBase());
    System.out.println("The height is " + triangle2.getHeight());
    System.out.println("The area is " + triangle2.area());
    */

    // Instantiate an array of 3 triangles.
    Triangle[] triangles = new Triangle[3];

    triangles[0] = triangle1;
    triangles[1] = triangle2;
    triangles[2] = triangle3;
    
    // Display the Triangles using the toString method, and display the area of all the triangles.  
    display(triangles);
  }
}