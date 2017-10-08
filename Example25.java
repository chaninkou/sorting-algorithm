package example25;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show how to compute the area created by four cities
*/
public class Example25
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//display that the coordinates need to be in a clockwise order
	    System.out.println("Please enter the coordinates in a clockwise order.");
		System.out.println("");
		
		// Ask the user to enter for the GPS coordinates of four cities in a clockwise order.
		System.out.print("Enter the GPS coordinates for the 1st city: ");
		double x1 = Math.toRadians(in.nextDouble());
        double y1 = Math.toRadians(in.nextDouble());
		
		System.out.print("Enter the GPS coordinates for the 2nd city: ");
		double x2 = Math.toRadians(in.nextDouble());
        double y2 = Math.toRadians(in.nextDouble());
		
		System.out.print("Enter the GPS coordinates for the 3rd city: ");
		double x3 = Math.toRadians(in.nextDouble());
        double y3 = Math.toRadians(in.nextDouble());
		
		System.out.print("Enter the GPS coordinates for the 4th city: ");
		double x4 = Math.toRadians(in.nextDouble());
        double y4 = Math.toRadians(in.nextDouble());
		
		System.out.println(" ");
		
		//Declare variables
        double distance;
		final double earthradius = 6371.01;
		double side1;
		double side2;
		double side3;
		double side4;
		double s;
		double s2;
		double areaOfTriangle1;
		double areaOfTriangle2;
		double area;
		double sidemiddle;
		
		//calculation
		side1 = (earthradius) * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)); 
		
		side2 = (earthradius) * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3)); 
		
		side3 = (earthradius) * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4)); 
		
		sidemiddle = (earthradius) * Math.acos(Math.sin(x3) * Math.sin(x1) + Math.cos(x3) * Math.cos(x1) * Math.cos(y3 - y1)); 
		
		side4 = (earthradius) * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1)); 
	
		s = ((side1 + side2 + sidemiddle)) / 2;
		
		s2 = ((side4 + side3 + sidemiddle)) / 2;
		
        areaOfTriangle1 = Math.sqrt(s2 * (s2 - sidemiddle) * (s2 - side4) * (s2 - side3));
		
		areaOfTriangle2 = Math.sqrt(s * (s - side1) * (s - side2) * (s - sidemiddle));
		
		area = areaOfTriangle1 + areaOfTriangle2;
		
		
	    //display the area as output rounded to three decimal places
		System.out.println("The area is: " + (Math.round(area * 1000) / 1000.0));
	} 
}