/*

Program:ProjectMastery.java      Date: 10,10,2024

Purpose: enter a 3 digit code to identify its 100th,10th and one place number

School: CHHS
Course: Computer Science 20  

*/
package Mastery;

import java.util.Scanner;

public class DigitsMastery {

	public static void main(String[] args) {

		
		
		{
			
		       Scanner input = new Scanner(System.in);
		       int hundreds;
		       int tens;
		       int ones;
		       
		       System.out.println("Please enter a 3 digit number: ");
		       int number = input.nextInt();
		       hundreds = number / 100;
		       System.out.println(" Hundreds place digit: " + hundreds );
		       tens = (number - (hundreds*100)) / 10; 
		       System.out.println(" Tens place digit: " + tens );
		  
		       ones = (number - (tens*10) - (hundreds*100));  
		       System.out.println(" Ones place digit: " + ones );  
		}
		}


	}



/*

Please enter a 3 digit number: 
234
 Hundreds place digit: 2
 Tens place digit: 3
 Ones place digit: 4 

*/
