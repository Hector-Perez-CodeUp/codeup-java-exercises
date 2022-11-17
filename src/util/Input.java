package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // Main
    public static void main(String[] args) {

    }

    // Constructor
    public Input(Scanner myScanner) {
        this.scanner = myScanner;
    }

    public String getString() {
        System.out.println("Enter a string");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("\nEnter [y/n]");
        String userBool = scanner.next();
        return userBool.equalsIgnoreCase("y") || userBool.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.println("\nEnter a number between 1 - 10:");
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("Invalid input.");
            getInt(min, max);
            return 0;
        }
    }

    public int getInt() {
        System.out.println("\nEnter an integer");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max) {
        System.out.println("\nEnter an double between 1 - 10");
        double userDouble = scanner.nextDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Invalid input.");
            getDouble(min, max);
            return 0;
        }
    }

    public double getDouble() {
        System.out.println("Enter an number (double)");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }
}
