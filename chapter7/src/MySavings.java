import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        
        while (true) {
           
            System.out.println("1. Show total in bank");
            System.out.println("2. Add a penny");
            System.out.println("3. Add a nickel");
            System.out.println("4. Add a dime");
            System.out.println("5. Add a quarter");
            System.out.println("6. Take money out of bank");
            System.out.println("Enter 0 to quit");
            
          
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Exiting the application.");
                break;
            } else if (choice == 1) {
                System.out.println("Total in bank: $" + total);
            } else if (choice == 2) {
                total += 0.01;
                System.out.println("Added a penny.");
            } else if (choice == 3) {
                total += 0.05;
                System.out.println("Added a nickel.");
            } else if (choice == 4) {
                total += 0.10;
                System.out.println("Added a dime.");
            } else if (choice == 5) {
                total += 0.25;
                System.out.println("Added a quarter.");
            } else if (choice == 6) {
                System.out.print("Enter the amount to take out: $");
                double amountToRemove = scanner.nextDouble();
                if (amountToRemove <= total) {
                    total -= amountToRemove;
                    System.out.println("Removed $" + amountToRemove);
                } else {
                    System.out.println("Insufficient funds to remove that amount.");
                }
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        
        scanner.close();
    }
}

