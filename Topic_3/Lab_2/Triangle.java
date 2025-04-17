/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Tue Feb 27 2024
 *  File : Triangle.java
 *  Description :  	
 *  Triangle 	
- 	base: double 	base of triangle > 0, default to 1 if not
- 	height: double 	height of triangle > 0, default to 1 if not
+ 	Triangle() 	default constructor: base of 2, height of 1
+ 	Triangle(base: double, height: double) 	constructor with base and height
+ 	setBase(base:double): void 	base > 0; default to 1 if not
+ 	setHeight(height: double): void 	height > 0; default to 1 if not
+ 	getBase(): double 	
+ 	getHeight(): double 	
+ 	area(): double 	1/2 base * height
+ 	toString(): String 	 returns a string in format of: [base, height]

Create the Triangle class in a file called Triangle.java

Create a TestTriangle class in a file called TestTriangle.java -

TestTriangle should instantiate:

    1 triangle using the default constructor
    2 triangles using the multi-argument constructor,  one of them should have a base or height that is less than zero
    an array of 3 triangles.

Display the Triangles using the  toString method, and display the area of all the triangles. 

ZIP your project (NO RAR or 7ZIP or other NON-ZIP formats accepted!) and upload here.
 *  Due: Friday, March 1, 2024, 11:59 PM 
 * ******************************************/

// Create the Triangle class in a file called Triangle.java
public class Triangle {
  private double 
    base = 1,
    height = 1;


// Create a TestTriangle class in a file called TestTriangle.java - DONE

  public static void main(String[] args) {
    /*
    TestTriangle should instantiate:
    
        1 triangle using the default constructor
        2 triangles using the multi-argument constructor,  one of them should have a base or height that is less than zero
        an array of 3 triangles.
    
    Display the Triangles using the  toString method, and display the area of all the triangles. 
    */
  }

  //Default constructor
  public Triangle() {
    base = 2;
    height = 1;

    // this(2,1);   // This line can replace the two above. It means: Call a constructor of this class (base, height)
  }

  // Multi-argument constructor
  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;

    if (base <=0 )
      this.base = 1;

    if (height <=0 )
    this.base = 1;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }

  public double area() {
    return (base / 2) * height;
  }

  @Override
  public String toString() {
    return "Triangle [base=" + base + ", height=" + height + ", Area: " + area() +"]";
  }

}