package src.Mastery;

/*
Program:PrimeNumber.java      Date: 29,10,2024
Purpose: enter any prime number and identify whether they are correct of false
School: CHHS
Course: Computer Science 20 
*/
import java.util.Scanner;
public class PrimeNumberModification {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter any number:");
	       
	        int num = scan.nextInt();
	   
	       
	        if (isPrime(num)) {
	            System.out.println(num + " is a Prime Number");
	            
	        } else {
	            System.out.println(num + " is not a Prime Number");
	        }
	    }
	
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
/*
Enter any number:
4
4 is not a Prime Number
*/