/*
Program: palindrome.java      Date: 18-12-2024
Purpose: it can detect the sequence of letters,strings and numbers School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();  

       
        String cleanedInput = input.replaceAll("[\\W_]+", "").toLowerCase(); 
        
       
        if (isPalindrome(cleanedInput)) {  
            System.out.println("\"" + input + "\" is a palindrome.");
        } else if (!isPalindrome(cleanedInput)) {  
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

     
        scanner.close();
    }

   
    public static boolean isPalindrome(String str) {
        int left = 0;  
        int right = str.length() - 1;  

        
        while (left < right) {
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;  
            right--; 
        }
        
     
        return true;
    }
}

