/*
Program:GuessingGame.java      Date: 30,10,2024
Purpose: guess a number between 1 and 30 and calculates that is given answer right or wrong
School: CHHS
Course: Computer Science 20 
*/
package Mastery;
import java.util.Scanner;
public class GuessingGame {
   public static void main(String[] args) {
     
   	
   	
   	
    Scanner scanner = new Scanner(System.in);
       int choice;
        {
int guess  ;
int secretnumber = 19;
	
		Scanner input = new Scanner(System.in);
		
		
		
			System.out.println("Please guess the number, hint it is between 1-30 :  ");
						
			guess = input.nextInt();
			
				
				  while (guess != 0)
				  {
			          
			            if (guess == secretnumber)
			            {
			                System.out.println("You got the number correct!");
			            } else {
			                System.out.println("You've guessed it incorrectly. Please try again.");
			            }
						
					
		
			            System.out.println("Please guess the number, hint it is between 1-30 :  ");
						
						guess = input.nextInt();
						
			          
			        }
				  System.out.println("Game Over!");
        }
        
   }
}
/*
Please guess the number, hint it is between 1-30 :  
10
You've guessed it incorrectly. Please try again.
Please guess the number, hint it is between 1-30 :  
5
You've guessed it incorrectly. Please try again.
Please guess the number, hint it is between 1-30 :  
*/