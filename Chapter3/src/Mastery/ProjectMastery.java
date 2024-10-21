/*

Program:projectMastery.java      Date: 10,10,2024

Purpose: calculate time spend designing,coding,debugging and testing project application

School: CHHS
Course: Computer Science 20  

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectMastery {

public static void main(String[] args)
{
Scanner userInput = new Scanner(System.in);

NumberFormat nf = NumberFormat.getPercentInstance();

System.out.print("How much time was spent designing project application? ");
double designing = userInput.nextInt();

System.out.print("How much time was spent coding project application? ");
double coding = userInput.nextInt();

System.out.print("How much time was spent debugging project application? ");
double debugging = userInput.nextInt();

System.out.print("How much time was spent testing project application? ");
double testing = userInput.nextInt();

System.out.print(" ");

double total_T = testing + debugging + coding + designing;

double design_P = designing / total_T;
double coding_P = coding / total_T;
double debug_P = debugging / total_T;
double testing_P = testing / total_T;

System.out.println("Task % Time");
System.out.println("Debugging" + nf.format(design_P));
System.out.println("Coding" + nf.format(coding_P));
System.out.println("Designing" + nf.format(debug_P));
System.out.println("Testing" + nf.format(testing_P));

}
}


/*
 How much time was spent designing project application? 15
How much time was spent coding project application? 23
How much time was spent debugging project application? 51
How much time was spent testing project application? 63
 Task % Time
Debugging10%
Coding15%
Designing34%
Testing41%

 
 */

