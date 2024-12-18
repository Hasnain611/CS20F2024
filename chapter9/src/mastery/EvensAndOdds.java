/*
Program; evenandodds.java     Date: 18-12-2024
Purpose: to check the remainder dividing by 2
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Random;

public class EvensAndOdds {
    public static void main(String[] args) {
        
       
        Random random = new Random();

                System.out.print("odd: ");
        
                for (int i = 0; i < 25; i++) {
            int num = random.nextInt(100); 
            
                       if (num % 2 != 0) {
                System.out.print(num); 
                               System.out.print(", ");    
                               if (i < 24) {

                }
            }
        }

       
        System.out.println(); 

               System.out.print("even: ");
        
               for (int i = 0; i < 25; i++) {
            int num = random.nextInt(100); 
            
         
            if (num % 2 == 0) {
                System.out.print(num); 
                               if (i < 24) {
                    System.out.print(", ");
                }
            }
        }
    }
}

