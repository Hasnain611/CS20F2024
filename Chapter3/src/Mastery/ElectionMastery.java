package Mastery;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectionMastery
{

public static void main(String[] args)
{

Scanner userInput = new Scanner(System.in);

DecimalFormat deca = new DecimalFormat ("#.##");


System.out.print("How many votes did John get in New York this election? ");
int John_NY = userInput.nextInt();

System.out.print("How many votes did Eva get in New York this election? ");
int Eva_NY = userInput.nextInt();

System.out.println(" ");

System.out.print("How many votes did John get in New Jersey this election? ");
int John_NJ = userInput.nextInt();

System.out.print("How many votes did John get in New Jersey this election? ");
int Eva_NJ = userInput.nextInt();

System.out.println(" ");

System.out.print("How many votes did John get in Connecticut this election? ");
int John_Con = userInput.nextInt();

System.out.print("How many votes did John get in Connecticut this election? ");
int Eva_Con = userInput.nextInt();


System.out.println(" ");

System.out.println("Election Results for New York: ");
System.out.println("John: " + John_NY);
System.out.println("Eva: " + Eva_NY);
System.out.println(" ");

System.out.println("Election Results for New Jersey: ");
System.out.println("John: " + John_NJ);
System.out.println("Eva: " + Eva_NJ);
System.out.println(" ");

System.out.println("Election Results for New York: ");
System.out.println("John: " + John_Con);
System.out.println("Eva: " + Eva_Con);
System.out.println(" ");

int John_T = John_NY + John_NJ + John_Con;
int Eva_T = Eva_NY + Eva_NJ + Eva_Con;
int Total_V = John_T + Eva_T;

double John_Percantage = (double)John_T / (double)Total_V;
double Eva_Percantage = (double)Eva_T / (double)Total_V;

Eva_Percantage *= 100;
John_Percantage *= 100;


System.out.println("Candidate       Votes        Percentage ");
System.out.println("John:        " +    John_T + "           "  + deca.format(John_Percantage) +  "%");
System.out.println("Eva:      " +  Eva_T + "           "  + deca.format(Eva_Percantage) + "%");
System.out.println("TOTAL VOTES:   " + Total_V);


}

}