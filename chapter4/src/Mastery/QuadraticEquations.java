/*

Program:QuadraticEquation.java      Date: 10,10,2024

Purpose: Calculate and display the roots of quadratic equations in java

School: CHHS
Course: Computer Science 20  

*/

package Mastery;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int a = input.nextInt();
      
        System.out.println("A = " + a);
        
        double disc, root1, root2;

        
        disc = (-a* -a -a * 1 * 2);

        if (disc < 0) { 
            System.out.println("There are no real roots since the discriminant is less than 0.");
        } else { 
            root1 = (-(-3) + Math.sqrt(disc)) / (2 * 1);
            root2 = (-(-3) - Math.sqrt(disc)) / (2 * 1); 

            if (root1 == root2) {
                System.out.println("The root of the quadratic equation is " + root1);
            } else { 
                System.out.println("The roots of the equation are " + root1 + " and " + root2);
            }
        }
        
    }
}


