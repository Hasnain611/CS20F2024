/*
Program:QuadraticEquation.java      Date: 10,10,2024
Purpose: Calculate and display the roots of quadratic equations in java
School: CHHS
Course: Computer Science 20 
*/

package chapter4;
import java.util.Scanner;
public class QuadraticFormula {
	public static void main(String[] args) {
		
		Scanner Userinput = new Scanner(System.in);	
	
	
	
	
	
	System.out.println("Please enter a value for a: ");
	Double A =  Userinput.nextDouble();
	
	
	System.out.println("Please enter a value for b: ");
	Double B =  Userinput.nextDouble();
	
	System.out.println("Please enter a value for c: ");
   Double C =  Userinput.nextDouble();
	
	
	Double Root1;
	Double Root2;
	
	Double seperating = B * B - 4 * A * C;
	if(seperating <0) {
		System.out.println ("The roots you have entered are not real numbers");
	}
	
	if (seperating == 0) {
		System.out.println("The roots are equal");
		Root1 = -B / (2*A);
		Root2 = Root1;
		
	}
	else {
		System.out.println("Roots are real numbers");
		Root1 = (-B + Math.sqrt(seperating)) /(2*A);
		Root2 = (-B - Math.sqrt(seperating)) /(2*A);
	}
	
	System.out.println("Here is the roots");
	System.out.println("Root1: " + Root1);
	System.out.println("Root2 : " + Root2);
	
	
	
	
	}
}

/*
ScreenDump
Please enter a value for a: 
1
Please enter a value for b: 
2
Please enter a value for c: 
3
The roots you have entered are not real numbers
Roots are real numbers
Here is the roots
Root1: NaN
Root2 : NaN

*/

