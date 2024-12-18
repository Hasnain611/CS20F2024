import java.util.Scanner;

class Num {
    private int number;

    
    public Num(int number) {
        this.number = number;
    }


    public int getOnes() {
        return number % 10;
    }

    
    public int getTens() {
        return (number / 10) % 10;
    }

    public int getHundreds() {
        return (number / 100) % 10;
    }


    public int getWhole() {
        return number;
    }
}

public class DigitExtractor {

    public static void displayMenu() {
        System.out.println("show (W)hole number.");
        System.out.println("show (O)nes number.");
        System.out.println("show (T)ens number.");
        System.out.println("show (H)undreds place number.");
        System.out.println("(Q)uit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        Num numObj = new Num(number);


        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            char choice = scanner.next().toLowerCase().charAt(0);

      
            if (choice == 'w') {
                System.out.println("The whole number is: " + numObj.getWhole());
            } else if (choice == 'o') {
                System.out.println("The ones digit is: " + numObj.getOnes());
            } else if (choice == 't') {
                System.out.println("The tens digit is: " + numObj.getTens());
            } else if (choice == 'h') {
                System.out.println("The hundreds place digit is: " + numObj.getHundreds());
            } else if (choice == 'q') {
                System.out.println("Goodbye!");
                break; 
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}

