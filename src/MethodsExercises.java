import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args) {

        // 1.
        addition(6, 3);
        subtraction(6, 3);
        multiplication(6, 3);
        division(6, 3);
        modulus(6, 3);

        // 2.
        getInteger(1, 10);

        // 3.
//        getFactorial();

        // 4.
        rollDice();
    }


    // 1.
    public static void addition(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }
    public static void subtraction(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }
    public static void multiplication(int num1, int num2) {
        int result = 0;
        for (int i = 1; i <= num2; i++) {
            result += num1;
        }
        System.out.println("Multiplication: " + result);
    }
    public static void division(int num1, int num2) {
        System.out.println("Division: " + (num1 / num2));
    }
    public static void modulus(int num1, int num2) {
        System.out.println("Modulus: " + (num1 % num2));
    }

    // 2.
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10:  ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Done");
            return userInput;
        } else {
            getInteger(min, max);
        }
        return userInput;
    }

    // 3.
    public static void getFactorial() {
        boolean keepGoing = true;
        while (keepGoing){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10:  ");
            int userNum = sc.nextInt();
            for (int i = 1; i >= userNum; i--) {
                System.out.println(i);
            }
            System.out.println(userNum + "! = ");

            System.out.println("Would you like to continue? [y/n]");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equalsIgnoreCase("y")) {
                System.out.println("if");
                keepGoing = true;
            } else {
                System.out.println("else");
                keepGoing = false;
            }
        }

    }

    // 4.
    public static void rollDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides to your dice?");
        int sidesOfDice = sc.nextInt();
        System.out.println("You have chosen two " + sidesOfDice + " sided dice!");
        System.out.println("Would you like to roll the dice? [y/n]");
        String rollDice = sc.next();

        if (rollDice.equalsIgnoreCase("y")) {
            System.out.println("You rolled a " + ((int)Math.floor(Math.random()*(sidesOfDice-1+1)+1)) + " and a " + ((int)Math.floor(Math.random()*(sidesOfDice-1+1)+1)));
        } else {
            System.out.println("Okay goodbye!");
        }
    }

    // 5.

}