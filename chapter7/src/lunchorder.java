import java.util.Scanner;

class Food {
    private double price;
    private double fat;
    private double carbs;
    private double fiber;

    
    public Food(double price, double fat, double carbs, double fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    
    public double getPrice() {
        return price;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFiber() {
        return fiber;
    }
}

public class LunchOrder {
    public static void main(String[] args) {
       
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food frenchFries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        
        Scanner scanner = new Scanner(System.in);

        
        int numHamburgers = 0, numSalads = 0, numFries = 0, numSodas = 0;

        
        System.out.print("Enter number of hamburgers: ");
        numHamburgers = scanner.nextInt();
        System.out.println("Each hamburger has " + hamburger.getFat() + "g of fat, " + hamburger.getCarbs() + "g of carbs, and " + hamburger.getFiber() + "g of fiber.");

        
        System.out.print("Enter number of salads: ");
        numSalads = scanner.nextInt();
        System.out.println("Each salad has " + salad.getFat() + "g of fat, " + salad.getCarbs() + "g of carbs, and " + salad.getFiber() + "g of fiber.");

        
        System.out.print("Enter number of fries: ");
        numFries = scanner.nextInt();
        System.out.println("Each order of French fries has " + frenchFries.getFat() + "g of fat, " + frenchFries.getCarbs() + "g of carbs, and " + frenchFries.getFiber() + "g of fiber.");

        
        System.out.print("Enter number of sodas: ");
        numSodas = scanner.nextInt();
        System.out.println("Each soda has " + soda.getFat() + "g of fat, " + soda.getCarbs() + "g of carbs, and " + soda.getFiber() + "g of fiber.");

        
        double totalPrice = 0;

        if (numHamburgers > 0) {
            totalPrice += numHamburgers * hamburger.getPrice();
        }
        else if (numSalads > 0) {
            totalPrice += numSalads * salad.getPrice();
        }
        else if (numFries > 0) {
            totalPrice += numFries * frenchFries.getPrice();
        }
        else if (numSodas > 0) {
            totalPrice += numSodas * soda.getPrice();
        }

        
        System.out.printf("Your order comes to: $%.2f\n", totalPrice);

        
        scanner.close();
    }
}


