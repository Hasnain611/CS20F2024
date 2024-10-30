/*
Program:PrimeNumber.java      Date: 30,10,2024
Purpose: enter any number and calculate that the given answer is prime number or not
School: CHHS
Course: Computer Science 20 
*/
package Mastery;
import java.util.Scanner;
public class PrimeNumber {
   public static void main(String[] args) {
     
   	
   	
   	
    Scanner scanner = new Scanner(System.in);
    int X;
	
	boolean isPrime=true;
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter any number:");
	
	int num=scan.nextInt();
        scan.close();
	
     for(int i=2;i<=num/2;i++)
	{
    
    	
    	 X=num%i;
	   if(X==0)
	   {
	      isPrime=false;
	    
	     
	   
	   }
	}
	
	
     if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }

}
/*
Enter any number:
6
6 is not a Prime Number 
*/