/*
Program:coursegrades.java      Date: 18-12-2024
Purpose: to calculate the grades of students,their average grade
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner;

public class CourseGrades {

    public static void main(String[] args) {
        
        
        GradeBook gradeBook = new GradeBook();
        
        
        gradeBook.getGrades();
        
        
        gradeBook.showGrades();
        
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter student number (1-12) to get their average grade: ");
        int studentNumber = scanner.nextInt();
        
               if (studentNumber >= 1 && studentNumber <= 12) {
            System.out.println("The average grade for student " + studentNumber + " is: " + gradeBook.studentAvg(studentNumber));
        } else {
            System.out.println("Invalid student number. Please enter a number between 1 and 12.");
        }
        
        
        System.out.print("\nEnter test number (1-5) to get its average grade: ");
        int testNumber = scanner.nextInt();
        
      
        if (testNumber >= 1 && testNumber <= 5) {
            System.out.println("The average grade for test " + testNumber + " is: " + gradeBook.testAvg(testNumber));
        } else {
            System.out.println("Invalid test number. Please enter a number between 1 and 5.");
        }
        
        
        scanner.close();
    }
}

class GradeBook {
   
    private int[][] grades = new int[12][5];
    
    
    private Scanner scanner = new Scanner(System.in);
    
    
    public void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Test " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
    }
    
   
    public void showGrades() {
        System.out.println("\nGrades for the class:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public double studentAvg(int studentNumber) {
        int studentIndex = studentNumber - 1;  
        int total = 0;
        for (int j = 0; j < grades[studentIndex].length; j++) {
            total += grades[studentIndex][j];
        }
        return total / 5.0;  
    }
    
   
    public double testAvg(int testNumber) {
        int testIndex = testNumber - 1;  
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i][testIndex];
        }
        return total / 12.0; 
    }
}

