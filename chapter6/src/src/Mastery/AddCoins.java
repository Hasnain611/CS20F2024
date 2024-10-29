/*
Program:AddCoins.java      Date: 29,10,2024
Purpose: enter values of number of pennies and calculate it into total amount of dollar 
School: CHHS
Course: Computer Science 20 
*/
package src.Mastery;
import java.util.Scanner;
public class AddCoins
{
	
	
	
 public static void main(String[] args)
 {
     Scanner scanner = new Scanner(System.in);
   
   
     System.out.print("Enter the number of pennies: ");
     int PENNIES = scanner.nextInt();
   
   
     System.out.print("Enter the number of nickels: ");
     int NICKELS = scanner.nextInt();
   
   
  
     System.out.print("Enter the number of dimes: ");
     int DIMES = scanner.nextInt();
   
   
  
     System.out.print("Enter the number of quarters: ");
     int  QUARTERS = scanner.nextInt();
   
   
     System.out.println("Total amount: " + DOLLARamount(PENNIES, NICKELS, DIMES, QUARTERS));
   
   
   
  }
 public static String DOLLARamount (int PENNIES, int NICKELS, int DIMES, int QUARTERS)
 {
     double SUMTOTAL = PENNIES * 0.01 + NICKELS * 0.05 + DIMES * 0.10 + QUARTERS * 0.25;
   
   
     return String.format("$%.2f", SUMTOTAL);
 }
}

/*
Enter the number of pennies: 1
Enter the number of nickels: 2
Enter the number of dimes: 3
Enter the number of quarters: 4
Total amount: $1.41

*/


